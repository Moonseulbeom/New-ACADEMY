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
		
		Action com = null;
		String view = null;
		
		//클라이언트가 호출한 주소(URI) 반환
		String command = request.getRequestURI();
		
		//호출한 주소의 뒤에 컨텍스트 경로 다음의 주소
		// /list.do 또는 /detail.do 정보 추출
		if(command.indexOf(request.getContextPath())==0) {
			command = command.substring(request.getContextPath().length());
		}
		
		if(command.equals("/list.do")) {
			com = new ListAction();
		}else if(command.equals("/write.do")) {
			com = new WriteAction();
		}else if(command.equals("/detail.do")) {
			com = new DetailAction();
		}else if(command.equals("/update.do")) {
			com = new UpdateAction();
		}else if(command.equals("/delete.do")) {
			com = new DeleteAction();
		}
		
		try {
			view = com.execute(request, response);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//forward 방식으로 JSP 호출(request 공유 목적)
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		dispatcher.forward(request, response);
		
		
	}//end of requestPro
	
	
	
	
}// end of p.c

/*
전송된 데이터 반환 
(파라미터로 데이터를 넘기는 경우 - 클라이언트가 서버에 보내준 데이터에 따라서 메세지가 달라질수있다.)
String message = request.getParameter("message");
String result = null; if(message == null || message.equals("")) { result =
"메시지가 없네요~~"; }else if(message.equals("name")) { result = "홍길동"; }else
if(message.equals("base")) { result = "기본 호출"; }else { result = "잘못된 호출"; }
request.setAttribute("result", result);
 */