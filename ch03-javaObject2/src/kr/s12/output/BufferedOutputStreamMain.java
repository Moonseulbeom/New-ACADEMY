package kr.s12.output;

import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

public class BufferedOutputStreamMain {
	public static void main(String[] args) {
		//변수지정
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			//파일 덮어쓰기
			fos = new FileOutputStream("bufferOut.txt");
			bos = new BufferedOutputStream(fos); //FileOutputstream 주소를 넘김
			
			//문자열 생성
			String str = "BufferedOutputStream Test 입니다.";
			
			//생성된 파일에 데이터 저장? 데이터를 buffer에 저장!(파일 생성만하고 기술 안함)
					//String->byte[] 변환
			bos.write(str.getBytes());
			
			//버퍼를 비우고 버퍼에 데이터를 파일에 출력
			bos.flush();
			
			System.out.println("파일을 생성하고 파일에 내용을 기술함");
			
			
			
		}catch(IOException e) {//항상 처음에 에러나는거 try에 뭐 안해서 그럼
			e.printStackTrace();
		}finally {
			//자원정리 : bos에서 fos를 항시 access 하고 있음,즉 fos는 항상 살아있어야함
			//자원을 가져다쓸 경우 객체 생성 역순으로 close해줘야 에러가 안난다(안전하게 하기위해)
			//암것도 안하면 garbage collector가 잡으러 옴
			//BufferedOutputStream의 close 메서드는 자원정리하기 전에 
			//buffer를 체크해서 남아있는 데이터가 있으면 flush 처리함
			if(bos!=null)try {bos.close();}catch(IOException e) {}//1
			if(fos!=null)try {fos.close();}catch(IOException e) {}//2 생성에 역순
		}
		
	}//end of main
	
}//end of p.c
