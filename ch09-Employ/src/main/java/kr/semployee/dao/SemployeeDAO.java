package kr.semployee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.semployee.vo.SemployeeVO;
import kr.util.DBUtil;

public class SemployeeDAO {//메서드 모아놓는 곳이네 <dao는 모델2로 넘어감> 데이터의 흐름이 중 멤버 vo,dao는 안바뀜
	/*
	 * 싱글턴 패턴은 생성자를 private으로 지정해서
	 * 외부에서 호출할 수 없도록 처리하고 static
	 * 메서드를 호출해서 객체가 한 번만 생성되고
	 * 생성된 객체를 공유할 수 있도록 처리하는
	 * 방식을 의미함 - 모델2 MVC패턴도 같은 형태를 가져감.
	 */
	private static SemployeeDAO instance = new SemployeeDAO();
	public static SemployeeDAO getInstance() {
		return instance;
	}
	
	private SemployeeDAO() {} //외부에서 호출 못함
	
	//회원가입
	public void insertMember(SemployeeVO member)
					throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//커넥션풀로부터 커넥션을 할당(1,2단계 한거)
			conn = DBUtil.getconConnection();
			//SQL문 작성
			sql = "INSERT INTO semployee (num,id,name,passwd,salary,job,reg_date) VALUES (semployee_seq.nextval,?,?,?,?,?,SYSDATE)";
			
			//PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getName());
			pstmt.setString(3, member.getPasswd());
			pstmt.setInt(4, member.getSalary());
			pstmt.setString(5, member.getJob());
			
			//SQL문 실행
			pstmt.executeUpdate();
			
		}catch(Exception e) {
			throw new Exception(e);
		}finally {
			//자원정리
			DBUtil.executeClose(null, pstmt, conn);
		}
	}
	//회원상세정보
	public SemployeeVO getMember(int num) throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		SemployeeVO member = null;
		String sql = null;
		
		try {
			//커넥션풀로부터 커넥션을 할당(1,2단계 한거)
			conn = DBUtil.getconConnection();
			//SQL문 작성
			sql = "SELECT* FROM semployee WHERE num=?";
			//PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setInt(1, num);
			//SQL문 실행
			rs = pstmt.executeQuery();
			if(rs.next()) {
				member = new SemployeeVO();
				member.setNum(rs.getInt("num"));
				member.setId(rs.getString("id"));
				member.setPasswd(rs.getString("passwd"));
				member.setName(rs.getString("name"));
				member.setSalary(rs.getInt("salary"));
				member.setJob(rs.getString("Job"));
				member.setReg_date(rs.getDate("reg_date"));
			}
		}catch(Exception e) {
			throw new Exception(e);
		}finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}
		return member;
	}
	//아이디 중복 체크, 로그인 체크
	public SemployeeVO checkMember(String id) 
							throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		SemployeeVO member = null;
		String sql = null;
		
		try {
			//커넥션풀로부터 커넥션을 할당(JDBC 수행 2단계까지)
			conn = DBUtil.getconConnection();
			//SQL문 작성
			sql = "SELECT * FROM semployee WHERE id=?";
			//PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setString(1, id);
			
			//SQL문 실행
			rs = pstmt.executeQuery();
			if(rs.next()) {
				member = new SemployeeVO();//자바빈 객체생성
				member.setId(rs.getString("id"));
				member.setNum(rs.getInt("num"));
				member.setPasswd(rs.getString("passwd"));
			}//else를 만드는게 군더더기가 됨
		}catch(Exception e) {
			throw new Exception(e);
		}finally {
			//자원정리
			DBUtil.executeClose(rs, pstmt, conn);
		}
		return member;//null값을 반환
	}
	//회원정보수정
	public void updateMember(SemployeeVO member) throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		try {
			//커넥션풀로부터 커넥션을 할당(JDBC 수행 2단계까지)
			conn = DBUtil.getconConnection();
			//SQL문 작성
			sql = "UPDATE semployee SET name=?, passwd=?, salary=?, job=? WHERE num=?";
			//PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setString(1, member.getName());
			pstmt.setString(2, member.getPasswd());
			pstmt.setInt(3, member.getSalary());
			pstmt.setString(4, member.getJob());
			pstmt.setInt(5, member.getNum());
			
			//SQL문 실행
			pstmt.executeUpdate();
			
		}catch(Exception e) {
			throw new Exception(e);
		}finally {
			//자원정리
			DBUtil.executeClose(null, pstmt, conn);
		}
	}
	//회원탈퇴(회원정보삭제)
	public void deleteMember(int num) throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;

		try {
			//커넥션풀로부터 커넥션을 할당(JDBC 수행 2단계까지)
			conn = DBUtil.getconConnection();
			//SQL문 작성
			sql = "DELETE FROM semployee WHERE num=?";
			//PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setInt(1, num);
			//SQL문 실행
			pstmt.executeUpdate();
		}catch(Exception e) {
			throw new Exception(e);
		}finally {
			//자원정리
			DBUtil.executeClose(null, pstmt, conn);
		}
		
	}

}//end of public class SemployeeDAO
