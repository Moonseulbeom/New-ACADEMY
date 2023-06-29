package kr.s12.extention;

//부모클래스
class People{
	public void eat() {
		System.out.println("식사하다");
	}
}
//자식클래스에 부모클래스를 상속시킴
class Student extends People{
	public void study() {
		System.out.println("공부하다");
	}
}


public class ExtentionMain02 {
	public static void main(String[] args) {
		Student s = new Student();
		s.eat();//People의 메서드를 상속 받아서 호출 가능
		s.study();//Student의 매서드
		System.out.println(s.toString());//Object의 메서드를 상속 받아서 호출 가능_참조값 호출됨(상속관계에 의해 사용가능)
		
	}
}
//Object_People_Student 순서로 상속되는듯
//toString_eat_study 메서드(누적)_상속만 잘 받으면 기능이 늘어난다