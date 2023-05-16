<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>1부터 100까지의 합</title> 
</head>
<body>
<% //스크립트릿(java 영역_java 코드 실행)
	//제어문(반복문)
	int total = 0;
	for(int i=1;i<=100;i++){
		total += i;
	}
	//출력 (내장 객체(생성x, 호출만 하면됨))
	out.println("1부터 100까지의 합 : " + total);
%>
</body>
</html>
<!-- 출력하기 직전에만 코드 동작하면 됨 -->