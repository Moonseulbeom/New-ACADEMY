package kr.web.ch02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	@Override
	public void doPost(
				HttpServletRequest request,
				HttpServletResponse response) 
				throws ServletException,IOException{
		
		//전송된 데이터 인코딩 처리(post 방식_한글 깨질까봐)
		request.setCharacterEncoding("utf-8");
		//전송된 데이터 반환
		String name = 
				request.getParameter("name");
		String age = 
				request.getParameter("age");//연산 안하면 문자열로
		String job = 
				request.getParameter("job");
		String[] phones = 
				request.getParameterValues("phone");
	
		//문서 타입 및 캐릭터셋 지정
		response.setContentType(
					"text/html;charset=utf-8");
		
		//HTML 출력을 위한 출력 스트림 생성
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>여행지 선택</title></head>");
		out.println("<body>");
		out.println("이름 : " + name + "<br>");
		out.println("나이 : " + age + "<br>");
		out.println("직업 : " + job + "<br>");
		
		out.println("전화번호 : ");

		if(!phones[0].equals("") && 
		   !phones[1].equals("") && 
		   !phones[2].equals("")) {
			for(int i=0;i<phones.length;i++) {
				if(i>0)out.print("-");
				out.print(phones[i]);
			}
		}else {
			out.println("전화번호를 입력하세요!");
		}
		
		out.println("</body>");
		out.println("</html>");
		out.close();
		
	}
}
