package kr.mvc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet 
					extends HttpServlet {
	@Override
	public void doGet(
				HttpServletRequest request,
				HttpServletResponse response) 
						throws ServletException,IOException{
		
		//공통 메서드 호출
		requestPro(request, response);
		
	}//end of doGet
	
	@Override
	public void doPost(
				HttpServletRequest request,
				HttpServletResponse response)
						throws ServletException,IOException{

		//공통 메서드 호출
		requestPro(request, response);
		
	}//end of doPost
	
	//흐름 제어를 위한 (동일한 작업) 공통 메서드 : 클라이언트가 doGet 이든 doPost든 일로 오게끔 (안전하게 서블릿 사용가능)
	private void requestPro(
					HttpServletRequest request,
					HttpServletResponse response)
					throws ServletException,IOException{
		
		request.setAttribute("result", "하하호호");
		
		//forward 방식으로 JSP 호출(request 공유 목적)
		RequestDispatcher dispatcher = request.getRequestDispatcher("/views/messageView.jsp");
		dispatcher.forward(request, response);
		
		
	}//end of requestPro
	
	
	
	
}// end of p.c
