package kr.s13.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderMain {
	public static void main(String[] args) {
		//변수지정
		FileReader fr = null;
		int readChar;
		
		try {
			fr = new FileReader("file.txt");//상대경로
			//파일로부터 데이터를 한 문자씩 읽어들여 
			//유니코드로 반환(2byte입력처리_한글도 ㅇㅋ)
			while((readChar = fr.read())!=-1) {//-1지점되면 반환함
				System.out.print((char)readChar);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			//자원정리
			if(fr!=null)try {fr.close();}catch(IOException e) {}
		}
		
		
		
		
		
	}//end of main
	
}//end of p.c

/*
read - 아스키코드 x, 유니코드 o 

*/