<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>스크립트 연습</title>
</head>
<body>
<h2>배열의 내용 출력 - 선언부, 스크립트릿</h2>
<%!
	//선언부 : 변수 선언, 매서드 선언(해당 파일에서만 사용가능_그래서 잘 안씀)
	String[] str = {"JSP가","정말","재미","있다"};
%>
<table border="1">
	<tr>
		<th>배열의 인덱스</th>
		<th>배열의 내용</th>
	</tr>
<%
	//스크립트릿 : 변수선언, 연산, 제어문, 출력(여기까지는 잘 안씀)
	for(int i=0;i<str.length;i++){
		out.println("<tr>");
		out.println("<td>" + i + "</td>");
		out.println("<td>" + str[i] + "</td>");
		out.println("</tr>");
	}
%>
</table>

<h2>배열의 내용 출력 - 선언부,스크립트릿,표현식</h2>
<table border="1">
	<tr>
		<th>배열의 인덱스</th>
		<th>배열의 내용</th>
	</tr>
<%
	for(int i=0;i<str.length;i++){//{}영역 이어짐
%>
	<tr>
		<!-- HTML 주석 : 소스 보기할 때 보여짐 -->
		<%-- JSP주석 : 소스 보기할 때 보여지지 않음(컴파일시 빠짐) --%>
		<%-- 표현식 : 변수의 값, 메서드의 결과값 출력 --%>
		<td><%= i /*(표현식)여러줄 주석 사용가능, 한줄 주석은 오류*/ %></td>
		<td><%= str[i] %></td>
	</tr>	
<%
	}//{}영역 이어짐
%>
</table>

<h2>배열의 내용 출력 - 확장 for문 사용</h2>
<table border="1">
	<tr>
		<th>배열의 내용</th>
	</tr>
<%
	for(String s : str){//{}영역 이어짐
%>
	<tr>
		<td><%= s %></td>
	</tr>
<%		
	}//{}영역 이어짐
%>	
	
</table>

</body>
</html>