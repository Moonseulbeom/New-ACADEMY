package kr.s02.operator;

public class OperatorMain14 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * A전자 대리점에서는 그날 물건 판매액의 15%를 할인해주기로 했습니다.
		 * 판매한 상품명과 상품의 단가와 수량을 키보드로 입력받아서
		 * 지불 금액을 출력하는 프로그램을 작성하시오.
		 * (단, 출력시에는 소수점이하는 절삭:정수형태)
		 * 
		 * [입렵 및 출력예시]
		 * 상품명 입력 : 냉장고
		 * 단가 입력 : 500000
		 * 판매 수량 입력 : 3
		 * 냉장고 3대의 가격은 1,275,000원(15%할인해준거)
		 */
		java.util.Scanner input =
				new java.util.Scanner(System.in);
		//문자열 입력 : input.nextLine()
		// 숫자(정수)입력 : input.nextInt()

		/*
		System.out.println("상품명 입력 : ");
		String num = input.next();
		
		int a = input.nextInt();//단가
		int b = input.nextInt();//판매수량
		int c = a*b;//전체 판매액
		double d = 0.15;//할인률
		double e = c - (c*d);//지불금액


		System.out.println("단가 입력 : " + a);
		System.out.println("판매 수량 입력 : " + b);
		System.out.println("지불금액 : " + (int)(e));

		input.close();
		*/
		//내가 한거
		
		System.out.print("상품명 입력:");
		String item = input.nextLine();//문자열이라 String
		
		System.out.print("단가 입력:");
		int price = input.nextInt();//숫자라 int
		
		/*int price = input.nextInt();//숫자라 int	
		System.out.printf("단가 입력:%,d원%n", price);
		*/
		
		System.out.print("판매 수량 입력:");
		int quantity = input.nextInt();
		
		//int total = (int)(price*quantity*0.85); 1번 방법
		//0.85가 실수(double)이라 정수형태로 바꿔주기 위해 앞에(int)붙임_캐스팅
		int total = price*quantity*85/100; //2번 방법
		System.out.printf("%s %d대의 가격은 %,d원",item,quantity,total);
		
		input.close();
		//강사님이 한거
		
		//변수 선언은 위-아래로 간다.
		
	}
}
