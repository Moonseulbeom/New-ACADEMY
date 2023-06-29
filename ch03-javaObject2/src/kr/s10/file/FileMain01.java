package kr.s10.file;//안보이는거 다 숨김폴더

import java.io.File;

public class FileMain01 {
	public static void main(String[] args) {
		//경로 지정_\가 하나만 쓰긴 한데 java가 멍청해서 2개씀
		String path = "C:\\";
		
		File f = new File(path);
		
		//C드라이브가 존재하지 않는지 or 디렉토리가 아닌지
		if(!f.exists() || !f.isDirectory()) {//존재하지 않으면(부정) if블럭 안으로 진입
			System.out.println("유효하지 않은 디렉토리입니다.");
			//프로그램 종료
			System.exit(0);
		}
		
		//지정한 경로의 하위 디렉토리와 파일 정보를
		//File 배열로 반환
		File[] files = f.listFiles();
		
		for(int i=0;i<files.length;i++) {
			File f2 = files[i];
			if(f2.isDirectory()) {
				//디렉토리인 경우
				System.out.println("["+f2.getName()+"]");//디렉토리명
			}else {
				//파일인 경우
				System.out.print(f2.getName());//파일명
				System.out.printf("(%,dbytes)\n", f2.length());
				//단위가 bytes 딴걸로 할꺼면 연산해야함		파일의 용량
			}
		}
		
		
		
		
		
		
	}//end of main
	
}//end of p.c
