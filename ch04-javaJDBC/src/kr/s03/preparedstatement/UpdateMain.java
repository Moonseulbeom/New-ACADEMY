package kr.s03.preparedstatement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.sql.Connection;
import java.sql.PreparedStatement;

import kr.util.DBUtil;

public class UpdateMain {
	public static void main(String[] args) {
		BufferedReader br = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("번호:");
			int num = Integer.parseInt(br.readLine());//번호가 없으면 WHERE절을 만들수 없음
			System.out.print("제목:");
			String title = br.readLine();
			System.out.print("이름:");
			String name = br.readLine();
			System.out.print("메모:");
			String memo = br.readLine();
			System.out.print("이메일:");
			String email = br.readLine();
			//reg_date는 작성일이라 변경 x, 변경시 별도의 컬럼 필요
			
			System.out.println("--------------");
			
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			System.out.println("test1 테이블에 데이터를 수정합니다.");
			
			//SQL문 작성											//primary key
			sql = "UPDATE test2 SET title=?,name=?,memo=?,email=? WHERE num=?";
			
			//JDBC 수행 3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			
			//?에 데이터 바인딩 -> mapping 하는 데이터와 자료형 일치
			pstmt.setString(1, title);
			pstmt.setString(2, name);
			pstmt.setString(3, memo);
			pstmt.setString(4, email);
			pstmt.setInt(5, num);
			
			//JDBC 수행4단계 : SQL문을 실행 테이블에 행을 추가
			int count = pstmt.executeUpdate();
			//메소드에 넣으면 안됨(sql)넣으면 컴파일 과정에선 에러x,런타임에서 에러남
			System.out.println(count + "개의 행의 정보를 수정했습니다.");
			//없는 번호라도 에러는 발생 예외x, 0개 행 수정했다 나옴

		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원정리
			DBUtil.executeClose(null, pstmt, conn);//resultset은 안쓰니 null로 유지
			if(br!=null)try {br.close();}catch(IOException e){}
		}
	
	}//end of main
	
}//end of p.c

/*
CRUD작업	 SQL문
Create	INSERT
Read	SELECT
Update	UPDATE
Delete	DELETE
 */
