package kr.s03.method;

import java.util.Scanner;

//garbage collector - 쓰레기객체(안쓰는 객체_메모리만 잡아먹는) 처리
//- 프로그래머가 객체를 없앨수 없음
/*
	 * [실습]
	 * Account
	 * 1)멤버변수:계좌번호(account_num : 계좌는 보통 문자열(String로 해야함),예금주(name_String)
	 * ,잔고(balance_int)
	 * 2)멤버메서드
	 * -예금하기(deposite_void형) : balance에 값 누적
	 * 예금 처리 후 "입금이 완료되었습니다." 문구 출력
	 * -출금하기(withdraw) :balance에 값 차감
	 * 출금 처리 후 "출금이 완료되었습니다." 문구 출력
	 * -계좌정보 출력(printAccount):
	 * 계좌번호,예금주,잔고 출력
	 * 
	 * BankMain main
	 * 0)Scanner 입력하는걸로
	 * 1)Account 생성
	 * 2)계좌 기본 정보 입력 : 계좌번호,예금주,잔고
	 * 3)while(true)형식으로 반복문 안에 메뉴
	 * (1.예금 | 2.출금 | 3.잔고 확인 | 4.종류
*/

//class Account{
//	String account;
//	String name;
//	int balance;
//	int money;
//	
//	public void deposite(){
//		balance += money;
//		System.out.println("입금이 완료되었습니다.");
//	}
//	public void withdraw(){
//		balance -= money;
//		System.out.println("출금이 완료되었습니다.");
//
//	}
//	public void printAccount(){
//		System.out.printf("계좌번호 : %s%n 예금주 : %s%n 잔고 : %,d%n", account, name, balance);
//	}
//}
//public class BankMain {
//	
//	public static void main(String[] args) {
//
//		java.util.Scanner input =
//				new java.util.Scanner(System.in);
//
//		Account account = new Account();
//		
//		System.out.println("<계좌기본정보입력> ");
//		System.out.print("계좌번호 생성> ");
//		account.account = input.nextLine();
//		System.out.print("예금주 생성> ");
//		account.name = input.nextLine();
//		System.out.print("잔고 생성> ");
//		account.balance = input.nextInt();
//		
//		while(true) {
//			System.out.println("-------------------------------");
//			System.out.println("1.예금 | 2.출금 | 3.잔고 확인 | 4.종료");
//			System.out.println("-------------------------------");
//			
//			System.out.print("메뉴 선택>");
//			int num =input.nextInt();
//			
//			if(num==1) {
//				System.out.print("예금 액>");
//				account.money += input.nextInt();
//				account.deposite();
//			}else if(num==2) {
//				System.out.print("출금 액>");
//				account.money -= input.nextInt();
//				account.withdraw();
//			}else if(num==3) {
//				account.printAccount();
//			}else if(num==4) {
//				System.out.println("프로그램 종료");
//				break;
//			}else {
//				System.out.println("잘못 입력했습니다.");
//			}
//		}
//		input.close(); 내가 한거 돌아감

class Account{
	//멤버변수
	String account_num;//계좌번호
	String name;//예금주
	int balance;//잔고
	
	//멤버메서드
	//예금하기
	public void deposite(int money){
		if(money<=0) {
			System.out.println("입금액은 0보다 크게 입력하세요!");
		}else {
			//누적
			balance += money;
			System.out.println("입금이 완료되었습니다.");}
	}
	//출금하기
	public void withdraw(int money){
		if(money<=0) {
			System.out.println("출금액은 0보다 크게 입력하세요!");
		}else {
			//차감
			balance -= money;
			System.out.println("출금이 완료되었습니다.");}
	}
	//계좌정보
	public void printAccount(){
		System.out.println("계좌번호 : " + account_num);
		System.out.println("예금주 : " + name);
		System.out.printf("잔고 : %,d%n", balance);
	}
}
public class BankMain {
	public static void main(String[] args) {
	
		Scanner input =
				new Scanner(System.in);
	
		//객체 선언 및 생성
		//계좌 생성
		Account account = new Account();
		//java에선 객체 소멸할수 없음(생성만 가능)/다른 언어에선 소멸자가 있음
		
		
		//계좌 기본 정보 입력
		System.out.println("계좌 기본 정보 입력해서 계좌를 생성합니다. ");
		System.out.print("계좌번호 생성> ");
		account.account_num = input.nextLine();
		System.out.print("예금주 생성> ");
		account.name = input.nextLine();
		System.out.print("잔고 생성> ");
		account.balance = input.nextInt();
		System.out.println("-------------------------------");
		System.out.println(account.name + "님 계좌가 개설되었습니다.");
		
		while(true) {
			System.out.println("-------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 확인 | 4.종료");
			System.out.println("-------------------------------");
			
			System.out.print("메뉴 선택>");
			int num = input.nextInt();
			
			if(num==1) {//입금
				System.out.print("입금액>");
				account.deposite(input.nextInt());
			}else if(num==2) {//출금
				System.out.print("출금액>");
				account.withdraw(input.nextInt());
			}else if(num==3) {//잔고 확인
				account.printAccount();
			}else if(num==4) {//종료
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("잘못 입력했습니다.");
			}
		}
		input.close();
	}
}
//강사님이 한거, 입금 출금 0보다 크게 추가 조건 걸음