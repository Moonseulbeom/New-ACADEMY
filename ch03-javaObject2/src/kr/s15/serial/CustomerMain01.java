package kr.s15.serial;//직렬화

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CustomerMain01 {
	public static void main(String[] args) {
		System.out.println("===객체직렬화하기===");
		
		//변수선언
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		//직렬화할 객체 생성
		Customer c = new Customer("홍길동");
		
		try {
			fos = new FileOutputStream("object.ser");//파일명
			oos = new ObjectOutputStream(fos);
			oos.writeObject(c);//객체직렬화 수행
			System.out.println("객체직렬화가 완료되었습니다.");
			
		}catch(IOException e) {
			e.printStackTrace();//예외문구 출력
		}finally {
			if(oos!=null)try {oos.close();}catch(IOException e) {}
			if(fos!=null)try {fos.close();}catch(IOException e) {}
		}
	
		
		
		
	}//end of main
	
}//end of p.c
/*
 * 이클립스가 UTF-8 지원해서 홍길동 안깨진거
*/
