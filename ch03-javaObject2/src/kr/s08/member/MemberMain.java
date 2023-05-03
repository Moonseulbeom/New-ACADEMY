package kr.s08.member;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MemberMain {
	/*
	 * [실습]
	 * ArrayList에 Member객체를 저장하는 방식으로
	 * 회원 정보를 관리
	 * 메뉴 : 1.회원정보입력, 2.회원정보출력, 3.종료
	 * 조건체크 : 회원정보를 입력 받을 때 나이는
	 * 			1살이상 입력 가능
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
			//예외문구를 콘솔에 출력
			e.printStackTrace();
		}finally {
			//자원정리 조건체크하고 클로즈
			if(br!=null)try {br.close();}catch(IOException e) {}
		}
		
	}//end of public ProductMain()
	
	//메뉴
	public void callMenu()throws IOException{
		while(true) {
				System.out.print("1.회원정보입력,2.회원정보출력,3.종료>");
				try {
					int num = Integer.parseInt(br.readLine());//readLine에서 throws IOException 오류 발생하기도
					if(num == 1) {
						register();
					}else if(num == 2) {
						printUserInfo();
					}else if(num == 3) {
						System.out.println("프로그램 종료");
						break;
					}else {
						System.out.println("잘못 입력했습니다.");
					}
				}catch(NumberFormatException e) {//Integer.parseInt에서 오류날지도
				System.out.println("숫자만 입력하세요!");
				}
			}//end of while
		}
	
	//회원가입
	public void register()throws IOException{
		Member m = new Member();
		
		System.out.print("이름:");
		m.setName(br.readLine());
		m.setAge(parseInputData("나이:"));
		System.out.print("직업:");
		m.setJob(br.readLine());
		System.out.print("주소:");
		m.setAddress(br.readLine());
		System.out.print("전화번호:");
		m.setPhone(br.readLine());

		//ArrayList에 Member를 저장
		list.add(m);
	}
	//나이 조건 체크하는 메서드
	public int parseInputData(String data)throws IOException{
		while(true) {
			System.out.println(data);
			try {
				int age = Integer.parseInt(br.readLine());
				if(age<=0) {
					System.out.println("나이는 1살이상 입력 가능");
					continue;
				}
				return age;
			}catch(NumberFormatException e) {
				System.out.println("숫자만 입력하세요!");
			}
		}
	}
	//회원정보출력
	public void printUserInfo() {
		System.out.println("총회원수("+list.size()+")");
		System.out.println("-------------------------");
		System.out.println("이름\t나이\t직업\t주소\t전화번호");
		System.out.println("-------------------------");
		
		for(Member m : list) {
			System.out.print(m.getName()+"\t");
			System.out.print(m.getAge()+"\t");
			System.out.print(m.getJob()+"\t");
			System.out.print(m.getAddress()+"\t");
			System.out.print(m.getPhone()+"\n");
			}
		}
		
	public static void main(String[] args) {
		new MemberMain();
	}//end of main
	
}//end of p.c
