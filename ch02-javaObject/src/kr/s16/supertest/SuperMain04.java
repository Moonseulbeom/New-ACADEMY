package kr.s16.supertest;

//부모클래스
class Point{
	int x;
	int y;
	//생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String getLocation() {
		return "x : " + x + ", y : " + y;
	}
}

//자식클래스
class Point3D extends Point{
	int z;
	//생성자
	public Point3D(int x, int y, int z) {//명시 안해주면 생성자 super(); 상태라 안에 인자 넣어서 명시 해줘야함
		//부모클래스에 인자가 있는 생성자를 호출
		super(x,y);
		this.z = z;
	}
	//매서드 오버라이딩
	@Override
	public String getLocation() {
		return "x : " + x + ", y : " + y + ", z : " + z;
	}
}


public class SuperMain04 {
	public static void main(String[] args) {
		Point3D p3 = new Point3D(10,20,30);
		System.out.println(p3.getLocation());
	}
}
//생성자 인자값 유무에 따른 호출