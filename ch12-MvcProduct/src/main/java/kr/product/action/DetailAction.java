package kr.product.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.controller.Action;
import kr.product.dao.ProductDAO;
import kr.product.vo.ProductVO;

public class DetailAction implements Action{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int num = Integer.parseInt(request.getParameter("num"));
		ProductDAO dao = ProductDAO.getInstance();
		ProductVO productVO = dao.getProduct(num);
		
		//데이터는 항상 request에 저장
		request.setAttribute("productVO", productVO);
		
		//JSP 경로 반환
		return "/WEB-INF/views/detail.jsp";
	}

}
