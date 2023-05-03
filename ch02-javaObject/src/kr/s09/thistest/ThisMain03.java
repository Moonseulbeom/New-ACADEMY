package kr.s09.thistest;

class ThisTest{
	//은닉화
	private int a;
	
	//캡슐화(갈색: 지역변수 파란색: 멤버변수)
	public void setA(int a) {//멤버변수(a)와 지역변수(n)이렇게 하면 잡혀감
		//멤버변수 지역변수
		this.a = a;//다 지역변수로 인식해버림 this. 붙여주자 이게 [표준]
		//지역변수 a를 보고 멤버변수 a랑 같겠구나 하고 이해할수 있다.
		//일부러 동일하게 Source-generate Getters and Setters 이용하면 편함
	}
	
	public int getA() {
		return a;
	}
}

public class ThisMain03 {
	public static void main(String[] args) {
		ThisTest tt = new ThisTest();
		tt.setA(10);
		System.out.println(tt.getA());
	}
}
