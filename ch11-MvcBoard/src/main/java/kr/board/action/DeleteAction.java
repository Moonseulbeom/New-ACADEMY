package kr.board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.board.dao.BoardDAO;
import kr.board.vo.BoardVO;
import kr.controller.Action;

public class DeleteAction implements Action{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//전송된 데이터 인코딩 처리
		request.setCharacterEncoding("utf-8");
		//전송된 데이터 반환
		int num = Integer.parseInt(request.getParameter("num"));
		String passwd = request.getParameter("passwd");
		
		BoardDAO dao = BoardDAO.getInstance();
		//비밀번호 일치 여부 확인을 위해 글 번호로 한건의
		//레코드를 반환받은 후 비밀번호 인증 작업 수행
		BoardVO db_board = dao.getBoard(num);
		boolean check = false;
		if(db_board!=null) {
			//비밀번호 인증
			check = db_board.isCheckedPassword(passwd);
		}
		
		if(check) {//비밀번호 일치
			//글 삭제
			dao.delete(num);
		}
		
		//UI 처리를 위해서 check 저장
		request.setAttribute("check", check);
		
		//JSP 경로 반환
		return "/WEB-INF/views/delete.jsp";
	}

}
