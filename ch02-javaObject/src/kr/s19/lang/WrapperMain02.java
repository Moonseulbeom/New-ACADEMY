package kr.s19.lang;

public class WrapperMain02 {
	public static void main(String[] args) {
		//기본자료형 데이터 -> 참조자료형 데이터
		//deprecated되어 사용하지 않음
		Integer obj1 = new Integer(12);
		Integer obj2 = new Integer(7);//객체 생성은 되는데 옛날 방식이니 쓰지마라
		
		//기본자료형 데이터 -> 참조자료형 데이터
		//auto boxing
		Integer obj3 = 12;
		Integer obj4 = 7;//int가 대입되면서 integer가 되었다
		
		//(정식)참조자료형 데이터 -> 기본자료형 데이터
		int result = obj3.intValue() + obj4.intValue();
		System.out.println(result);
		
		//참조자료형 데이터 -> 기본자료형 데이터
		//auto unboxing
		int result2 = obj3 + obj4;//참조+참조 ->기본
		System.out.println(result2);
		
		
		
	}//main
	
}//public class
