<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page buffer="1kb" autoFlush="false" %> <%-- autoflush buffer는 8kb 고정으로 앵간하면 건들지말자 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>autoFlush 속성값 false 예제</title>
</head>
<body>
<%
	for(int i=0;i<1000;i++){
%>
1234
<%		
	}
%>
</body>
</html>