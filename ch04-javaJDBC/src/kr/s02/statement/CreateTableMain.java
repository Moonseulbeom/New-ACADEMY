package kr.s02.statement;

//.뒤에 다 interface들
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableMain {
	public static void main(String[] args) {
		String db_driver = "oracle.jdbc.OracleDriver";
		String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
				   //드라이버이름:연결할 DB:드라이버 종류:ip(pc서버):포트번호:오라클 식별번호 -> 전체가 주소
		String db_id = "c##user001";
		String db_password = "1234";		
		
		//create,alter,drop문장 모두 사용가능(DDL문장<->DML문장(select 등))
		//close 작업 안해주면 프로그램 느려짐 자원정리 해줘야한다
		Connection conn = null;
		Statement stmt = null;
		String sql = null;
		
		try {
			//JDBC 수행1단계 : 드라이버 로드(자원배치)
			Class.forName(db_driver);
			//JDBC 수행2단계 : Connection 객체 생성(url,id,비번 인증)
			conn = DriverManager.getConnection(db_url,db_id,db_password);
			/*
			 * 테이블을 생성하는 SQL문
			 * 접속한 계정에 테이블명이 중복되면 에러가
			 * 발생하기 때문에 동일 계정에서는 고유하게
			 * 테이블명을 지정해야 함
			 */
			sql = "CREATE TABLE test1(id VARCHAR2(10),age NUMBER(3))";
			//java에서 sql문장 명시할 때 끝에 ;안붙임
			//문장은 내가 검증해야함 java에서 못잡아냄
			
			//JDBC 수행3단계 : Statement 객체 생성
			stmt = conn.createStatement();
			//JDBC 수행4단계 : SQL문을 실행해서 DB에 테이블을 생성_중복생성하면 에러_메소드에 sql을 넘김
			stmt.executeUpdate(sql);

			System.out.println("테이블이 정상적으로 생성되었습니다.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원정리
			//쓰레기 객체가 많아지면, 메모리 잡아먹고 프로그램 자체가 느려짐,garbage collector가 일을 늦게 함->소멸객체로 정의
			if(stmt!=null)try {stmt.close();}catch(SQLException e) {}
			if(conn!=null)try {conn.close();}catch(SQLException e) {}
		}
		
	}//end of main
	
}//end of p.c
