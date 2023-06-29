package kr.s03.method;

public class StudentMain {
	//멤버변수
	String name;
	int korean;
	int english;
	int math;
	
	//멤버메서드(멤버변수의 값을 쓸수있음_당장 안쓸수 있지만 사용할 가능성이 있는건 객체에 넣어둠(확장성을 위해서))
	
	//총점구하기
	public int makeSum() {
		return korean+english+math;
	}
	//평균구하기
	public int makeAverage() {
		return makeSum()/3;
	}
	//등급구하기
	public String makeGrade() {
		String grade;
		switch(makeAverage()/10) {
		case 10:
		case 9: grade = "A";break;
		case 8: grade = "B";break;
		case 7: grade = "C";break;
		case 6: grade = "D";break;
		default: grade = "F";
		}
		return grade;
	}
	
	public static void main(String[] args) {
		//객체 선언 및 생성
		StudentMain student = new StudentMain();
		//멤버변수에 값 할당
		student.name = "홍길동";
		student.korean = 98;
		student.english = 97;
		student.math = 95;
		
		//성적 출력
		System.out.println("이름 : " + student.name);
		System.out.println("국어 : " + student.korean);
		System.out.println("영어 : " + student.english);
		System.out.println("수학 : " + student.math);
		System.out.println("총점 : " + student.makeSum());
		System.out.println("평균 : " + student.makeAverage());
		System.out.println("등급 : " + student.makeGrade());
	}

}
/*
 * 100       A	10
90 ~ 99 A	9
80 ~ 89 B	8
70 ~ 79 C	7	
60 ~ 69 D	6

10으로 나누고(정수/정수)임으로 소수점 절삭
 */


