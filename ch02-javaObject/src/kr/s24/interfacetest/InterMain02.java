package kr.s24.interfacetest;

//인터페이스_일반 클래스에다 구현해줘야함_별모양 **모양 쿠키 틀(있으면 편하다 편한게 최고다)
//(상속x_얘가 클래스는 아님 class != interface)
//일종의 가이드라인? 가사없이 멜로디만 준 노래파일 느낌?
//class형식과 내용을 같이 만듦
//형식은 미리 만들고 나중에 내용을

interface A2{
	//추상메서드
	public abstract void make();//원형
	//public abstract 생략
	void play();
}
//클래스
class B2 implements A2{//상속x, 구현임_추상메서드 적용 호출되지 않기위해 구현의 의무를 지운다
	//인터페이스의 추상메서드를 구현
	@Override
	public void make() {
		System.out.println("make 메서드");
	}
	@Override
	public void play() {
		System.out.println("play 메서드");
	}
}


public class InterMain02 {
	public static void main(String[] args) {
		B2 bp = new B2();
		bp.make();
		bp.play();
		
		
		
		
	}//end of main
}//end of p.c
