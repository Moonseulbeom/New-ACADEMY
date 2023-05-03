package kr.s08.book;
/*
 * [작업 순서]
 * 1.(관리자)도서 등록 o
 * 2.(관리자)도서 목록 o
 * 3.(사용자)회원 가입 o
 * 4.(관리자)회원 목록 o
 * 5.(사용자)도서 대출 여부 o 파악 status 1로
 * 6.(관리자)대출 목록 o //관리자 끝
 * 7.(사용자)MY 대출 목록 o
 * 8.(사용자)대출도서 반납 //고민거리 update
 * 
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.util.DBUtil;

public class BookDAO {//Data Access Object 약자
	//도서 등록(관리자)
	public void insertBook(String bk_name, String bk_category) {
							
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//JDBC 수행1,2단계
			conn = DBUtil.getConnection();
			
			//SQL문 작성
			sql = "INSERT INTO book (bk_num,bk_name,bk_category,bk_regdate) VALUES (book_seq.nextval,?,?,SYSDATE)";
			
			//JDBC 수행3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			
			//?에 데이터 바인딩하기
			pstmt.setString(1, bk_name);
			pstmt.setString(2, bk_category);
			
			//JDBC 수행 4단계 : SQL문을 실행
			int count = pstmt.executeUpdate();
			System.out.println(count + "건의 도서를 추가했습니다.");
			
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				//자원정리
				DBUtil.executeClose(null, pstmt, conn);
			}
		}//public void insertBookInfo
	
	//도서 목록 보기(수정,삭제는 시간 남으면)
	public void selectBookInfo() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//JDBC 수행1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "SELECT * FROM book ORDER BY bk_num DESC";
			//JDBC 수행3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//JDBC 수행4단계 : SQL문을 실행
			rs = pstmt.executeQuery();
			
			System.out.println("-----------------------------------------------------------");
			System.out.println("도서번호\t제목\t카테고리\t등록일");
			
			while(rs.next()){
				System.out.print(rs.getInt("bk_num") + "\t");
				System.out.print(rs.getString("bk_name") + "\t");
				System.out.print(rs.getString("bk_category") + "\t");
				System.out.println(rs.getDate("bk_regdate"));
			}
			System.out.println("-----------------------------------------------------------");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원정리
			DBUtil.executeClose(rs, pstmt, conn);
		}
	
	}//end of selectBookInfo() 
	
	//아이디 중복 체크(유니크 해야하니까)
	public int checkId(String me_id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		int count = 0;
		
		try {
			//JDBC 수행1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "SELECT me_id FROM member me_id=?";
			//JDBC 수행3단계
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setString(1, me_id);//유니크해서 한건임
			//JDBC 수행4단계 : SQL문 실행
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				count = 1;
			}//위에 초기화 해서 else x
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}

		return count;//아이디 중복 1, 아이디 미중복 0
	}
	
	//회원가입(사용자)
	public void insertMemberInfo(String me_id,String me_passwd,String me_name,String me_phone) {
			   
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//JDBC 수행1,2단계
			conn = DBUtil.getConnection();
			
			//SQL문 작성
			sql = "INSERT INTO member VALUES (member_seq.nextval,?,?,?,?,SYSDATE)";
			
			//JDBC 수행3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			
			//?에 데이터 바인딩하기
			pstmt.setString(1, me_id);
			pstmt.setString(2, me_passwd);
			pstmt.setString(3, me_name);
			pstmt.setString(4, me_phone);
			
			//JDBC 수행 4단계 : SQL문을 실행
			int count = pstmt.executeUpdate();
			System.out.println(count + "건의 멤버를 추가했습니다.");
			
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				//자원정리
				DBUtil.executeClose(null, pstmt, conn);
			}
		}//public void insertMemberInfo
	
	//로그인 체크(사용자)
	public int loginCheck(String me_id, 
						String me_passwd) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int me_num = 0; //회원번호
		String sql = null;
		
		try {
			//JDBC 수행1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "SELECT me_num FROM member WHERE me_id=? AND me_passwd=?";
			//JDBC 수행3단계
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setString(1,me_id);//유니크해서 한건임
			pstmt.setString(2,me_passwd);
			//JDBC 수행4단계 : SQL문 실행
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				me_num = rs.getInt("me_num"); //""안하면 0들어감
			}//초기화 해서 어차피 0들어감-로그인 실패
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}
		
		return me_num;
	}
	//회원 목록 보기(관리자)
	public void selectMemberInfo() {//회원번호,아이디,비밀번호,이름,전화번호,가입일
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//JDBC 수행1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "SELECT * FROM member ORDER BY me_num DESC";//최신 정보가 위로
			//JDBC 수행3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//JDBC 수행4단계 : SQL문을 실행
			rs = pstmt.executeQuery();
			
			System.out.println("-----------------------------------------------------------");
			System.out.println("회원번호\t아이디\t비밀번호\t이름\t전화번호\t가입일");
			
			while(rs.next()){
				System.out.print(rs.getInt("me_num") + "\t");
				System.out.print(rs.getString("me_id") + "\t");
				System.out.print(rs.getString("me_passwd") + "\t");
				System.out.print(rs.getString("me_name") + "\t");
				System.out.print(rs.getString("me_phone") + "\t");
				System.out.println(rs.getDate("me_regdate"));
			}
			System.out.println("-----------------------------------------------------------");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원정리
			DBUtil.executeClose(rs, pstmt, conn);
		}
	
	}//end of selectMemberInfo() 
	
	//도서 대출 여부 확인
	//+도서번호(bk_num)로 검색해서 re_status의 값이
	//+0이면 대출 가능, 1이면 대출 불가능
	public int checkStatus(int bk_num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		int count = 0;
		
		try {
			//JDBC 수행1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "SELECT re_status FROM reservation where bk_num=?";
			//JDBC 수행3단계
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bk_num);
			//JDBC 수행4단계 : SQL문 실행
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				count = rs.getInt("re_status");
			}//위에 초기화 해서 else x
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}

		return count;//대출중 1, 반납(미대출) 0
	}
	//도서 대출 등록 (insert)
	public void insertReservation(int bk_num, int me_num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//JDBC 수행1,2단계
			conn = DBUtil.getConnection();
			
			//SQL문 작성
			sql = "INSERT INTO reservation (re_num,re_status,bk_num,me_num) VALUES (reservation_seq.nextval,1,?,?)";
			//JDBC 수행3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			
			//?에 데이터 바인딩하기
			pstmt.setInt(1, bk_num);
			pstmt.setInt(2, me_num);
			
			//JDBC 수행 4단계 : SQL문을 실행
			int count = pstmt.executeUpdate();
			System.out.println(count + "개의 대출을 등록했습니다.");
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
		//자원정리
			DBUtil.executeClose(null, pstmt, conn);
		}
		
	}
	
	//대출 목록 보기(관리자) (select)
	//+대출(re_status=1) 및 반납(re_status=0)
	//+대출 및 반납 모든 데이터 표시
	public void AdminReservation() {//예약번호,현재상황,도서번호,회원번호,예약날짜
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//JDBC 수행1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "SELECT re_num, DECODE(re_status,0,'반납',1,'대출중') status,bk_num, me_num,re_regdate,re_modifydate FROM reservation ORDER BY re_num DESC";
			//JDBC 수행3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//JDBC 수행4단계 : SQL문을 실행
			rs = pstmt.executeQuery();
			
			System.out.println("-----------------------------------------------------------");
			System.out.println("예약번호\t대출현황\t도서번호\t회원번호\t반납일\t수정(반납)날짜");
			
			while(rs.next()){
				System.out.print(rs.getInt("re_num") + "\t");
				System.out.print(rs.getString("status") + "\t");
				System.out.print(rs.getInt("bk_num") + "\t");
				System.out.print(rs.getInt("me_num") + "\t");
				System.out.print(rs.getDate("re_regdate") + "\t");
				System.out.println(rs.getString("re_modifydate"));
			}
			System.out.println("-----------------------------------------------------------");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원정리
			DBUtil.executeClose(rs, pstmt, conn);
		}
	
	}//end of reservation() 
	
	//MY 대출 목록 보기(사용자) (현재 대출한 목록만 표시 re_status=1 회원번호로 읽어옴)
	public void UserReservation(int me_num) {//예약번호,현재상황,도서번호,회원번호,예약날짜
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//JDBC 수행1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "SELECT re_num, DECODE(re_status,0,'반납',1,'대출중') status,bk_num, me_num,re_regdate,re_modifydate FROM reservation WHERE re_status=1 AND me_num=? ORDER BY re_num DESC";
			//JDBC 수행3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setInt(1, me_num);
			//JDBC 수행4단계 : SQL문을 실행
			rs = pstmt.executeQuery();
			
			System.out.println("-----------------------------------------------------------");
			System.out.println("예약번호\t대출현황\t도서번호\t회원번호\t반납일\t수정(반납)날짜");
			while(rs.next()){
				System.out.print(rs.getInt("re_num") + "\t");
				System.out.print(rs.getString("status") + "\t");
				System.out.print(rs.getInt("bk_num") + "\t");
				System.out.print(rs.getInt("me_num") + "\t");
				System.out.print(rs.getDate("re_regdate") + "\t");
				System.out.println(rs.getDate("re_modifydate"));
			}
			System.out.println("-----------------------------------------------------------");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원정리
			DBUtil.executeClose(rs, pstmt, conn);
		}
	
	}//end of reservation() 
	
	//반납 가능 여부(사용자)
	//+대출번호(re_num)와 회원번호(me_num)를 함께
	//+조회해서 re_status가 1인 것은 반납 가능 , 0불가능
	public int checkReturn(int re_num, int me_num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		int count = 0;
		
		try {
			//JDBC 수행1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "SELECT * FROM reservation WHERE re_status=1 AND re_num=? AND me_num=?";
			//JDBC 수행3단계
			pstmt = conn.prepareStatement(sql);
			//?에 데이터바인딩
			pstmt.setInt(1, re_num);
			pstmt.setInt(2, me_num);
			//JDBC 수행4단계 : SQL문 실행
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				count = rs.getInt("re_status");
			}//위에 초기화 해서 else x
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}

		return count;//대출중 1, 반납(미대출) 0
	}
		
	//반납 처리(사용자)
	public void updateReservation(int re_num,
			int bk_num,int me_num, String re_regdate,String re_modifydate) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//JDBC 수행1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "UPDATE reservation SET re_status=0,bk_num=?,me_num=?,re_modifydate=SYSDATE WHERE re_num=?";
			//JDBC 수행3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setInt(1, bk_num);
			pstmt.setInt(2, me_num);
			pstmt.setInt(3, re_num);
			
			//JDBC 수행4단계 : SQL문 실행
			int count = pstmt.executeUpdate();
			System.out.println(count + "개 도서의 정보를 수정했습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원정리
			DBUtil.executeClose(null, pstmt, conn);
		}
	}//end of updateReservation
	
	
}//end of public class BookDAO
