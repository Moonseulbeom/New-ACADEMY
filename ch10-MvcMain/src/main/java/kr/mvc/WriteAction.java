package kr.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WriteAction implements Action{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//request에 데이터 저장
		request.setAttribute("message", 
						"글 등록을 완료 했습니다.");
		
		//JSP 경로 반환
		return "/views/write.jsp";
	}

}
