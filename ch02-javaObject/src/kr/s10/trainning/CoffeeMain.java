package kr.s10.trainning;

import java.util.Scanner;

class coffee {
	int amount;// 투입금액, 누적금액
	int change = 1000;// 거스름돈(일정 값 가지고 출발)

	int coffee = 10;// 초기 커피양
	int cream = 10;// 초기 프림양
	int suger = 10;// 초기 설탕양
} 

/*
 * [실습]
 * 메뉴 -> 1.커피마시기(동전 차감, 투입금액 증가),2.커피정보보기(정보 출력),3.종료(while문 쓸꺼)
 * 1)커피마시기
 * [입력 예시]
 * 동전을 넣으세요(300원_커피가격):
 * 구매 수량 입력:
 * 
 * (조건체크)
 * 입력하는 동전과 구매 수량은 0이하 x
 * 거스름돈이 부족한지 여부 체크
 * 커피가 부족한지 여부 체크
 * 프림이 부족한지 여부 체크
 * 설탕이 부족한지 여부 체크
 * 
 * (연산)
 * 커피차감(5)
 * 프림차감(3) 
 * 설탕차감(1)
 * 거스름돈차감
 * 투입한 금액 누적
 * 
 * [출력 예시]
 * 거스름 돈 : **
 * 맛 좋은 커피가 2잔 준비되었습니다.
 * 
 * 2.커피정보보기
 * 커피양 : *
 * 프림양 : *
 * 설탕양 : *
 * 거스름돈 보유금액(change) : **원
 * 누적금액(amount) : **원
 */


public class CoffeeMain {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
				
		coffee coffee = new coffee();
		
		while (true) {
			System.out.println("-----------------------------------");
			System.out.println("1.커피마시기 | 2.커피정보보기 | 3.종료");
			System.out.println("-----------------------------------");
			
			System.out.print("메뉴 선택>");
			int num = input.nextInt();

			if (num == 1) {// 커피마시기
				System.out.println("동전을 넣으세요(300원)");
				int coin =input.nextInt();
				
				System.out.println("구매 수량 입력:");
				int count = input.nextInt();
				
				//조건체크 
				//0이하의 숫자는 입력불가(coin,count)
				if(coin<=0 || count<=0) {
					System.out.println("0이하의 숫자는 입력불가");
					continue;
				}
				
				//투입 동전이 부족함
				if(coin < count*300) {
					System.out.println("동전이 부족합니다.");
					continue;
				}
				
				//거스름돈이 부족함
				if(coin-count+300 > coffee.change) {
					System.out.println("거스름돈이 부족합니다.");
					continue;
				}
				
				//커피가 부족함
				if(coffee.coffee < count*5) {
					System.out.println("커피가 부족합니다");
					continue;
				}
				
				//프림이 부족함
				if(coffee.cream < count*3) {
					System.out.println("크림이 부족합니다");
					continue;
				}
				
				//설탕이 부족함
				if(coffee.suger < count*1) {
					System.out.println("설탕이 부족합니다");
					continue;
				}
				
				//연산
				//커피 차감
				coffee.coffee -= count*5;
				//프림차감
				coffee.cream -= count*3;
				//설탕차감
				coffee.suger -= count*1;
				//거스름돈 차감
				coffee.change -= (coin-count*300);
				//투입한 금액 누적
				coffee.amount += coin;
				
				System.out.println("거스름돈 : " + (coin - count * 300));
				System.out.println("맛 좋은 커피가 " + count + "잔 준비되었습니다.");
						
				
			} else if (num == 2) {// 커피정보보기
				System.out.println("------------------------------------");
				System.out.println("커피양:" + coffee.coffee);
				System.out.println("프림양:" + coffee.cream);
				System.out.println("설탕양:" + coffee.suger);
				System.out.printf("거스름돈 보유금액:%,d원%n", coffee.change);
				System.out.printf("누적금액:%,d원%n", coffee.amount);

			} else if (num == 3) {// 종료
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("잘못 입력했습니다.");
			}
			
		} // end of while (커피 프로그램 반복)
		input.close();
	} // end of main
}