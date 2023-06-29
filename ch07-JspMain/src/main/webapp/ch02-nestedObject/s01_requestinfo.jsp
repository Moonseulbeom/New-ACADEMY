<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>클라이언트 및 서버 정보</title>
</head>
<body>
<!-- 외우면 좋다!(all) -->
클라이언트 IP = <%= request.getRemoteAddr() %><br> 
			<%-- localhost : 0:0:0:0:0:0:0:1 --%>
요청정보 프로토콜 = <%= request.getProtocol() %><br>
요청정보 전송방식 = <%= request.getMethod() %><br>
<!-- 주소관련(3) -->
요청 URL(Uniform Resource Locator) = 
				<%= request.getRequestURL() %><br> 
				<%-- 전체주소_자원 찾아줌_서버 밖에서 서버의 자원을 호출할 때 --%>
요청 URI(Uniform Resource Identifier) = 
				<%= request.getRequestURI() %><br> 
				<%-- 자원 식별(IP날리고 보여줌)_ 같은 서버 안에서 자원을 호출할 때 --%>
컨텍스트 경로 = <%= request.getContextPath() %><br>

쿼리 문자열 = <%= request.getQueryString() %><br>
			   <%-- 주소 뒤에 쿼리 --%>
</body>
</html>