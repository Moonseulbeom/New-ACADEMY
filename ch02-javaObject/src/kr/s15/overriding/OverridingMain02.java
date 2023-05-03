package kr.s15.overriding;

//부모클래스
class Mother{
	public String getLunch() {
		return "밥";
	}
}
//자식클래스
class Son extends Mother{
	//Mother의 getLunch() 사용
}
class Daughter extends Mother{
	//메서드 재정의
	@Override
	public String getLunch() {
		return "빵";
	}
}

public class OverridingMain02 {
	public static void main(String[] args) {
		Son s = new Son();
		System.out.println("아들은 " + s.getLunch() + "을 먹는다");
		System.out.println("---------------");
		
		Daughter d = new Daughter();
		System.out.println("딸은 " + d.getLunch() + "을 먹는다");
	}
}
//핵심
//부모 메서드는 못바꾸니 자식 메서드에서 바꾼다.