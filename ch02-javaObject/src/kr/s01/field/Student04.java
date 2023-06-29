package kr.s01.field;

public class Student04 {
	//멤버 변수(초기 기본값)
	String name;
	int korean;
	int english;
	int math;
	int sum;
	double average;//0.0이 들어감
	
	public static void main(String[] args) {
		//객체 선언 및 생성
		 Student04 student = new Student04();
		//객체의 멤버 변수 값 초기화
		 student.name = "홍길동";
		 student.korean = 99;
		 student.english = 95;
		 student.math = 97;
		 student.sum = student.korean + student.english + student.math;
		 student.average=student.sum/3.0;
		 
		 System.out.println("이름 : " + student.name);
		 System.out.println("국어 : " + student.korean);
		 System.out.println("영어 : " + student.english);
		 System.out.println("수학 : " + student.math);
		 System.out.println("총합 : " + student.sum);
		 System.out.printf("평균 : %.2f%n", student.average);
		 


	}
}
/* 배열과 객체의 비교
 
 배열: 같은 자료형의 데이터만 비교가능
 객체 : 변수,배열에 비해 여러 장점이 있다. 다른 자료형 데이터도 그룹으로 묶을수 있다.
*/