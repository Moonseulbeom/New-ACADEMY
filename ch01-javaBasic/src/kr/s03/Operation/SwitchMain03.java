package kr.s03.Operation;

public class SwitchMain03 {
	public static void main(String[] args) {
		java.util.Scanner input =
				new java.util.Scanner(System.in);
		int score;
		char grade;
		
		System.out.print("성적 입력 : ");
		score = input.nextInt();
			//(정수/정수->정수(소수점자리 없음))
		if(score<0 || score>100) {
			System.out.println("성적은 0~100만 입력 가능");
			System.exit(0);//프로그램 종료, 일종의 안전장치
		}
		//케이스가 너무 많아서 줄여버린거)
		switch(score/10) {
		case 10:
		//grade = 'A';
		//break;
		//더 줄여버림
		case 9:
			grade = 'A';
			break;	
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;	
		case 6:
			grade = 'D';
			break;	
		default:
			grade = 'F';
		}
		
		System.out.println();//단순 줄 바꿈
		System.out.printf("성적 : %d%n", score);
		System.out.printf("등급 : %c%n", grade);

		input.close();
				
	}
}

/*
100       A	10
90 ~ 99 A	9
80 ~ 89 B	8
70 ~ 79 C	7	
60 ~ 69 D	6

10으로 나누고(정수/정수)임으로 소수점 절삭
 */
