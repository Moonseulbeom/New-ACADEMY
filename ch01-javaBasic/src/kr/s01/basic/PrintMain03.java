package kr.s01.basic;
public class PrintMain03 {
	public static void main(String[] args) {
		//문자 : 한 문자
		System.out.println('A');
		System.out.println('가');
		//두 문자는 문자열이기 때문에 '' 사용할 수 없음
		//System.out.println('하늘');
		
		//문자열 : 한 문자 이상의 문자들
		System.out.println("바다");
		System.out.println("Bus");
		System.out.println("A");
		System.out.println("산");
		
		//숫자(정수_소수점 자리 없음)
		System.out.println(23);
		//숫자(실수_소수점 자리 있음)
		System.out.println(25.69);
		
		//논리값(boolean_""쓰면 java에선 문자열로 받아들임 안된다)
		System.out.println(true);
		System.out.println(false);
		
	}
}
