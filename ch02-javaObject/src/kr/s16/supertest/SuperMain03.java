package kr.s16.supertest;

//부모클래스
class People2{
	int a;
	//생성자
	public People2(int a) {
		this.a = a;
	}
}

//자식클래스
class Student2 extends People2{//생성자 super(); 명시 안하면 클래스명(Student2)에서 오류난다
	//생성자
	public Student2() {
		//부모클래스의 인자의 타입이 int인 생성자를 호출
		super(100);
	}
}

public class SuperMain03 {
	public static void main(String[] args) {
		Student2 st = new Student2();
		System.out.println(st.a);
	}
}
