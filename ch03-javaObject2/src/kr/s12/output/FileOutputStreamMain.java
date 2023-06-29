package kr.s12.output;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamMain {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			//파일 덮어쓰기
//			fos = new FileOutputStream("fileOut.txt");
			//파일 이어쓰기
			fos = new FileOutputStream("fileOut.txt",true);
			
			String message = "Hello File!! 파일에 내용 기술";//문자열 -> byte 배열로 처리
			//생성된 파일에 문자열을 저장
					//String->byte[]
			fos.write(message.getBytes());
			
			System.out.println("파일을 생성하고 내용을 기술했습니다.");
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			//자원정리(출력하기위해 사용했던 자원을 정리_데이터 효율적 사용)
			if(fos!=null)try {fos.close();}catch(IOException e) {}
			
		}
		
		
		
		
		
		
	}//end of main
	
}//end of p.c

/*
java	옮겨(묶어서_일정단위*용량)	file
---------	  			 -----------
바다		  		->			뭉탱이
산							버퍼
꽃					  (일정량의 데이터의 묶음_안전성 재고)
나무

이 작업을 많이하면(파일에 엑세스) 시스템에서 메모리를 잡아먹음 
버퍼(메모리 공간)사용해서 정보처리

계란 100?
A -> B 
1명 - 1개씩 옮기기
1명 - 1판(30개) 옮기기(버퍼?)

뭐가 더 효율이 높은가 : 버퍼가 좋다!
장점
1)속도가 빨라짐
2)손망실이 적다_안전성 확보

*/