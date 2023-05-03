package kr.s03.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.util.DBUtil;

public class SelectMain {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성 -> 내림차순으로 하면 나중 글이 위로 올라옴
			sql = "SELECT * FROM test2 ORDER BY num DESC";
			//JDBC 수행3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//JDBC 수행4단계 : SQL문을 실행해서 결과집합을 
			//				 ResultSet에 담아서 반환
			rs = pstmt.executeQuery();//(sql문)담으면 에러남
			//쿼리가 결과를 rs에 담는다
			System.out.println("번호\t제목\t작성자\t등록일");
			while(rs.next()) {//커서가 행 밖에 있음,커서가 컬럼명 읽어와서 데이터 읽어옴 get~
				System.out.print(rs.getInt("num") + "\t");
				System.out.print(rs.getString("title") + "\t");
				System.out.print(rs.getString("name") + "\t");
				System.out.println(rs.getDate("reg_date"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원정리
			DBUtil.executeClose(rs, pstmt, conn);//역순으로 메서드 만들어져있는거 호출
		}
			
	}//end of main
}//end of p.c

//구조는 패턴화, sql문과 식별자 열심히 보자