package kr.s03.method;

public class MethodArgMain01 {//method 분류(1) 
	//인자 전달방식 : 값에 의한 호출 (call by value)
	//기본 자료형의 값을 인자로 전달하는 방식.
	//값을 복사하여 전달.
	public int increase(int n) {
		++n;
		return n;
	}
	
	public static void main(String[] args) {
		//변수 선언 및 초기화
		int var1 = 100;
		
		//객체 선언 및 생성
		MethodArgMain01 ma = new MethodArgMain01();
		
		//멤버메서드를 호출하고 var1의 값을 복사해서
		//메서드의 인자에 전달
		int var2 = ma.increase(var1);
		
		System.out.println("var1 : " + var1 + ", var2 : " + var2);
	}
}
