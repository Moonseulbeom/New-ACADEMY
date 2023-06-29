package kr.s02.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;//결과집합 행단위로 데이터 읽어옴
import java.sql.SQLException;
import java.sql.Statement;

public class SelectMain {
	public static void main(String[] args) {
		String db_driver = "oracle.jdbc.OracleDriver"; 
		String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
		String db_id = "c##user001";
		String db_password = "1234";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//JDBC 수행 1단계 : 드라이버 로드
			Class.forName(db_driver);
			//JDBC 수행 2단계 : Connection 객체를 생성(오라클에 접속)
			conn = DriverManager.getConnection(db_url,db_id,db_password);

			//SQL문 작성
			sql = "SELECT * FROM test1";
			
			//JDBC 수행3단계 : Statement 객체 생성
			stmt = conn.createStatement();
			
			//JDBC 수행4단계 : (Query)SQL문을 실행해서 테이블로부터 레코드(행)을 전달 받아 
		   //				 결과집합을 만들고 ResultSet 객체에 담아 반환
			rs = stmt.executeQuery(sql);
			
			System.out.println("ID\t나이");
			
			//ResultSet에 보관된 결과집합에 접근해서 행단위로 데이터를 추출
			while(rs.next()) {//얘가 커서 움직임
				
				//컬럼명을 통해서 데이터를 반환 (배치를 무시할수 있음)
				/*
				System.out.print(rs.getString("id") + "\t");
				System.out.println(rs.getInt("age"));
			    */
				
				//컬럼 인덱스를 통해서 데이터를 반환
				System.out.print(rs.getString(1) + "\t");
				System.out.println(rs.getInt(2));
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원정리 
			if(rs!=null)try {rs.close();}catch(SQLException e) {}
			if(stmt!=null)try {stmt.close();}catch(SQLException e) {}
			if(conn!=null)try {conn.close();}catch(SQLException e) {}
		}

	}//end of main
	
}//end of p.c
