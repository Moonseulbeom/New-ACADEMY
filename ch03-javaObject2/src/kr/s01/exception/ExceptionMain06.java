package kr.s01.exception;//throws 호출한 곳에서 예외처리하는 방법

import java.io.IOException;

import java.io.BufferedReader;//스캐너말고 다른거
import java.io.InputStreamReader;//위랑 세트임


public class ExceptionMain06 {
	
	//멤버메서드									//런타임 오류(의무가 아님 생략가능)
	public void printData() throws IOException,NumberFormatException{
		//java.io 패키지라 import 해줘야함
		//임시보관 하다 메서드 호출한 곳에서 처리
		
		/*
		 * throws 예약어의 사용
		 * 메서드에서 예외가 발생할 수 있고 예외가 발생하면
		 * 예외를 임시 보관하기 위해서 
		 * throws 예상되는 예외클래스명 형식으로 메서드
		 * 에 표시함. 이렇게 표시하면 메서드가 호출된 곳에
		 * try~catch문을 명시하고 예외처리하게 됨
		 * 메소드에서만 사용된다
		 * 예외를 발생시켜서 조건체크하는 
		 */
		
		
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("단 입력:");
		//String s = br.readLine();//숫자든 문자든 String으로 받아들임,IOException에 예외 임시보관
				//String -> int
		int dan = Integer.parseInt(br.readLine());
		System.out.println(dan + "단");
		System.out.println("----------");
		for(int i=1;i<=9;i++) {
			System.out.println(dan + "*" + i + "=" + dan*i);
		}
	}
	
	public static void main(String[] args) {
		ExceptionMain06 ex = new ExceptionMain06();
		
		try {
			ex.printData();
		}catch(NumberFormatException e) {
			System.out.println("숫자가 아닙니다.");
		}catch(IOException e){
			System.out.println("입력시 오류 발생");
		}//end of try catch
		
	}//end of main
	
}//end of p.c
