package kr.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DBUtil {
	//context.xml에서 설정 정보를 읽어들여
	//커넥션풀로부터 커넥션을 할당 받음
	public static Connection getconConnection()throws Exception{
		Context initCtx = new InitialContext();		
		//java:com/env -> [여권 :(한국인_인증 필_큰범주)문슬범] 
		//jdbc/xe -> [국내 : (한국인_기본값_작은범주)문슬범]
		DataSource ds = (DataSource)initCtx.lookup("java:comp/env/jdbc/xe");
		return ds.getConnection(); //얘만 호출하면 됨(식별자만 맞으면 xml안 정보 다 불러옴)
	}
	
	
	//자원정리
	public static void executeClose(ResultSet rs, 
			PreparedStatement pstmt, Connection conn) {
		if(rs!=null)try {rs.close();}catch(SQLException e) {}
		if(pstmt!=null)try {pstmt.close();}catch(SQLException e) {}
		if(conn!=null)try {conn.close();}catch(SQLException e) {}
	}
}
