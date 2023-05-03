package kr.s22.finaltest;//상수 final - 변수에

class A{
	//지정한 값은 변경 불가능_전부 대문자로 써야함_권장사항(의무는 아님)
	//ctrl+shift+x : 대문자 ,ctrl+shift+y : 소문자
	final int NUM = 10;
	//static 상수(객체에 포함x 호출하면 메모리로)_공유의 개념
	public static final int NUMBER = 20; //public static final 이 3개는 위치가 정해지지 않음 변경해도 오류 안남
	
}

public class FinalMain01 {
	public static void main(String[] args) {
		A ap = new A();
		//상수는 변경 불가능, 가져다 쓰기만 해야함
		//ap.NUM = 200;
		System.out.println(ap.NUM);
		
		System.out.println(A.NUMBER);
		
		//(지역상수)지역적인 상수 메소드내에서만 사용가능 블럭 지나면 사라짐
		final int NO = 30; 
		System.out.println(NO);
		
	}//end of main
	
}//end of public class
