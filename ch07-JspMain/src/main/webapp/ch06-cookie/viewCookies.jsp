<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.net.URLDecoder" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 읽기</title>
<!-- 
쿠키는 보통 복수가 일반적,배열로 읽기 
(이전 브라우저가 꺼져있으면, 쿠키가 안보임_진입(새로고침)하면 쿠키(세션아이디)가 보여짐)
 데이터 부스러기(클라이언트가 가지고 있다가 서버쪽으로 전송)
 순서 : makeCookie -> modifyCookie -> viewCookies
 -->
</head>
<body>
쿠키 목록<br>
<%
	//클라이언트로부터 전송된 쿠키 정보를 반환
	Cookie[] cookies = request.getCookies();
	if(cookies != null && cookies.length > 0){
		for(int i=0;i<cookies.length;i++){
%>
	<%= cookies[i].getName() %> =
		<%= URLDecoder.decode(
				cookies[i].getValue(),"UTF-8") %><br>
<%		
		}
	}else{
%>
쿠키가 존재하지 않습니다.
<%
	}
%>
</body>
</html>