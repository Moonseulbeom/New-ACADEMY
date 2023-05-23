<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="kr.semployee.dao.SemployeeDAO" %>
<%@ page import="kr.semployee.vo.SemployeeVO" %>
<%
Integer user_num = (Integer)session.getAttribute("user_num");
	if(user_num==null){//로그인이 되지 않은 경우
		response.sendRedirect("loginForm.jsp");
	}else{//로그인 된 경우
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원상세정보</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css">
</head>
<body>
<%
SemployeeDAO dao = SemployeeDAO.getInstance();
SemployeeVO member = dao.getMember(user_num);
	if(member.getJob()==null){
		member.setJob("");
	}
%>
<%-- 보안때문에 비밀번호는 입력안함 --%>
<div class="page-main">
	<h1>회원정보</h1>
	<ul>
		<li>아이디 : <%= member.getId() %></li>
		<li>이름 : <%= member.getName() %></li>
		<li>급여 : <%= member.getSalary() %></li>
		<li>직업 : <%= member.getJob() %></li>
		<li>가입일 : <%= member.getReg_date() %></li>
	</ul>
	<hr size="1" width="100%" noshade="noshade">
	<div class="align-right">
		<input type="button" value="회원정보수정"
				onclick="location.href='modifyUserForm.jsp'">
		<input type="button" value="회원탈퇴"
				onclick="location.href='deleteUserForm.jsp'">
		<input type="button" value="홈으로"
				onclick="location.href='main.jsp'">
	</div>
</div>
</body>
</html>
<%
	}
%>