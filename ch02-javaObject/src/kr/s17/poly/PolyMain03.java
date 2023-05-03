package kr.s17.poly;

//부모클래스
class Parent2{
	int a = 10;
	public void make() {
		System.out.println("부모클래스의 make");
	}
}
//자식클래스
class Child2 extends Parent2{
	int b = 20;
	//메서드 재정의
	@Override
	public void make() {
		System.out.println("자식클래스의 make");
	}
}

public class PolyMain03 {//메서드 오버라이딩 되면?
	public static void main(String[] args) {
		/*
		 * 다형성(Polymorphism)
		 * 다형성은 여러가지 형태를 가질 수 있는 능력
		 * 자바에서는 한 타입의 참조변수로 여러 타입의 객체를 
		 * 참조할 수 있도록 함으로써 다형성을 프로그램적으로 구현
		 * 부모클래스 타입의 참조 변수로 자식클래스의 객체를 참조
		 */
		
		Child2 ch = new Child2();
		ch.make();
		System.out.println("---------------");
		
		Parent2 p = ch;//자식클래스타입->부모클래스타입 형변환
		//(중요)재정의가 되어있는 메서드는 부모클래스타입으로 형변환을 해도
		//자식클래스에 재정의된 메서드가 호출
		//_확장 개념으로 받아들여져서 부모클래스가 호출되지 않음, super를 써야함
		p.make();
		System.out.println("---------------");

	}
}
