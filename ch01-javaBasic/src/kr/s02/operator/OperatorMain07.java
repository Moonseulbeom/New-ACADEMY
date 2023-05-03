package kr.s02.operator;

public class OperatorMain07 {
	public static void main(String[] args) {
		System.out.println("===비교(관계)연산자===");
		boolean result;
		int a = 10;
		double b = 10.5;
		
		result = a < b; //int가 double로 형변환됨 10.0과 10.5비교
		System.out.println("a < b : " + result);
		
		result = a > b;
		System.out.println("a > b : " + result);
		
		result = a <= b;//or의 개념
		System.out.println("a <= b : " + result);
		
		result = a >= b;//or의 개념
		System.out.println("a >= b : " + result);
		
		result = a == b;//同의 개념
		System.out.println("a == b : " + result);
		
		result = a != b;//다르다(부정)
		System.out.println("a != b : " + result);
		
		//결과적으로 boolean데이터 만들어주기
	}
}
