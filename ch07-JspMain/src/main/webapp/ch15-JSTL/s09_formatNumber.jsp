<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>formatNumber 태그</title>
</head>
<body>
숫자 : <%-- 0 3개마다 , 하나씩 붙음 --%>
<fmt:formatNumber value="100000" type="number"/>
<br>
통화 : <%-- 브라우저 특성 : 크롬은 소숫점자리 안나오고, 엣지는 .00붙음  --%>
<fmt:formatNumber value="100000"
		type="currency" currencySymbol="$"/>
<br>
통화 : <%-- \ 하나만 하면 특수문자 처리됨 --%>
<fmt:formatNumber value="100000" type="currency" currencySymbol="\\"/>
<br>
퍼센트 : 
<fmt:formatNumber value="0.3" type="percent"/>
<br>
패턴 : <%-- 늘려서 명시하면 숫자 앞에 ~~붙음(소숫점 앞_자릿수에 맞게 명시) / 자리수 명명(소숫점 둘째자리에서 반올림함) --%>
<fmt:formatNumber value="12.345" pattern="00.00"/>

</body>
</html>