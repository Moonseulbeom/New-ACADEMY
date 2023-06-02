package kr.board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;

import kr.board.dao.BoardDAO;
import kr.board.vo.BoardVO;
import kr.controller.Action;
import kr.util.FileUtil;

public class UpdateAction implements Action{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//로그인 여부 체크
		HttpSession session = request.getSession();
		Integer user_num = (Integer)session.getAttribute("user_num");
		
		if(user_num==null) {//로그인 되지 않은 경우
			return "redirect:/member/loginForm.do";
		}
		
		//로그인 된 경우
		MultipartRequest multi = FileUtil.createFile(request); //이미 upload폴더에 들어가있음
		int board_num = Integer.parseInt(multi.getParameter("board_num"));
		String filename = multi.getFilesystemName("filename");
		
		BoardDAO dao = BoardDAO.getInstance();
		//수정전 데이터 반환
		BoardVO db_board = dao.getBoard(board_num);
		
		//로그인한 회원번호와 작성자 회원번호 일치 여부 체크
		if(user_num != db_board.getMem_num()) {
			//로그인한 회원번호와 작성자 회원번호 불일치
			FileUtil.removeFile(request, filename); //잘못 업로드된거 지우기
			return "/WEB-INF/views/common/notice.jsp";
		}
		
		//로그인한 회원번호와 작성자 회원번호가 일치
		BoardVO board = new BoardVO();
		board.setBoard_num(board_num);
		board.setTitle(multi.getParameter("title"));
		board.setContent(multi.getParameter("content"));
		board.setIp(request.getRemoteAddr());
		board.setFilename(filename);
		
		dao.updateBoard(board);
		
		//새 파일로 교체할 때 원래 파일 제거
		if(filename!=null) {
			FileUtil.removeFile(request, db_board.getFilename());
		}
		
		return "redirect:/board/detail.do?board_num="+board_num;
	}

}
