<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품목록 상세페이지</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css"> 
</head>
<body>
<div class="page-main">
	<h2>상품목록 상세페이지</h2>
	<ul>
		<li>상품번호 : ${productVO.num}</li>
		<li>상품명 : ${productVO.name}</li>
		<li>가격 : ${productVO.price}</li>
		<li>재고 : ${productVO.stock}</li>
		<li>원산지 : ${productVO.origin}</li>
	</ul>
	<hr size="1" noshade="noshade" width="100%">
	<hr size="1" noshade="noshade" width="100%">
	<div class="align-right">
		작성일 : ${productVO.reg_date}
		<input type="button" value="수정"
			onclick="location.href='modifyForm.do?num=${productVO.num}'">	
		<input type="button" value="삭제"
			onclick="location.replace('deleteForm.do?num=${productVO.num}')">
		<%-- history 정보를 지우기위해 replace는 정보를 지움 --%>	
		<input type="button" value="상품목록"
			onclick="location.href='list.do'">
	</div>
</div>
</body>
</html>