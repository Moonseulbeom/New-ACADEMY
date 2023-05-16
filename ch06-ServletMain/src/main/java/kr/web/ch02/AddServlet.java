package kr.web.ch02;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class AddServlet extends HttpServlet {
	@Override
	public void doGet(
					HttpServletRequest request,
					HttpServletResponse response)
					throws ServletException,IOException{
		/*
		 * [실습] 전송된 두 개의 정수를 연산
		 * [출력예시] 5 + 4 =9
		 */
		//클라이언트에서 전송한 데이터를 반환(파라미터 전송_문자열,숫자 다 가능)
        			//String -> int 변환(중요)
		int num1 = Integer.parseInt(
				request.getParameter("num1"));
		int num2 = Integer.parseInt(
				request.getParameter("num2"));
		
		int sum = num1 + num2;
		
		//문서 타입 및 캐릭터셋을 지정
	    response.setContentType("text/html;charset=utf-8");
	    
	    //HTML 출력을 위한 스트림 생성
	    PrintWriter out = response.getWriter(); //print, println, printf 다 사용가능
	    out.println("<html>");
	    out.println("<head><title>덧셈 프로그램</title></head>");
	    out.printf("%d + %d = %d",num1,num2,num1+num2);
	    out.println("</html>");
	      
	    out.close();
	
		
		
		
	      
      
		
	}
}
