package kr.s10.file;

import java.io.File;
import java.io.IOException;

public class FileMain02 {
	public static void main(String[] args) {
		//절대경로 지정(전체경로를 의미하는듯)
		//String path = "S:\\javaWork\\sample.txt";
		
		//상대경로 지정(특정경로를 기본경로로 사용할때 가능)_프로젝트폴더에 만들어진다
		String path = "sample.txt";
		
		
		File f1 = new File(path);
		System.out.println("===파일 생성===");
		
		try {
			//제공된 경로를 기반으로 파일 생성.
			//파일이 생성되면 true 반환,
			//생성되지 않으면 false 반환
			//경로가 잘못되면 IOException 발생
			System.out.println(f1.createNewFile());
		}catch(IOException e) {
			e.printStackTrace();//예외문구 출력
			
		}
		
		System.out.println("===파일의 정보===");
		System.out.println("절대 경로 : " + f1.getAbsolutePath());//C~프로젝트까지
		System.out.println("상대 경로 : " + f1.getPath());
		System.out.println("디렉토리명 : " + f1.getParent());//파일이 포함되어있는 디렉토리
		//절대경로면 읽어오는데, 상대경로여서 파일명만 지정, 즉 디렉토리가 없당
		System.out.println("파일명 : " + f1.getName());
		
	}//end of main
	
}//end of p.c
