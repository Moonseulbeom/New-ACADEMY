package kr.board.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.board.dao.BoardDAO;
import kr.board.vo.BoardVO;
import kr.controller.Action;

public class ListAction implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		BoardDAO dao = BoardDAO.getInstance();
		List<BoardVO> list = null;
		list = dao.getList(0, 0);
		
		request.setAttribute("list", list);
		
		//JSP 경로 반환
		return "/WEB-INF/views/list.jsp";
	}

}
