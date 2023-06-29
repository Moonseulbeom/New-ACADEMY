package kr.s11.input;//표준입력

import java.io.IOException;

public class StandardInputMain01 {
	public static void main(String[] args) {
		//자바의 기본 입력
		try {
			System.out.println("영문자 1개 입력:");
			//문자 하나를 입력 받아서 아스키 코드로 반환
			int a = System.in.read();
			System.out.println(a + "," + (char)a);
			
			//enter 처리
			System.in.read();// \r 13
			System.in.read();// \n 10
			
			System.out.println("-------------");
			
			System.out.print("숫자 1개 입력:");
			//입력한 숫자를 문자로 인식해서 아스키 코드를
			//반환하기 때문에 0을 입력하면 아스키 코드
			//48을 반환 따라서 입력한 데이터를 숫자로
			//바로 사용하고 싶으면 입력한 숫자 - 48
			//명시
			int b = System.in.read() - 48;
			System.out.println(b);
			
			
		}catch(IOException e) {
			e.printStackTrace();//예외 문구 출력
		}
		
		
		
		
		
		
	}//end of main
	
}//end of p.c
