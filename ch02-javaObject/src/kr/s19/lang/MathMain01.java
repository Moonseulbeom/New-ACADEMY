package kr.s19.lang;

public class MathMain01 {
	public static void main(String[] args) {
		//절대값 -> 삼항연산자로 하던거, 기존 class Math 쓰면 간편하게 알수있다.
		int a = Math.abs(-10);
		System.out.println("절대값 : " + a);//10
		
		//올림<->반올림, 반환타입 double = double 통일 
		double b = Math.ceil(3.3);
		System.out.println("올림 : " + b);//4.0

		//절삭(버림 or 내림)
		double c = Math.floor(3.7);
		System.out.println("절삭 : " + c);//3.0

		//반올림
		int d = Math.round(3.7f);//int or long 하나 고르기
		System.out.println("반올림 : " + d);//4(int)

		//최대값
		int e = Math.max(3, 5);
		System.out.println("최대값 : " + e);//5

		//최소값
		int f = Math.min(4, 7);//자료형 결정해주기,반환값도 동일
		System.out.println("최소값 : " + f);//4
		
	}//main
	
}//public class
