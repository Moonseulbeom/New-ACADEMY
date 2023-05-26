<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 삭제</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
<div class="page-main">
	<h2>글 삭제</h2>
	<form id="delete_form" action="delete.do" method="post">
		<input type="hidden" name="num" value="${num}"> <%-- 변경 안되게끔 받아옴 --%>
		<ul>
			<li>
				<label for="passwd">비밀번호</label>
				<input type="password" name="passwd" 
								id="passwd" size="12" 
								maxlength="12">
			</li>
		</ul>
		<div class="align-center">
			<input type="submit" value="글 삭제">		
			<input type="button" value="목록"
						onclick="location.href='list.do'">
		</div>
	</form>
</div>
</body>
</html>