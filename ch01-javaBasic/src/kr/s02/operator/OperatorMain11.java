package kr.s02.operator;

public class OperatorMain11 {
	public static void main(String[] args) {
		System.out.println("===조건(삼항)연산자===");
		int a = 5, b = 10;
		int max; //최대값을 저장할 변수 선언
		int min; //최소값을 저장할 변수 선언
		
		//조건(삼항)연산자(숫자 2개만 있으면 간단하게)
			//조건	참값	거짓값
		max = a>b ? a : b;//false(조건 a>b)여서 거짓값(b) 불러옴
		System.out.println("max = " + max);
			
			//조건	참값	거짓값
		min = a<b ? a : b;
		System.out.println("min = " + min);//true(조건 a<b)여서 참값(a) 불러옴
	}
}
