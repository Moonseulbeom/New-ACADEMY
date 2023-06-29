<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:if test="${check}"> <%-- true일때  --%>
	<script>
		alert('상품 삭제를 완료했습니다.');
		location.href='list.do?num=${num}';
	</script>
</c:if>
<c:if test="${!check}"> <%-- false일때  --%>
	<script>
		alert('비밀번호 불일치');
		history.go(-1);
	</script>
</c:if>