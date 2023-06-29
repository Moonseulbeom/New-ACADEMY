package kr.s01.field;
//그룹 => 객체
//필요할때마다 꺼내 쓰거나, 아님 그때그때 만든다
//앞으로 사용할 가능성이 있는 것들을 그룹으로 묶어서 메모리에 놔둔다.

//객체의 구성
//변수(속성) method (동작,함수)



public class Student {//객체 구성원 변수, 함수*객체는 그룹, 
					 //가방으로 생각 clss 아래엔 앞으로 쓸것들 아래는 당장 쓰는거
	//멤버 변수
	String name;
	int age;
	
	public static void main(String[] args) {
		//객체 선언
	  //참조자료형  참조변수	
		Student student;
		//객체 생성
		//주소		객체생성
		student = new Student();
		
		//객체의 구성원에 데이터 저장
		//멤버 변수에 값 저장_~.~메모리 접근, .은 하위요소로 들어간다
		student.name = "홍길동";
		student.age = 20;
		
		//객체의 멤버 변수 값 출력
		System.out.println(student.name);
		System.out.println(student.age);
		
	}
}

/*
메모리
-------------------
name=홍길동
age=20
*/
 
