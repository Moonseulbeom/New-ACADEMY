<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> <!-- 페이지 디렉티브 -->
<%@ page import="java.util.Date" %>    
<%@ page import="java.text.SimpleDateFormat" %>
<!-- 자바 코드 만드는 기호-->
<%  
	//객체 생성
	Date nowTime = new Date();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>오늘의 날짜와 시간</title>
</head>
<body>
현재 날짜와 시간은 <%= nowTime %>입니다. <!-- 출력할 때는 기호가 바뀜  -->
<br>
---------------------------------
<br>
<% 
	//객체 생성
	SimpleDateFormat sf = 
		new SimpleDateFormat("yyyy년MM월dd일 a hh:ss");
%>
현재 날짜와 시간은 <%= sf.format(nowTime) %>
</body>
</html>
<!-- 기호 안(java) <> 기호 밖(html) -->
