package kr.s15.serial;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.ArrayList;


public class SerialMain01 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		//직렬화할 객체 생성
		UserInfo u1 = new UserInfo("John",20,"서울시");
		UserInfo u2 = new UserInfo("Sunny",18,"부산시");
		
		ArrayList<UserInfo> list = new ArrayList<UserInfo>();
		
		list.add(u1);
		list.add(u2);

		try {
			fos = new FileOutputStream("userInfo.ser");//파일명
			oos = new ObjectOutputStream(fos);
			
			//객체직렬화 수행
			oos.writeObject(list);
			
			System.out.println("직렬화가 성공적으로 완료되었습니다.");
			
		}catch(IOException e) {
			e.printStackTrace();//예외문구 출력
		}finally {
			//자원정리
			if(oos!=null)try {oos.close();}catch(IOException e) {}
			if(fos!=null)try {fos.close();}catch(IOException e) {}
		}
	
		
		
		
		
	}//end of main
	
}//end of p.c
