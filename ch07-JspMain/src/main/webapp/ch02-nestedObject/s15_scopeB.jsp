<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 4개 기본객체와 영역</title>
</head>
<body>
(s14_scopeA)page 영역의 msg1 = 
	<%= pageContext.getAttribute("msg1") %><br> 
<%-- 
null출력 즉,못읽어온다.
pageContext는 일대일 공유만 한다.
--%>
(s14_scopeA)request 영역의 msg2 = 
	<%= request.getAttribute("msg2") %><br>
<%-- 
null출력 즉,못읽어온다.
request는 일대일 공유만 한다._pageContext보다는 공유범위가 넓다(확장성이 좋다)
--%> 
(s14_scopeA)session 영역의 msg3 = 
	<%= session.getAttribute("msg3") %><br>
<%-- 
잘 읽어옴(단,s14 브라우저가 열려있어야만 클라이언트가 식별해서 공유함_브라우저 열려있으면 값 유지시켜줌)
pageContext보다는 공유범위가 넓다(확장성이 좋다)
로그인(아이디저장-쿠키)
--%>

<%-- 
공유범위
page<request<session<application
--%>
</body>
</html>
