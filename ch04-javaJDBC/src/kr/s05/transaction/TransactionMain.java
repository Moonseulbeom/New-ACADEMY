package kr.s05.transaction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import kr.util.DBUtil;

public class TransactionMain {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		PreparedStatement pstmt3 = null;

		String sql = null;
		
		try {
			//JDBC 수행1,2단계
			conn = DBUtil.getConnection();
			
			//트랜잭션을 수동 처리하기 위해 auto 
			//commit를 해제
			conn.setAutoCommit(false);//기본값 true
			
			//SQL문 작성 - 예외적으로 데이터 직접 입력 sql문 많아짐
			sql = "INSERT INTO test1 VALUES('Korea',500)";
			//일부러 에러나게 '하나 지움
			//에러발생시 자동으로 안들어감, 문장 하나라 오토커밋 이용
			//JDBC 수행3단계
			pstmt1 = conn.prepareStatement(sql);	
			//JDBC 수행4단계
			pstmt1.executeUpdate();
			
			sql = "INSERT INTO test1 VALUES ('England',400)";
			pstmt2 = conn.prepareStatement(sql);
			pstmt2.executeUpdate();
			
			//테스트용으로 오류가 있는 SQL문 작성_에러나게 '하나 지움
			sql = "INSERT INTO test1 VALUES ('China,300)";
			pstmt3 = conn.prepareStatement(sql);
			pstmt3.executeUpdate();
			
			//정상적으로 작업이 완료되면 commit
			conn.commit();
			

			System.out.println("작업 완료!!!");
			
		}catch(Exception e) {
			e.printStackTrace();
			//예외가 발생했을 경우 rollback
			try {
				conn.rollback();
			}catch(SQLException es) {
				es.printStackTrace();
			}
		}finally {
			//자원정리
			DBUtil.executeClose(null, pstmt3, null);
			DBUtil.executeClose(null, pstmt2, null);
			DBUtil.executeClose(null, pstmt1, conn);
			
		}
		
	}//end of main
	
}//end of p.c

//3개의 sql문장을 실행하는데 트랜잭션은 한번에 다 성공하던가 실패해야된다.->연관된 작업이라 데이터 왜곡이 일어남
//오토커밋 안풀고 진행하면 1,2 sql문은 작동하고 3 sql만 에러남
//오토커밋 -> 수동커밋으로 진행. 여러개의 sql문 중 하나라도 에러나면 동작 안함.
