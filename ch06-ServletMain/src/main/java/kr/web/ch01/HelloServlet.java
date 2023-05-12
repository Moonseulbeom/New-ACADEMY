package kr.web.ch01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//일반 클래스에 HttpServlet를 상속하면 Servlet이
//되고 HTML를 생성해서 클라이언트로 전송할 수 있음 (클라이언트가 요청하면 컨테이너가 생성해줌)
public class HelloServlet extends HttpServlet{
	public void doGet(
			HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException,
						   IOException{
		//문서 타입 및 캐릭터셋 지정
		response.setContentType("text/html;charset=utf-8");
		//HTML 출력을 위한 출력 스트림 생성
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>Hello Servlet</title></head>");
		out.println("<body>");
		out.println("처음 작성하는 Serlvet 입니다.");
		out.println("</body>");
		out.println("</html>");
		out.close();//자원 정리_안써도 문제는 x_안정적인 사용을 위해 닫아주자.
		
	}
}
