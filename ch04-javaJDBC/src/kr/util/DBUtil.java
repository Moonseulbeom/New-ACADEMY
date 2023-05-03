package kr.util;

import java.io.IOException;
import java.sql.CallableStatement;
//static 혹은 상수(대문자) 형태로 만들자
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class DBUtil {
	private static final String DB_DRIVER = "oracle.jdbc.OracleDriver"; 
	private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String DB_ID = "c##user001";
	private static final String DB_PASSWORD = "1234";
	
	//Connection 객체를 생성해서 반환
	public static Connection getConnection()
					throws ClassNotFoundException,SQLException{
		//JDBC 수행1단계 : 드라이버 로드
		Class.forName(DB_DRIVER);
		//JDBC 수행2단계 : Connection 객체 생성, 오라클에 접속
		return DriverManager.getConnection(DB_URL,DB_ID,DB_PASSWORD);
	}
	
	//자원정리
	public static void executeClose(ResultSet rs, PreparedStatement pstmt, Connection conn) {
		if(rs!=null)try {rs.close();}catch(SQLException e) {}
		if(pstmt!=null)try {pstmt.close();}catch(SQLException e) {}	
		if(conn!=null)try {conn.close();}catch(SQLException e) {}
	}
	
	public static void executeClose(
				CallableStatement cstmt,
				Connection conn) {
		if(cstmt!=null)try {cstmt.close();}catch(SQLException e) {}
		if(conn!=null)try {conn.close();}catch(SQLException e) {}
	}
	
}//end of p.c
