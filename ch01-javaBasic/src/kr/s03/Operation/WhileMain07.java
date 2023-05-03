package kr.s03.Operation;

public class WhileMain07 {
	public static void main(String[] args) {
		java.util.Scanner input =
				new java.util.Scanner(System.in);
		
		//은행 프로그램
		int balance =0; //잔고, 누적 or 차감
		
		while(true) {
			System.out.println("-------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 확인 | 4.종료");
			System.out.println("-------------------------------");
			
			System.out.print("메뉴 선택>");
			int num =input.nextInt();
			
			if(num==1) {
				System.out.print("예금 액>");
				//누적
				balance += input.nextInt();
			}else if(num==2) {
				System.out.print("출금 액>");
				//차감1
				balance -= input.nextInt();
			}else if(num==3) {
				System.out.printf("잔고 : %,d원%n", balance);
			}else if(num==4) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("잘못 입력했습니다.");
			}
			

		}
		
		input.close();
	}
}
