package kr.s04.callablestatement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import kr.util.DBUtil;

public class CallableStatementMain {
	public static void main(String[] args) {
		BufferedReader br = null;
		Connection conn = null;
		CallableStatement cstmt = null;
		String sql = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("이름:");
			String name = br.readLine();
			System.out.print("인상률:");
						//String -> float 변환(실수)
			float rate = Float.parseFloat(br.readLine());

			//JDBC 수행1,2단계
			conn = DBUtil.getConnection();
			
			//프로시저 호출 문장 작성 {call 프로시저명}
			sql = "{call adjust(?,?)}";
			
			//JDBC 수행3단계 : CallableStatement 객체 생성
			cstmt = conn.prepareCall(sql);
			
			//?에 데이터바운딩
			cstmt.setString(1, name);
			cstmt.setFloat(2, rate);
			
			//JDBC 수행 4단계 : 프로시저 실행
			int count = cstmt.executeUpdate();
			System.out.println(count + "개의 급여 정보를 수정했습니다.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원정리
			DBUtil.executeClose(cstmt, conn);
			if(br!=null)try {br.close();}catch(IOException e) {}
		}
	
	}//end of main
	
}//end of p.c

//반복작업 수행시(SELECT, UPDATE)하면 귀찮으니, PROCEDURE 만드는게 편함
//SQL문장 2개 이상이면 편해짐 하나면 만드는게 귀찮다.
/*
 * 개인 프로젝트(주제는 통일) 2023-04-18 오후
 * 틀은 공통,메서드는 알아서
 * 
 * HTML,CSS?
 */













