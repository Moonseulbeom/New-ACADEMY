package kr.s24.interfacetest;//interface - 자료형 사용(형변환)
//보다보면 class랑 비슷하다, 근데 내용이 없다 다른거다 인터페이스는 형식을 가져다가 쓰는거 ㅇㅋ


//인터페이스
interface InterSub{
	//추상메서드
	public void make();
}
class InterCenter implements InterSub{//추상메서드 구현해라
	//인터페이스의 추상메서드 구현
	@Override
	public void make() {
		System.out.println("make메서드");
	}
	
	public void play() {
		System.out.println("play메서드");
	}
	
	
}//end of class InterCenter implements InterSub

public class InterMain04 {
	public static void main(String[] args) {
		InterCenter ic =new InterCenter();
		ic.make();
		ic.play();
		
		InterSub is = ic;//클래스타입 -> 인터페이스타입으로 형변환(업캐스팅x)
						//자동적으로 형변환
		is.make();
		//호출 범위를 벗어나 호출이 불가
		//is.play();
		
		//인터페이스타입 -> 클래스타입 형변환
		//명시적으로 형변환
		InterCenter ic2 = (InterCenter) is;
		ic2.make();
		ic2.play();
		
		
	}//end of main
	
}//end of p.c
