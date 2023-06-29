<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>catch 태그</title>
</head>
<%-- 일종의 try catch 구문(에러페이지로 안감) --%>
<body>
<c:catch var="ex">
	name 파라미터의 값 = <%= request.getParameter("name") %><br>
<% if(request.getParameter("name").equals("test")){%>
${param.name}은 test 입니다.
<%} %>
</c:catch>
<p>
<%-- 예외가 발생하면 예외가 객체가 생성되고
	 예외객체가 있으면 true가 됨 --%>
<c:if test="${ex != null}">
	예외가 발생했습니다.<br>
	${ex}
</c:if>
</body>
</html>