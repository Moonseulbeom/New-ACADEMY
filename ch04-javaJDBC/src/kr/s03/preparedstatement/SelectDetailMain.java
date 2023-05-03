package kr.s03.preparedstatement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.util.DBUtil;

public class SelectDetailMain {
	public static void main(String[] args) {
		BufferedReader br = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql= null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("번호:");
					//String -> int 변환
			int num = Integer.parseInt(br.readLine());//정수형태로 받고 싶음
			
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성						//num = 기본키,pk(primary key)
			sql = "SELECT * FROM test2 WHERE num=?";//보안상 mapping안하고 ?처리
			//JDBC 수행 3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩 : 다중행이면 while문, 단일행이면 if문 사용
			pstmt.setInt(1, num);
			//JDBC 수행 4단계 : SQL문을 실행해서 결과행을
			//				  ResultSet에 담아서 반환(num이 primary행이여서)
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				System.out.println("번호 : " + rs.getInt("num"));
				System.out.println("제목 : " + rs.getString("title"));
				System.out.println("작성자 : " + rs.getString("name"));
				System.out.println("내용 : " + rs.getString("memo"));
				System.out.println("이메일 : " + rs.getString("email"));
				System.out.println("작성일 : " + rs.getDate("reg_date"));
				
			}else {//결과행이 존재하지 않음
				System.out.println("검색된 데이터가 없습니다.");
			}
						
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원정리
			DBUtil.executeClose(rs, pstmt, conn);
			if(br!=null)try {br.close();}catch(IOException e) {}
			//br close 순서는 DBUtil 위 아래 상관 x
		}
	}//end of main
	
}//end of p.c

//콘솔에서 데이터 수정하기 번거로움. 다른데서 하는게 더 간편함
