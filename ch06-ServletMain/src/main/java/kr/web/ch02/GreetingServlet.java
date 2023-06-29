package kr.web.ch02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/greeting")
public class GreetingServlet extends HttpServlet{
	//클라이언트에서 get 방식으로 데이터를 전송하면
	//doGet 메서드 구현, post 방식으로 전송하면
	//doPost 메서드 구현
	@Override
	public void doPost(
				HttpServletRequest request,
				HttpServletResponse response) throws ServletException,IOException{
		
		//전송된 데이터 인코딩 처리(POST 방식으로 전송된 데이터 필수 지정)
		request.setCharacterEncoding("utf-8");
		//전송된 데이터를 반환
		String name = request.getParameter("name");
		
		//문서 타입 및 캐릭터셋 지정
		response.setContentType("text/html;charset=utf-8");
		
		//HTML 출력을 위한 출력 스트림을 생성
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>Greeting</title></head>");
		out.println("<body>");
		out.println(name + " 님의 방문을 환영합니다.");
		out.println("</body>");
		out.println("</html>");
		out.close();

	}
}