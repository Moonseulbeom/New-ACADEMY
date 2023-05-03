package kr.s18.bank;

/*
 * [실습]
 * 기본 계좌
 * 멤버변수: 계좌번호(number_String),비밀번호(password_String), 예금주(name_String), 잔고(balance_int)
 * 생성자: 인자가 있는 생성자
 * 		- "010-123 계좌가 개설되었습니다."
 * 멤버메서드: 
 * 입금(deposite_void) - 0이하의 금액은 입금할 수 없습니다.
 * 					  - "1000원이 입금되었습니다."
 * 출금(withdraw_void) - 0이하의 금액은 입금할 수 없습니다.
 * 					  - "1000원이 출금되었습니다."
 * 계좌정보(printAccount) - (일반)계좌번호,비밀번호,예금주,잔고
 * 
 */

public class BankAccount {
	//멤버변수
	protected String number;//계좌번호
	protected String password;//비밀번호
	protected String name;//예금주
	protected int balance;//잔고
	
	//생성자
	public BankAccount(String number, String password, String name, int balance) {
		this.number = number;
		this.password = password;
		this.name = name;
		this.balance = balance;
		System.out.println(number + "계좌가 개설되었습니다.");
		return;
	}
	
	//예금하기
	public void deposite(int amount){
		if(amount<=0) {
			System.out.println("0이하의 금액은 입금할 수 없습니다.");
			return;//빠져나가기
		}
		balance += amount;//누적
		System.out.printf("%,d원이 입금되었습니다.%n", amount);
		
	}//deposite
	
	//출금하기
	public void withdraw(int amount){
		if(amount<=0) {
			System.out.println("0이하의 금액은 출금할 수 없습니다.");
			return;
		}
		if(balance < amount) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		balance -= amount;//차감
		System.out.printf("%,d원이 출금되었습니다.%n", amount);
		
	}//withdraw
	
	//계좌정보 출력
	public void printAccount() {
		System.out.println("(일반)계좌번호 : "+ number);
		System.out.println("비밀번호 : "+ password);
		System.out.println("예금주 : "+ name);
		System.out.printf("잔고 : %,d원%n", balance);

	}

}//public class Account
