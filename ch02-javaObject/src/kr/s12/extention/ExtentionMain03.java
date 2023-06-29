package kr.s12.extention;

//부모클래스
class A{
	int x = 100;//default 같은 패키지라 갖다쓸수 있음
	private int y = 200;//은닉화
	public int gety() {//private 생기면 public 하나 만들어서 공공 데이터 만들어줘야함_값 쓰려면
		return y;
	}
}
//자식클래스에 부모클래스 상속
class B extends A{
	int z = 300;
	
}
public class ExtentionMain03 {//접근제한_금고에 넣는다?_잘봐야한다
	public static void main(String[] args) {
		B bp = new B();
		System.out.println(bp.x);
		//private 멤버변수는 같은 클래스 내에서만 호출 가능(상속관계임에도 불구)
		//System.out.println(bp.y);
		System.out.println(bp.gety());
		System.out.println(bp.z);
		
	}
}
//protected: 같은 패키지(폴더)에 있는 클래스와 상속관계의 클래스들만 허용
//멤버변수엔 public잘 안씀, 메서드는 쓴다