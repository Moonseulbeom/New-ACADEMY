package kr.boardlevel.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.boardlevel.dao.BoardLevelDAO;
import kr.boardlevel.vo.BoardLevelVO;
import kr.controller.Action;
import kr.util.StringUtil;

public class ContentAction implements Action{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//글번호 반환
		int boardv_num = Integer.parseInt(
				request.getParameter("boardv_num"));
		
		BoardLevelDAO dao = BoardLevelDAO.getInstance();
		//조회수 증가
		dao.updateReadcount(boardv_num);
		
		BoardLevelVO board = dao.getBoard(boardv_num);
		
		//HTML를 허용하지 않음
		board.setSubject(StringUtil.useNoHtml(board.getSubject()));
		//HTML를 허용하지 않음, 줄바꿈 처리
		board.setContent(StringUtil.useBrNoHtml(board.getContent()));
		
		request.setAttribute("board", board);
		
		return "/WEB-INF/views/boardLevel/content.jsp";
	}

}
