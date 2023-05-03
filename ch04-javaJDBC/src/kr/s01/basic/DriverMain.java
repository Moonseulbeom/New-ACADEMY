package kr.s01.basic;

public class DriverMain {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver"); 
			//얘를 찾아서 메모리에 올려야됨 java랑 oracle 연동시켜줌
			System.out.println("오라클 드라이버가 정상적으로 로드되었습니다.");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}//end of main
}

/*
 * 드라이버 먼저하고
 * 커넥션 객체생성 : 오라클의 경로 계정 비밀번호, 실질적인 연결
 */
