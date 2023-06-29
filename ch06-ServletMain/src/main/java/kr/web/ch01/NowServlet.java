package kr.web.ch01;
// 순서 : 상속 -> doGet -> @WebServlet -> @Override -> 코드 작성

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/now")
public class NowServlet extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request,
					  HttpServletResponse response) 
					  throws ServletException,IOException{
		Date now = new Date();
		SimpleDateFormat sf = 
				new SimpleDateFormat(
						"yyyy년MM월dd일 a hh:mm:ss");
		//문서 타입 및 캐릭터셋 지정 (한글이 안꺠짐)
		response.setContentType(
				"text/html;charset=utf-8");
		
		//HTML 출력을 위한 출력 스트림을 생성
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>현재 날짜와 시간</title></head>");
		out.println("<body>");
		out.println("현재 날짜와 시간 : " + sf.format(now));
		out.println("</body>");
		out.println("</html>");
		out.close();//필수이자 생략_가급적 부하가 더 발생하게

		
	}
}
