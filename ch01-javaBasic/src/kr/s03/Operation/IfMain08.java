package kr.s03.Operation;

public class IfMain08 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 입력받은 3개의 정수 중 최대값, 최소값 구하시오
		 * (동일한건 안함_조건 단순화)
		 */
		
		/*java.util.Scanner input =
				new java.util.Scanner(System.in);
		
		int a,b,c;
		System.out.print("첫번째 정수 입력 :");
		a = input.nextInt();
		System.out.print("두번째 정수 입력 :");
		b = input.nextInt();
		System.out.print("세번째 정수 입력 :");
		c = input.nextInt();
		
		if(a>b && b>c) {
			System.out.print("최대값 :" + a);
			System.out.print("최소값 :" + c);
		}else if(a<b && b<c) {
			System.out.print("최대값 :" + c);
			System.out.print("최소값 :" + a);
		}else if(a>c && b>a) {
			System.out.print("최대값 :" + b);
			System.out.print("최소값 :" + c);
		}
		input.close();
		*/
		//되긴 되는데 왜 되는지 모르겠음;;
		
		
		java.util.Scanner input =
				new java.util.Scanner(System.in);
		
		System.out.print("정수 a :");
		int a = input.nextInt();
		System.out.print("정수 b :");
		int b = input.nextInt();
		System.out.print("정수 c :");
		int c = input.nextInt();
		
		//최대값 구하기
		int max = a;//조건 체크를 위한 기준값을 설정
		if(b > max) max = b;//{}생략
		if(c > max) max = c;
		
		//최소값 구하기
		int min = a;//조건 체크를 위한 기준값을 설정
		if(b < min) min = b;
		if(c < min) min = c;
		
		System.out.println("최대값은 " + max + "입니다.");
		System.out.println("최소값은 " + min + "입니다.");

		input.close();
		
		
	}	
}
