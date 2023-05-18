<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 폼</title>
</head>
<body>
<form action="s03_sessionLogin.jsp" 
							method="post"> <%-- method: get방식으로 하면 안된다 --%>
	아이디 <input type="text" name="id"><br>
	비밀번호 <input type="password" 
						name="password"><br> <%-- password: 영문방식으로 강제된다. --%>
	<input type="submit" value="로그인">
	
</form>
</body>
</html>