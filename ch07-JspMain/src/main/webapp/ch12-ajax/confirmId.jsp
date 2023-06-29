<%@ page language="java" contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ include file="dbInfo.jspf" %>
<%
	//전송된 데이터 인코딩 처리
	request.setCharacterEncoding("utf-8");
	//전송된 데이터 반환
	String id = request.getParameter("id");
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String sql = null;
	
	try{
		//JDBC 수행 1단계 : 드라이버 로드
		Class.forName(driverName);
		//JDBC 수행 2단계 : Connection 객체 생성
		conn = DriverManager.getConnection(
      					jdbcUrl, dbId, dbPass);
      	//SQL문 작성
      	sql = "SELECT id FROM people WHERE id=?";
      	
      	//JDBC 수행 3단계 : PreparedStatement 객체 생성
      	pstmt = conn.prepareStatement(sql);
      	//?에 데이터 바인딩
      	pstmt.setString(1,id);
      	
      	//JDBC 수행 4단계 : SQL문을 테이블에 반영하고
      	//				 결과행을 ResultSet에 담음
      	rs = pstmt.executeQuery();
      	if(rs.next()){//id 중복
%>
		{"result":"idDuplicated"}
<%
      	}else{//id 미중복
%>
		{"result":"idNotFound"}
<%		   		
      	}
	}catch(Exception e){
%>
		{"result":"failure"}
<%		
		e.printStackTrace();
	}finally{
		//자원 정리
		if(rs!=null)try{rs.close();}catch(SQLException e){}
	    if(pstmt!=null)try{pstmt.close();}catch(SQLException e){}
	    if(conn!=null)try{conn.close();}catch(SQLException e){}
	}
	
	
%>