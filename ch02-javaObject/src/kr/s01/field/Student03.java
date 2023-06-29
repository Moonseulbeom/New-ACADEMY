package kr.s01.field;

public class Student03 {
	//멤버변수
	String name;
	int age;
	String address;
	
	public static void main(String[] args) {
		//객체 선언 및 생성
		Student03 student = new Student03();
		//멤버 변수 초기화
		student.name = "장영실";
		student.age = 20;
		student.address = "서울";
		
		System.out.println(student.name+","+student.age+","+student.address);
		
		//객체 선언 및 생성
		Student03 student2 = new Student03();
		//객체의 멤버 변수 값 초기화
		student2.name = "홍길동";
		student2.age = 40;
		student2.address = "부산시";
		
		System.out.println(student2.name+","+student2.age+","+student2.address);
		
	}
}

/*이해를 돕기위한
-----------
student03
----------- 아래가 student 주소 안 메모리
name=null
age=0
address=null

------------		--------------
student					student2
------------		--------------
name=장영실			name=null
age=20		<--->	age=0			
address=서울			address=null		
------------		---------------
ex)주소: 1~4				5~8				--> 주소가 달라서 안에 들어간 데이터가 다르다.

설계도(class) 하나에 객체(object)를 여러개 쓸수있다
ex)자동차 설계도면만 있으면 제품을 마구마구 메모리에 만들수 있다.
*/