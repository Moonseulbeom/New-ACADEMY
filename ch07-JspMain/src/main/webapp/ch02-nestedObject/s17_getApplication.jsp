<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Enumeration" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Application 기본객체 속성 보기</title>
</head>
<body>
   <%
      Enumeration attrEnum = application.getAttributeNames();
      while(attrEnum.hasMoreElements()){
         //속성명
         String name = (String)attrEnum.nextElement();
         //속성값
         Object value = application.getAttribute(name);
   %>
      application 속성 : <b><%=name %></b> = <%=value %>
   <%
         
      }
   %>
</body>
</html>
<%-- 보통 application에 저장 안함 모든 클라이언트가 공유할수 있는 정보만 저장하고, 일반 데이터는 주로 아래 3개에서 저장해서 사용 --%>