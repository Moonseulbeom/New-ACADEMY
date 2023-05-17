<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.HashMap"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주문서 확인</title>
</head>
<body>
<%--
짜장면 4,000원, 짬뽕 5,000원, 볶음밥 6,000원 

[출력예시]
짜장면 2개
짬뽕 1개
총 지불금액 : 13,000원
--%>
<%
	//전송된 데이터 인코딩 처리
	request.setCharacterEncoding("utf-8");

	//가격 정보
	HashMap<String,Integer> map = new HashMap<String,Integer>();
	map.put("짜장면",7000);
	map.put("짬뽕",8000);
	map.put("볶음밥",10000);

%>
짜장면 : <%= request.getParameter("c0") %><br>
짬뽕 : <%= request.getParameter("c1") %><br>
볶음밥 : <%= request.getParameter("c2") %><br>

구매내역 :
<%
	String[] items = 
		request.getParameterValues("for");
	int sum = 0;
	if(items!=null){//null 체크_자바스크립트가 가끔 꺼져있을수도 있어서 넣어주는게 좋다!
		for(int i=0;i<items.length;i++){
			sum += map.get(items[i]);
			if(i>0) out.print(",");
%>			
		<%= items[i] %>
<%
		}//end of for
	
%>
	총 지불금액 : <%= String.format("%,d원", sum) %>
<%				
	}
%>
</body>
</html>