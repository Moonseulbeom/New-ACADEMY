<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주문 내역</title>
</head>
<body>
<%--
구매 금액이 30만원 미만이면 배송비 5천원 추가
[출력 예시]
이름 :
배송희망일 :
구입 내용 :
배송비 :
총 구매비용(배송비 포함) : 
--%>

<%
	//전송된 데이터 인코딩 처리
	request.setCharacterEncoding("utf-8");
%>
이름 : <%= request.getParameter("name") %><br>
배송희망일 : <%= request.getParameter("order_date") %><br>
구입내용 :
<%
	String[] items = 
		request.getParameterValues("item");
	
	if(items!=null){//null 체크
		for(int i=0;i<items.length;i++){
			if(i>0) out.print(",");
%>
			<%= items[i] %>
<%	
		}
		out.println("<br>");
	}
%><br>
배송비 : <%= request.getParameter("ship") %><br>
총 구매비용(배송비 포함) : <%= request.getParameter("sum") + request.getParameter("ship")%>

</body>
</html>