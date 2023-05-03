package kr.s01.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMain {
	public static void main(String[] args) {
		String db_driver = "oracle.jdbc.OracleDriver";
		String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
				   //드라이버이름:연결할 DB:드라이버 종류:ip(pc서버):포트번호:오라클 식별번호 -> 전체가 주소 		
		String db_id = "c##user001";
		String db_password = "1234";
		
		try {
			Class.forName(db_driver); //1단계
			
			Connection conn = DriverManager.getConnection(
									db_url,db_id,db_password);
			System.out.println("Connection 객체가 생성되었습니다.");
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
	}//end of main
	
}//end of p.c
