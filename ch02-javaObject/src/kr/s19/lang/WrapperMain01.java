package kr.s19.lang;

public class WrapperMain01 {
	public static void main(String[] args) {
		//기본자료형 데이터
		boolean b = true;
		
		//참조자료형 데이터
		//deprecated되어서 사용하지 않음(완곡한 거절)_쓰지마라
		Boolean wrap_b = new Boolean(b);
		//기본자료형 데이터 -> 참조자료형 데이터로 변환
		//auto boxing
		Boolean wrap_b2 = b;
		
		//참조자료형 데이터 -> 기본자료형 데이터로 변환
		boolean b2 = wrap_b2.booleanValue();//메서드 사용(옛날 방식)
		System.out.println(b2);
		
		System.out.println(wrap_b2);//요즘 방식
		
	}//main

}//public class
