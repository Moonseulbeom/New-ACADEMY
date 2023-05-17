<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html> 
<!-- 
리다이렉트 :
s09_~주소 확보 후 s10 주소 불러옴_s09는 내용 안불러옴 
+ 옛주소 써도 현주소로 갈수있는것도 리다이렉트라고 한다.
-->
<html>
<head>
<meta charset="UTF-8">
<title>response.sendRedirect() 테스트</title>
</head>
<body>
현재 페이지는 s09_responseA.jsp 입니다.
화면에 보여지지 않습니다.
</body>
</html>
<%
	response.sendRedirect("s10_responseB.jsp"); //호출
%>