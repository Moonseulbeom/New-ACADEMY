<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MY페이지</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.6.0.min.js"></script>
</head>
<body>
<div class="page-main">
	<jsp:include page="/WEB-INF/views/common/header.jsp"/>
	<!-- 내용 시작 -->
	<div class="content-main">
		<h2>회원정보</h2>	
		<div class="mypage-div">
			<h3>프로필 사진</h3>
			<!-- 프로필 사진 시작 -->
			
			<!-- 프로필 사진 끝 -->
			<h3>
				연락처
				<input type="button" 
				value="연락처 수정"
				onclick="location.href='modifyUserForm.do'">
			</h3>
			<ul>
				<li>이름 : ${member.name}</li>
				<li>전화번호 : ${member.phone}</li>
				<li>이메일 : ${member.email}</li>
				<li>우편번호 : ${member.zipcode}</li>
				<li>주소 : ${member.address1} ${member.address2}</li>
				<li>가입일 : ${member.reg_date}</li>
				<c:if test="${!empty member.modify_date}">
				<li>최근 정보 수정일 : ${member.modify_date}</li>
				</c:if>
			</ul>
		</div><%-- end of .mypage-div --%>
		<div class="mypage-div">
			<h3>
				비밀번호 수정
				<input type="button" 
				value="비밀번호 수정"
				onclick="location.href='modifyPasswordForm.do'">
			</h3>
			<h3>
				회원탈퇴
				<input type="button" 
				value="회원탈퇴"
				onclick="location.href='deleteUserForm.do'">
			</h3>
		</div><%-- end of .mypage- --%>
		<div class="mypage-end"></div>
	</div>
	<!-- 내용 끝 -->
</div>
</body>
</html>