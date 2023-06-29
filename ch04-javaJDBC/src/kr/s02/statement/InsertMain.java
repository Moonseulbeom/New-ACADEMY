package kr.s02.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertMain {//primary 제약조건 안줘서 중복인서트 됨
	public static void main(String[] args) {
		//나중에는 호출해서 사용
		String db_driver = "oracle.jdbc.OracleDriver"; 
		String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
		String db_id = "c##user001";
		String db_password = "1234";
		
		//외부에서 미리 변수 선언
		Connection conn = null;
		Statement stmt = null;
		String sql = null;
		
		try {//try에서 변수설정시 밖에서 해야함 {}안에서 하면 지역변수가 되버림
			//JDBC 수행 1단계 : 드라이버 로드
			Class.forName(db_driver);
			//JDBC 수행 2단계 : Connection 객체를 
			//				 생성해서 오라클에 접속
			conn = DriverManager.getConnection(
					db_url,db_id,db_password);

			//SQL문 작성
			sql = "INSERT INTO test1(id,age) VALUES ('d''star',20)"; //오토 커밋해줌
														//' 넣고싶으면 '' 두개 넣어줘라, '은 특수문자임
			
			//JDBC 수행3단계 : Statement 객체 생성
			stmt = conn.createStatement();
			
			//JDBC 수행4단계 : SQL문을 실행해서 하나의 행을 삽입, 삽입 작업 후 삽입합 행의 개수를 반환
			int count = stmt.executeUpdate(sql);
			System.out.println(count + "개의 행을 추가했습니다.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원정리 
			if(stmt!=null)try {stmt.close();}catch(SQLException e) {}
			if(conn!=null)try {conn.close();}catch(SQLException e) {}
		}
		
	}//end of main
	
}//end of p.c

/*
 * 웹사이트만들때 prepared statement랑 procedure주로 이용
 * 직접 sql mapping,명명하는건 보안상 별로 좋지않음-해킹위험 실무에선 사용안함
*/
