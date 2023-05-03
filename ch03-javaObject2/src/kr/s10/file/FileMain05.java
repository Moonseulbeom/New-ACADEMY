package kr.s10.file;

import java.io.File;

public class FileMain05 {
	public static void main(String[] args) {
		//절대경로 지정
		String path = "C:\\javaWork\\javaSample";
		
		System.out.println("===디렉토리 생성===");
		
		File f1 = new File(path);
		//디렉토리를 생성한 후 true를 반환하고
		//생성할 수 없으면 false 반환
		System.out.println(f1.mkdir());
	
		System.out.println("===디렉토리 삭제===");
		//디렉토리를 삭제할 수 있으면 삭제 후 true 반환
		//삭제할 수 없으면 false 반환
		if(f1.delete()) {
			System.out.println(f1.getName() + " 디렉토리 삭제");
		}else {
			System.out.println("디렉토리를 삭제할 수 없습니다.");
		}
		
		
		
	}//end of main
}//end of p.c
