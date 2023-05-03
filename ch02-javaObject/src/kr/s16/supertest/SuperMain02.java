package kr.s16.supertest;//super() 부모 생성자 불러옴

//부모클래스
class Parent{
	int a = 100;
	//생성자
	public Parent() {
		//(암묵적으로_명시 안함)부모클래스(Object)의 default 생성자를 호출
		super();
	}
}
//자식클래스
class Student extends Parent{
	int b = 200;
	//생성자
	public Student() {
		//(암묵적으로_명시 안함) 부모클래스의 default 생성자를 호출
		super();
	}
}

public class SuperMain02 {
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.a);
		System.out.println(s.b);
	}
}
