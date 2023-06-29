package kr.s13.reader;

import java.io.BufferedReader;
import java.io.InputStreamReader;//import java.io.BufferedReader; 얘랑 친구
import java.io.IOException;

public class BufferedReaderMain01 {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			//InputStreamReader는 System.in
			//(바이트 입력 스트림)를 문자 입력 스트림으로
			//변환시킴
			br = new BufferedReader(new InputStreamReader(System.in));//1 byte 입력

			System.out.println("당신의 이름:");
			String name = br.readLine();
			System.out.println(name);
			
			System.out.println("당신의 나이:");
					//String->int 변환_readLine은 항상 문자열로 반환 숫자로 살리고 싶으면
			int age = Integer.parseInt(br.readLine());
			System.out.println(age);
			
			
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}catch(IOException e) {//의무
			e.printStackTrace();
		}
		finally {
			//자원정리
			if(br!=null)try {br.close();}catch(IOException e) {}
		}
		
		
	}//end of main
	
}//end of p.c
