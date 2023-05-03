package kr.s11.input;

import java.io.FileInputStream;//inputstream 상속
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamMain {
	public static void main(String[] args) {
		FileInputStream fis = null;
		int readbyte;
		byte[] readbyte2;//한글처리를 위해 배열생성_string의 도움
		
		try {
			//파일로부터 데이터를 읽어오기 위해
			//FileInputStream 객체를 생성
			fis = new FileInputStream("file.txt");
			
			//파일의 정보를 한 문자씩 읽어들여 아스키 코드로 반환
			//영문이외의 문자는 깨짐(한글 박살_배열로 처리해야됨)
			//file은 ctrl+z 안해도 없으면 알아서 while문 빠져나온다
			
			/*(완전영어일때만 쓰라)얘만 쓰면 영어는 멀쩡한데 한글이 깨짐
			while((readbyte=fis.read())!=-1) {
				System.out.print((char)readbyte);//(char) 아스키코드 안쓰고 문자 그대로 받으려구
			}
			*/
			
			//영문이외의 문자도 처리가능(배열 생성)
			readbyte2 = new byte[fis.available()];//byte 개수를 알수있다
			//파일로부터 읽어들인 데이터를 byte[]에 저장
			fis.read(readbyte2);
							   //byte[] -> String 변환,생성자 이용
			System.out.println(new String(readbyte2));
			
			
		}catch(FileNotFoundException e) {//하위객체
			e.printStackTrace();
		}catch (IOException e) {//얘가 부모(상위객체)라 에러난거
			e.printStackTrace();
		}finally {
			//자원정리
			if(fis!=null)try {fis.close();}catch(IOException e) {}
		}
		
		
		
	}//end of main
	
}//end of p.c

