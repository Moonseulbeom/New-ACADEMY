package kr.board.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.board.dao.BoardDAO;
import kr.board.vo.BoardVO;
import kr.controller.Action;

public class DetailAction implements Action{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		int num = Integer.parseInt(request.getParameter("num"));
		BoardDAO dao = BoardDAO.getInstance();
		BoardVO boardVO = dao.getBoard(num);
		
		//데이터는 항상 request에 저장
		request.setAttribute("boardVO", boardVO);
		
		//JSP 경로 반환
		return "/WEB-INF/views/detail.jsp";
	}

}
