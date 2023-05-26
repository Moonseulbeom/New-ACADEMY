package kr.product.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.controller.Action;
import kr.product.dao.ProductDAO;
import kr.product.vo.ProductVO;

public class ModifyAction implements Action{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//전송된 데이터 인코딩 처리
		request.setCharacterEncoding("utf-8");
		
		ProductVO productVo = new ProductVO();
		productVo.setNum(Integer.parseInt(request.getParameter("num")));
		productVo.setName(request.getParameter("name"));
		productVo.setPasswd(request.getParameter("passwd"));
		productVo.setPrice(Integer.parseInt(request.getParameter("price")));
		productVo.setStock(Integer.parseInt(request.getParameter("stock")));
		productVo.setOrigin(request.getParameter("origin"));

		//ProductDAO 객체 생성
		ProductDAO dao = ProductDAO.getInstance();
		//비밀번호 인증을 위해 한 건의 레코드를
		//자바빈에 담아서 반환
		ProductVO db_product = dao.getProduct(productVo.getNum());
		boolean check = false;
		if(db_product!=null) {
			//비밀번호 일치 여부 체크
			check = db_product.isCheckedPassword(productVo.getPasswd());
		}
		if(check) {//비밀번호 일치
			dao.update(productVo);
			//상세페이지로 이동하기 위해 상품번호를 저장
			request.setAttribute("num", productVo.getNum());
		}
		
		//UI 처리를 위해서 check 저장
		request.setAttribute("check", check);

		//JSP 경로 반환
		return "/WEB-INF/views/modify.jsp";
	}

}
