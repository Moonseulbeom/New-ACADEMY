package kr.s24.interfacetest;
//(매우 중요하다_고니 옆 고광렬)인터페이스 - 클래스 보조하는 친구
//src 원본소스는 .java 파일 1인데 bin 들어가면 class 두개로 나누어져있다
//호출시 enum과 비슷해보이지만 다르다/static하게 쓸뿐 그룹으로 묶인것은 아님

//인터페이스
//상수, 추상메서드 정의가능
interface A1{
	//상수(원형)_호출만 하면 메모리
	public static final int W = 10;
	//public static final 생략
	int X = 20;
	//public final 생략
	static int Y = 30;
	//public static 생략
	final int Z = 40;
}


public class InterMain01 {
	public static void main(String[] args) {
		//인터페이스는 객체 생성 불가능(호출 X)_자료형으로 사용가능?
		//A1 ap = new A1();
		//인터페이스에 정의된 상수 호출
		System.out.println("W = " + A1.W);
		System.out.println("X = " + A1.X);
		System.out.println("Y = " + A1.Y);
		System.out.println("Z = " + A1.Z);

		
		
		
	}//end of main
	
}//end of p.c
