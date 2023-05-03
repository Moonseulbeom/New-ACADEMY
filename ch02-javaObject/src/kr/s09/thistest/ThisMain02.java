package kr.s09.thistest;

public class ThisMain02 {
	
	public ThisMain02() {
		System.out.println("객체 생성 : " + this);
	}
	
	public static void main(String[] args) {
		ThisMain02 tm = new ThisMain02();//tm 객체의 주소(referense)
		System.out.println("객체 생성 후 : " + tm);
		
//참조값: 가공된 주소_kr.s09.thistest.ThisMain02@7d6f77cc
		
//객체 생성 : kr.s09.thistest.ThisMain02@7d6f77cc
//객체 생성 후 : kr.s09.thistest.ThisMain02@7d6f77cc
//this : 객체 내부에서 객체를 나타낸다		

	}
}
