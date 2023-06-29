<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Enumeration" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>헤더 목록 출력</title>
</head>
<body>
<%
	Enumeration headerEnum = 
						request.getHeaderNames();
	while(headerEnum.hasMoreElements()){
		//헤더 네임 구하기
		String headerName = 
				(String)headerEnum.nextElement();
		//헤더 벨류 구하기
		String headerValue =
				request.getHeader(headerName);
%>
	<%= headerName %> = <%= headerValue %><br>
<%
	}
%>
</body>
</html>
<!-- 쿠키 정보 제외하고 클라이언트(브라우저)가 보내주는 것 -->