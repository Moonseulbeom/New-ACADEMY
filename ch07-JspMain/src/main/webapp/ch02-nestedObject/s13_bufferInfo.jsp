<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>버퍼 정보</title>
</head>
<body>
버퍼 크기 : <%= out.getBufferSize() %><br>
남은 크기 : <%= out.getRemaining() %><br>
auto flush : <%= out.isAutoFlush() %><br>
</body>
</html>
<!-- out 내장객체 잘 안씀 , 표현식을 이용한 호출을 주로 씀 -->