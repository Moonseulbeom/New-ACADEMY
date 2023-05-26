package kr.board.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.board.dao.BoardDAO;
import kr.board.vo.BoardVO;
import kr.controller.Action;
import kr.util.PageUtil;

public class ListAction implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String pageNum = request.getParameter("pageNum");
		
		if(pageNum==null) pageNum = "1";
		
		BoardDAO dao = BoardDAO.getInstance();
		int count = dao.getCount();
		
		//페이지 처리
		/*
		 * currentPage : 현재 페이지 지정
		 * count : 총 레코드 수
		 * rowCount : 현재 페이지에 보여질 레코드 수
		 * pageCount : 현재 페이지에 표시될 페이지 수
		 * pageUrl : 현재 페이지를 보여주기 위한 요청URL
		 * 
		 */
		PageUtil page = 
				new PageUtil(Integer.parseInt(pageNum),
							count,10,10,"list.do");
		
		List<BoardVO> list = null;
		if(count>0) {//데이터가 있을경우
			list = dao.getList(page.getStartRow(), page.getEndRow());
		}
		request.setAttribute("count", count);
		request.setAttribute("list", list);
		request.setAttribute("page", page.getPage());
		
		//JSP 경로 반환
		return "/WEB-INF/views/list.jsp";
	}

}
