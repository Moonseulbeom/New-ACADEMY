package kr.s15.serial;//역직렬화

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class CustomerMain02 {
	public static void main(String[] args) {
		System.out.println("===역직렬화하기===");
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("object.ser");//파일명
			ois = new ObjectInputStream(fis);

			//역직렬화 수행
			Customer m = (Customer)ois.readObject();
			System.out.println(m);
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}finally {
			//자원정리
			if(ois!=null)try {ois.close();}catch(IOException e) {}
			if(fis!=null)try {fis.close();}catch(IOException e) {}
		}
		
		
	}//end of main
	
}//end of p.c
