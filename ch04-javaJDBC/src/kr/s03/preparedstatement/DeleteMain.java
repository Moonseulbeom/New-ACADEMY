package kr.s03.preparedstatement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.sql.PreparedStatement;
import java.sql.Connection;

import kr.util.DBUtil;

public class DeleteMain {
	public static void main(String[] args) {
		BufferedReader br = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("번호:");
			int num = Integer.parseInt(br.readLine());
			
			//JDBC 1,2단계 수행
			conn = DBUtil.getConnection();
			System.out.println("test2 테이블에 데이터를 삭제합니다.");
			
			//SQL문 작성
			sql = "DELETE FROM test2 WHERE num=?";
			
			//JDBC 수행3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			
			//?에 데이터 바운딩
			pstmt.setInt(1, num);
			
			//JDBC 수행4단계 : SQL문 실행
			int count = pstmt.executeUpdate();//(sql)넣으면 안된당
			System.out.println(count + "개 행을 삭제했습니다.");
			
		}catch(Exception e) {
			e.printStackTrace();
			//없는 번호는 0행이라 0개 행을 삭제했습니다. 하고 나옴
		}finally {
			//자원정리
			DBUtil.executeClose(null, pstmt, conn);
			if(br!=null)try {br.close();}catch(IOException e){}
		}
		
	}//end of main
	
}//end of p.c

//시퀀스번호는 중복만 아니면 숫자가 멋대로 날뛴다 - 내탓아님 오라클 익스프레션? 프로그램 탓임
//UPDATE, DELETE는 P.K가 있어야함
