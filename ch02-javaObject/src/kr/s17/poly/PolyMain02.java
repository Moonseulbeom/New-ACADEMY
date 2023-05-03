package kr.s17.poly;

//부모클래스
class A{
	public void make() {
		System.out.println("make 메서드");
	}
}
//자식클래스
class B extends A{//make,play 다 사용가능
	public void play() {
		System.out.println("play 메서드");
	}
}

public class PolyMain02 {
	public static void main(String[] args) {//메서드로
		B bp = new B();
		bp.make();
		bp.play();
		
		A ap = bp;//자식클래스타입 -> 부모클래스타입 형변환
				 //업캐스팅, 자동적으로 형변환
				//부모영역에 있는 변수와 메서드만 사용가능
		ap.make();
		//호출 범위를 벗어나서 호출 불가(메모리에는 play 있음_단지 호출만 못함)
		//ap.play();
		
		B bp2 = (B)ap;//부모클래스타입 -> 자식클래스타입 형변환
					  //다운캐스팅, 명시적으로 형변환
		bp2.make();
		bp2.play();
		
		//참조자료형: 멤버를 호출할수 있는가 범위 지정
	}
}
