package kr.s20.util;

//import java.util.*; util 패키지 다 쓸수 있음
import java.util.Scanner;

public class TrainningMain {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 가위바위보 게임
		 * [입력 예시]
		 * 가위바위보 입력(0.가위,1.바위,2.보) : 1
		 * 
		 * [출력 예시]
		 * -> 컴퓨터: 가위, 사람 : 바위
		 * 결과 : 사람 승 
		 */
		
		//문자열
		String[] item = {"가위","바위","보"};
						// 0	1	 2	
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("------------------------------");
			System.out.println("1.게임하기 | 2.종료하기");
			System.out.println("------------------------------");
			System.out.print("메뉴>");
			int num = input.nextInt();
			if(num==1) {
				System.out.print("가위바위보 입력(0.가위,1.바위,2.보):");
				int user = input.nextInt();
				
				if(user < 0 || user > 2) {
					System.out.println("잘못 입력했습니다.");
					continue;
				}
							 //0~2
				int computer =(int)(Math.random()*3);
				
				/* 연산규칙
				 * 컴퓨터	 -	사용자 =	결과
				 *   0		 0		 0	무승부
				 *   0		 1		-1	사용자 승
				 *   0		 2		-2	컴퓨터 승
				 *   --------------------------
				 *   1		 0		 1	컴퓨터 승
				 *   1		 1		 0	무승부
				 *   1		 2		-1	사용자 승
				 *   --------------------------
				 *   2		 0		 2	사용자 승
				 *   2		 1		 1	컴퓨터 승
				 *   2		 2		 0	무승부
				 */
				
				int result = computer - user;
				
				System.out.println("-> 컴퓨터 : " + item[computer] + ", 사람 : " + item[user]);
				
				System.out.print("결과 : ");
				if(result == -1 || result == 2) {
					System.out.println("사람 승");
				}else if(result == -2 || result == 1) {
					System.out.println("컴퓨터 승");
				}else {//0일 경우
					System.out.println("무승부");
				}
				
			}else if(num==2) {
				System.out.println("게임을 종료합니다.");
				break;
			}else {
				System.out.println("잘못 입력했습니다.");
			}
			
		}//end of while
		
		input.close();
		
	}//end of main

}//end of public class
