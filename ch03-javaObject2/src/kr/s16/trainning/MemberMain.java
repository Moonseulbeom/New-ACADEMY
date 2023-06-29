package kr.s16.trainning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;

public class MemberMain {
	/*
	 * [실습]
	 * ArrayList에 Member 객체를 저장
	 * 메뉴 : 회원정보입력, 회원정보출력, 파일생성,파일읽기,종료
	 * 조건체크 : 나이는 1살이상 입력가능
	 */
	
	ArrayList<Member> list;//제네릭 표현 써주기
	BufferedReader br;
	
	//생성자
	public MemberMain() {
		list = new ArrayList<Member>();
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			callMenu();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(br!=null)try {br.close();}catch(IOException e) {}
		}
	}//end of public MemberMain()
	
	//메뉴
	public void callMenu()throws IOException{
		while(true) {
				System.out.print("1.회원정보입력 | 2.회원정보출력 | 3.파일생성 | 4.파일읽기 |5.종료>");
				try {
					int num = Integer.parseInt(br.readLine());
					
					if(num==1) {
						register();
					}else if(num==2) {
						printUserInfo();
					}else if(num==3) {
						createFile();
					}else if(num==4) {
						readFile();
					}else if(num==5) {
						System.out.println("프로그램 종료");
						break;
					}else {
						System.out.println("잘못 입력했습니다.");
					}
				}catch(NumberFormatException e) {
					System.out.println("숫자만 입력 가능");
				}
		}//end of while
	
	}//end of public void callMenu()throws IOException
	
	//회원가입
	public void register() throws IOException{
		System.out.println("이름: ");
		String name = br.readLine();
		
		int age = parseInputData("나이:");
		
		System.out.println("직업: ");
		String job = br.readLine();
		
		System.out.println("주소: ");
		String address = br.readLine();
		
		System.out.println("휴대폰: ");
		String phone = br.readLine();
		
		System.out.println("취미: ");
		String hobby = br.readLine();
		
		Member m = new Member(name,age,job,address,phone,hobby);
		
		//ArrayList에 Member 객체 저장
		list.add(m);

	}//end of public void register() throws IOException
	
	//나이 조건 체크
	public int parseInputData(String msg)throws IOException{
		while(true) {
			System.out.print(msg);
			try {
				int age = Integer.parseInt(br.readLine());
				if(age<=0) {
					System.out.println("나이는 1살 이상 입력 가능");
					continue;//계속 루프 돌게(회차만 스킵하게)
				}
				return age;
			}catch(NumberFormatException e) {
				System.out.println("숫자만 입력 가능");
			}
		}
	}//end of public int parseInputData(String msg)throws IOException
	
	//회원목록출력
	public void printUserInfo() {
		System.out.println("총회원수("+list.size()+")");
		System.out.println("-----------------------------");
		System.out.println("이름\t나이\t직업\t주소\t휴대폰\t취미");
		System.out.println("-----------------------------");
		
		for(Member m : list) {
			System.out.print(m.toString());//아래도 되는데 toString으로 포맷준거
//			System.out.print(m.getName()+"\t");
//			System.out.print(m.getAge()+"\t");
//			System.out.print(m.getJob()+"\t");
//			System.out.print(m.getAddress()+"\t");
//			System.out.print(m.getPhone()+"\t");
//			System.out.print(m.getHobby()+"\n");
			}
		
	}//end of public void printUserInfo()
	
	//파일 생성
	public void createFile() {
		FileWriter fw = null;
		try {
			//덮어쓰기
			fw = new FileWriter("score.txt");
			
			fw.write("총회원수("+list.size()+")\n");
			fw.write("------------------------------\n");
			fw.write("이름\t나이\t직업\t주소\t휴대폰\t취미\n");
			fw.write("------------------------------\n");

			for(Member m : list) {
				fw.write(m.toString());//아래도 되는데 toString으로 포맷준거
//				fw.write(m.getName()+"\t");
//				fw.write(m.getAge()+"\t");
//				fw.write(m.getJob()+"\t");
//				fw.write(m.getAddress()+"\t");
//				fw.write(m.getPhone()+"\t");
//				fw.write(m.getHobby()+"\n");
				}
				fw.flush();
				System.out.println("파일에 회원정보를 저장했습니다.");
			
		}catch(IOException e) {
			System.out.println("파일 생성 오류");
		}finally {
			if(fw!=null)try {fw.close();}catch(IOException e) {}
		}
	}
	//파일 읽기
	public void readFile() {
		//변수지정
		FileReader fr = null;
		int readChar;
		
		try {
			fr = new FileReader("score.txt");
			while((readChar = fr.read())!=-1) {
				System.out.print((char)readChar);
			}
		}catch(FileNotFoundException e) {
			System.out.println("생성된 파일이 없습니다.");
		}catch(IOException e) {
			System.out.println("파일 읽기 오류");
		}finally {
			//자원정리
			if(fr!=null)try {fr.close();}catch(IOException e) {}
		}
		
	}//end of public void readFile()
	
	public static void main(String[] args) {
		new MemberMain();
	}//end of main
	
}//end of p.c
