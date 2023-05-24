<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="kr.web.member.Member" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>set 태그</title>
</head>
<body>
		<!-- 속성명	속성값 	영역-->
<c:set var="msg" value="봄" scope="page"/> <!-- setattribute와 같음 -->
${pageScope.msg}, ${msg}<br>

<%
	Member member = new Member();
%>
<c:set var="member" value="<%= member %>"/>
	<!-- 타겟 객체		객체의 프로퍼티 (setname이 동작)	저장할 값 -->
<c:set target="${member}" property="name" value="홍길동"/>
회원이름 : ${member.name}, ${member.getName()} 
<!-- get name이 (내부적으로)동작, 일반적으로 전자가 더 좋다 -->
</body>
</html>