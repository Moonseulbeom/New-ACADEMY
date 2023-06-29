package kr.s03.preparedstatement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.sql.Connection;
import java.sql.PreparedStatement;

import kr.util.DBUtil;

public class InsertMain {
	public static void main(String[] args) {
		BufferedReader br = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("제목:");
			String title = br.readLine();
			System.out.print("이름:");
			String name = br.readLine();
			System.out.print("메모:");
			String memo = br.readLine();
			System.out.print("이메일:");
			String email = br.readLine();
			
			//JDBC 수행1,2단계
			conn = DBUtil.getConnection();
			
			//SQL문 작성
			sql = "INSERT INTO test2 (num,title,name,memo,email,reg_date) "
					+ "VALUES (test2_seq.nextval,?,?,?,?,SYSDATE)";
			//데이터는 ?로 빼둔다,연산자나 명령어는 잘 써야한다.
			//JDBC 수행3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩(엮는다)
			pstmt.setString(1, title);//n번?,이거 이런느낌
			pstmt.setString(2, name);
			pstmt.setString(3, memo);
			pstmt.setString(4, email);
			
			//JDBC 수행4단계 : SQL문을 실행해서 테이블에 행을 추가
			int count = pstmt.executeUpdate();
			//메소드에 넣으면 안됨(sql)넣으면 컴파일 과정에선 에러x,런타임에서 에러남
			System.out.println(count + "개의 행을 추가했습니다.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원정리
			DBUtil.executeClose(null, pstmt, conn);//result를 null처리해버림
			if(br!=null)try {br.close();}catch(IOException e) {}
		}

	}//end of main
	
}//end of p.c

// num의 1은 시퀀스
//reg_date 는 sysdate
//statement 는 보안에 취약하다 그래서 아래
//preparedstatement 는 '글자' 얘도 된다 - 보안강화
//sql문에 직접 관여할수 없게끔 타입만 넣을수 있게 //?에 데이터바운딩 부분
//명령문이 실행이 안됨, 해킹 못하게하려고




