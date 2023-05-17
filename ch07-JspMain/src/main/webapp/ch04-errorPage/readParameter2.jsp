<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파라미터 출력</title>
</head>
<body>
<%-- xml파일 변경하면 서버 restart 시켜줘야함 - 500 에러 발생, 주소 변경하면 404에러 발생 --%>
name 파라미터 값 : 
	<%= request.getParameter("name").toUpperCase() %>
</body>
</html>