package kr.boardlevel.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.controller.Action;

public class WriteFormAction implements Action{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		Integer user_num = 
				(Integer)session.getAttribute("user_num");
		if(user_num == null) {
			return "redirect:/member/loginForm.do";
		}
		
		//최초에 글을 쓸 때는 부모글이 생성됨
		int parent_num = 0, depth = 0;
		if(request.getParameter("parent_num") != null) {
			//부모글이 존재하기 때문에 답글 작성
			parent_num = Integer.parseInt(
					   request.getParameter(
							     "parent_num"));
			depth = Integer.parseInt(
					request.getParameter("depth"));
		}
		
		request.setAttribute(
				"parent_num", parent_num);
		request.setAttribute("depth", depth);
		
		return "/WEB-INF/views/boardLevel/writeForm.jsp";
	}

}
