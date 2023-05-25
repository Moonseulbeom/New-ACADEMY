<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL의 기본적인 사용법</title>
</head>
<body>
<!-- 가급적이면 EL에서는 연산 X -->
<h3>EL의 기본적인 사용법</h3>
<table border="1" style="width:40%;">
	<tr>
		<th>표현식</th>
		<th>값</th>
	</tr>
	<tr>
		<th>\${2+5}</th>
		<th>${2+5}</th>
	</tr>
	<tr>
		<th>\${"10"+5}</th>
		<th>${"10"+5}</th>
	</tr>
	<tr>
		<th>\${"십"+5}</th>
		<th>에러발생(EL에서의 +는 연산만)</th>
	</tr>
	<%-- 실수형태로 나옴 --%>
	<tr> 
		<th>\${4/5}</th>
		<th>${4/5}</th>
	</tr>
	<tr>
		<th>\${2+=5}</th>
		<th>${2+=5}(문자열로 연결)</th>
	</tr>
	<tr>
		<th>\${"한국"+="서울"}</th>
		<th>${"한국"+="서울"}</th>
	</tr>
	<tr>
		<th>\${2 > 3}</th>
		<th>${2 > 3}</th>
	</tr>
</table>
</body>
</html>