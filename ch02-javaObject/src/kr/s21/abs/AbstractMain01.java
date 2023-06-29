package kr.s21.abs;//추상클래스?

//추상클래스_일반적으로 추상메서드를 가짐(AbstractMain02로~)
//미완성된 개념으로 단독으로 객체 생성이 불가능하고
//일반적으로 자식클래스에 상속되어져서 사용함
abstract class A{
	//일반변수
	private int x;
	//일반메서드
	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		return x;
	}
}//end of abstract class A

//자식클래스
class B extends A{
	int b = 200;
}

public class AbstractMain01 {
	public static void main(String[] args) {
		//추상클래스는 단독으로 객체 생성 불가능
		//type A는 class A의 의미
		//A ap = new A();
		
		B bp = new B();
		bp.setX(100);
		System.out.println(bp.getX());
		System.out.println(bp.b);
		
	}//end of main
	
}//end of public class
