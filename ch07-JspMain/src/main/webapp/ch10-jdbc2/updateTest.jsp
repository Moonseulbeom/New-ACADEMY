<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ include file="dbInfo.jspf" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 수정</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<%
	//전송된 데이터 인코딩 처리
	request.setCharacterEncoding("utf-8");
	//전송된 데이터 반환
	int num = Integer.parseInt(
			request.getParameter("num"));
	String name = request.getParameter("name");
	String price = request.getParameter("price");
	String stock = request.getParameter("stock");
	String origin = request.getParameter("origin");
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	String sql = null;
	
	try{
		//JDBC 수행 1단계 : 드라이버 로드
		Class.forName(driverName);
		//JDBC 수행 2단계 : Connection 객체 생성
      	conn = DriverManager.getConnection(
      							jdbcUrl, dbId, dbPass);
     	//SQL문 작성
      	sql = "UPDATE product SET name=?,price=?,stock=?,origin=? WHERE num=?";
      	//JDBC 수행 3단계 : PreparedStatement 객체 생성
      	pstmt = conn.prepareStatement(sql);
     	//?에 데이터 바인딩
      	pstmt.setString(1,name);
      	pstmt.setString(2,price);
      	pstmt.setString(3,stock);
      	pstmt.setString(4,origin);
      	pstmt.setInt(5,num);

      	//JDBC 수행 4단계 : SQL문 실행
      	pstmt.executeUpdate();
%>
	<div class="result-display">
		<div class="align-center">
			글수정 완료!<br>
			<input type="button" value="상풍 상세"
				onclick="location.href='detailTest.jsp?num=<%=num%>'">
		</div>
	</div>
<%
	}catch(Exception e){
%>
	<div class="result-display">
		<div class="align-center">
			오류 발생! 상품수정 실패!<br>
			<input type="button" value="상품 상세"
				onclick="location.href='detailTest.jsp?num=<%=num%>'">
		</div>
	</div>
<%
		e.printStackTrace();
	}finally{
		//자원정리
  	 	if(pstmt!=null)try{pstmt.close();}catch(SQLException e){}
   		if(conn!=null)try{conn.close();}catch(SQLException e){}
	}
	
%>
</body>
</html>