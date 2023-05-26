package kr.product.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.controller.Action;
import kr.product.dao.ProductDAO;
import kr.product.vo.ProductVO;

public class WriteAction implements Action{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//전송된 데이터 인코딩 처리
				request.setCharacterEncoding("utf-8");
				//자바빈(VO)를 생성하고 전송된 데이터를 반환받아서
				//자바빈에 저장
				ProductVO productVO = new ProductVO();
				productVO.setName(request.getParameter("name"));
				productVO.setPasswd(request.getParameter("passwd"));
				productVO.setPrice(Integer.parseInt(request.getParameter("price")));
				productVO.setStock(Integer.parseInt(request.getParameter("stock")));
				productVO.setOrigin(request.getParameter("origin"));

				//BoardDAO 객체 생성
				ProductDAO dao = ProductDAO.getInstance();
				dao.insert(productVO);
				
				//JSP 경로 반환
				return "/WEB-INF/views/write.jsp";
			}

}
