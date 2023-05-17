<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.net.URLEncoder" %>
<%
	Cookie cookie = new Cookie("name", 
				URLEncoder.encode("홍길동","UTF-8"));
	//쿠키 유효시간 지정(단위:초)
	//쿠키 유효시간을 지정하면 클라이언트 영역에
	//파일을 생성해서 쿠키 정보 보관
	//쿠키 유효시간을 미지정시 메모리에 쿠키 정보 보관
	//cookie.setMaxAge(30*60); -> 30분동안 유효
	//cookie.setMaxAge(-1); //메모리에 쿠키 정보 보관
	
	//클라이언트에 쿠키 전송
	response.addCookie(cookie);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 생성(서블릿에서 제공하는 class)</title>
</head>
<body>
<%= cookie.getName() %> 쿠키의 값은
			<%= cookie.getValue() %>
</body>
</html>