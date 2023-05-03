package kr.s02.statement; 
//형식이 몹시 중요함-순서대로 하자
//sql developer에서 검증하고 여기에 넣자 나를 믿지말자

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateMain {
	public static void main(String[] args) {
		String db_driver = "oracle.jdbc.OracleDriver"; 
		String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
		String db_id = "c##user001";
		String db_password = "1234";
		
		Connection conn = null;
		Statement stmt = null;
		String sql = null;
		
		try {
			//JDBC 수행 1단계 : 드라이버 로드
			Class.forName(db_driver);
			//JDBC 수행 2단계 : Connection 객체를 생성(오라클에 접속)
			conn = DriverManager.getConnection(db_url,db_id,db_password);

			//SQL문 작성
			sql = "UPDATE test1 SET age=90 WHERE id='star'";
			
			//JDBC 수행3단계 : Statement 객체 생성
			stmt = conn.createStatement();
			
			//JDBC 수행4단계 : SQL문을 실행
			//update문을 실행해서 테이블의 행을 수정하고
			//수정한 행의 개수를 반환
			int count = stmt.executeUpdate(sql);
			System.out.println(count + "개 행의 정보를 수정했습니다.");
			
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
 * 왜 맨날 close하냐?
 * 커넥션이 오라클에 접속하면 트랜젝션(작업단위)가 만들어짐
 * 성공하면 오토커밋,실패하면 롤백
 * close하기전까지를 작업의 한 단위로 보기 때문에 번거로워도 그냥 해주자
 * create insert select update 
 * 연관이 있는 작업이면 하나의 트랜젝션으로 묶는데
 * 위 4가지는 서로 메뉴가 다르니 군소리 말고 따로하자
 */


























