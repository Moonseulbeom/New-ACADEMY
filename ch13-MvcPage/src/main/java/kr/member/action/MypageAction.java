package kr.member.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.board.dao.BoardDAO;
import kr.board.vo.BoardVO;
import kr.controller.Action;
import kr.member.dao.MemberDAO;
import kr.member.vo.MemberVO;

public class MypageAction implements Action{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//로그인 여부 체크
		HttpSession session = request.getSession();
		Integer user_num = (Integer)session.getAttribute("user_num");
		if(user_num==null) {//로그인이 되지 않은 경우
			return "redirect:/member/loginForm.do";
		}
		//로그인이 된 경우
		MemberDAO dao = MemberDAO.getInstance();
		//회원정보
		MemberVO member = dao.getMember(user_num); 
		
		BoardDAO boardDao = BoardDAO.getInstance();
		//게시판 글 (키필드랑 키워드 x - null 처리)
		List<BoardVO> boardList = boardDao.getListBoard(1, 5, null, null);
				
		request.setAttribute("member", member);
		request.setAttribute("boardList", boardList);
		
		//JSP 경로 반환
		return "/WEB-INF/views/member/myPage.jsp";
	}

}
