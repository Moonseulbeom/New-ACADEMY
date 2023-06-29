package kr.s06.note;//트랜젝션과 메서드의 단위는 엇비슷하다

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.util.DBUtil;

//Data Access Object : 전문적으로 DB 데이터에 접근하는 객체

public class NoteDAO {
	//글쓰기
	public void insertInfo(String name,
						   String passwd,
						   String subject,
						   String content,
						   String email) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//JDBC 수행1,2단계
			conn = DBUtil.getConnection();
			
			//SQL문 작성
			sql = "INSERT INTO note VALUES (note_seq.nextval,?,?,?,?,?,SYSDATE)";
			
			//JDBC 수행3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			
			//?에 데이터 바인딩하기
			pstmt.setString(1, name);
			pstmt.setString(2, passwd);
			pstmt.setString(3, subject);
			pstmt.setString(4, content);
			pstmt.setString(5, email);
			//JDBC 수행 4단계 : SQL문을 실행
			int count = pstmt.executeUpdate();
			System.out.println(count + "개의 행을 삽입했습니다.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원정리
			DBUtil.executeClose(null, pstmt, conn);
		}
		
	}
	//목록보기
	public void selectInfo() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//JDBC 수행1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "SELECT * FROM note ORDER BY num DESC";
			//JDBC 수행3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//JDBC 수행4단계 : SQL문을 실행
			rs = pstmt.executeQuery();
			
			System.out.println("---------------------------------");
			System.out.println("글번호\t제목\t이름\t작성일");
			while(rs.next()){
				System.out.print(rs.getInt("num") + "\t");
				System.out.print(rs.getString("subject") + "\t");
				System.out.print(rs.getString("name") + "\t");
				System.out.println(rs.getDate("reg_date"));
				//getString으로 하면 연월일 시분초 다나옴
			}
			System.out.println("---------------------------------");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원정리
			DBUtil.executeClose(rs, pstmt, conn);
		}
		
	}
	//상세글 보기 (primary key가 필요함_주면 단일행)
	public void selectDetailInfo(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//JDBC 수행1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "SELECT * FROM note WHERE num=?";
			//JDBC 수행3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setInt(1, num);
			//JDBC 수행4단계 : SQL문 실행
			rs = pstmt.executeQuery();//하나의 레코드만 읽어옴
			if(rs.next()) {
				System.out.println("글번호:" + rs.getInt("num"));
				System.out.println("이름:" + rs.getString("name"));
				System.out.println("비밀번호:" + rs.getString("passwd"));
				System.out.println("제목:" + rs.getString("subject"));
				System.out.println("내용:" + rs.getString("content"));
				System.out.println("이메일:" + rs.getString("email"));
				System.out.println("작성일:" + rs.getDate("reg_date"));
			}else {
				System.out.println("검색된 정보가 없습니다.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원정리
			DBUtil.executeClose(rs, pstmt, conn);
		}
		
	}
	//글수정
	public void updateInfo(int num,String name,
			String passwd,String subject,
			String content, String email) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//JDBC 수행1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "UPDATE note SET name=?,passwd=?,subject=?,content=?,email=? WHERE num=?";
			//JDBC 수행3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setString(1, name);
			pstmt.setString(2, passwd);
			pstmt.setString(3, subject);
			pstmt.setString(4, content);
			pstmt.setString(5, email);
			pstmt.setInt(6, num);
			//JDBC 수행4단계 : SQL문 실행
			int count = pstmt.executeUpdate();
			System.out.println(count + "개 행을 수정했습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원정리
			DBUtil.executeClose(null, pstmt, conn);
		}
	}
	//글삭제
	public void deleteInfo(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//JDBC 수행1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "DELETE FROM note WHERE num=?";
			//JDBC 수행3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setInt(1, num);
			//JDBC 수행4단계 : SQL문 실행
			int count = pstmt.executeUpdate();
			System.out.println(count + "개 행을 삭제했습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원정리
			DBUtil.executeClose(null, pstmt, conn);
		}
	}
	
	
	
	
}
