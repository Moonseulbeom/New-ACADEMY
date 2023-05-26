package kr.product.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.controller.Action;
import kr.product.dao.ProductDAO;
import kr.product.vo.ProductVO;
import kr.util.PageUtil;

public class ListAction implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String pageNum = request.getParameter("pageNum");
		
		if(pageNum==null) pageNum = "1";
		
		ProductDAO dao = ProductDAO.getInstance();
		int count = dao.getCount();
		
		PageUtil page = 
				new PageUtil(Integer.parseInt(pageNum),
							count,10,10,"list.do");
		
		List<ProductVO> list = null;
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
