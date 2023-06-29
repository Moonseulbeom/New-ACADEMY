<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>[실습]파라미터 출력</title>
</head>
<body>
<%
	//전송된 데이터 인코딩 처리
	request.setCharacterEncoding("utf-8");
%>
이름 : <%= request.getParameter("name") %><br>
ID : <%= request.getParameter("id") %><br>
비밀번호 : <%= request.getParameter("password") %><br>
전화번호 : <%= request.getParameter("phone") %><br>
취미 : 
<%
	String[] hobbies = 
		request.getParameterValues("hobby");
	
	if(hobbies!=null){//null 체크
		for(int i=0;i<hobbies.length;i++){
			if(i>0) out.print(",");
%>
			<%= hobbies[i] %>
<%	
		}
		out.println("<br>");
	}
%><br>
자기소개 : <%= request.getParameter("content") %>

</body>
</html>