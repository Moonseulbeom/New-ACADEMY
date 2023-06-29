package kr.s16.supertest;//super 재정의(오버라이딩)한 다음에 부모영역 지칭하는 것(멤버변수,메서드 다됨)

//부모클래스
class Mother{
	public String getLunch() {
		return "밥";
	}
}
//자식클래스
class Daughter extends Mother{
	//메서드 오버라이딩
	@Override
	public String getLunch() {
		return "빵";
	}
	
	public String getRice() {//유일한 방법_부모클래스를 불러올수 있는
		//부모클래스의 getLunch()메서드를 호출
		return super.getLunch();
	}
	
}//class Daughter extends Mother

public class SuperMain01 {
	public static void main(String[] args) {
		Daughter d = new Daughter();
		System.out.println("딸은 " + d.getLunch() + "을 먹습니다.");
		
		System.out.println("딸은 오늘 왠지 " + d.getRice() + "이 먹고 싶어졌다!" );
		
		
		
	}//main
	
}//class SuperMain01
