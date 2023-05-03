package kr.s17.poly;

//부모클래스
class Parent3{
	//Object의 toString 재정의
	@Override
	public String toString() {
		return "Parent 클래스";
	}
}
//자식클래스
class Child3 extends Parent3{
	//메서드 재정의
	@Override
	public String toString() {
		return "Child 클래스";
	}
}

public class InstanceofMain01 {
	public static void main(String[] args) {
		Parent3 p = new Parent3();
		//컴파일시 오류는 없지만 실행시 오류 발생
		//Child3 ch = (Child3)p; -> 객체생성x, 메모리에 안올라가있음
		
		/*객체 instanceof 자료형(class이름)
		왼쪽에 표시한 객체가 연산자 오른쪽에 
		명시한 자료형을 사용할 수 있는지 여부를
		체크/제한적인 연산자_상속관계가 있어야함
		*/
		//객체			자료형
		if(p instanceof Child3) {
			Child3 ch2 = (Child3)p;
			System.out.println(ch2);
			System.out.println("-----");
		}else {
			System.out.println(p);
			System.out.println("~~~~~~");
		}
	
	}
}
