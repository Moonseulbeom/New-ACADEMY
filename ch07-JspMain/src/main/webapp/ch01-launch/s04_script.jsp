<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%! 
	public int multiply(int a, int b){
		return a * b;
	}
%>
<!-- 메서드를 만들어도 다른 jsp파일에서 못 불러옴(호출이 안됨_재활용 x) : 선언부는 잘 안씀 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>선언부를 이용한 두 정수의 값 연산</title>
</head>
<body>
10 * 25 = <%= multiply(10,25) %>
</body>
</html>