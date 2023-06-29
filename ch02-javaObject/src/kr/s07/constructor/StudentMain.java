package kr.s07.constructor;

class Student{//생성자 오버로딩 기법을 사용
	//멤버변수
	int korean;//과목의 점수를 저장
	int english;//과목의 점수를 저장
	int math;//과목의 점수를 저장
	int history;//과목의 점수를 저장
	int science;//과목의 점수를 저장
	int num;//과목수_num을 통해 제어
	
	//생성자 -> 멤버변수 초기화
	//생성자 오버로딩(원하는 객체 호출가능)
	public Student(int k, int e, int m) {//인자 타입은 같지만 수가 다름
		korean = k;
		english = e;
		math = m;
		num = 3;//과목수 지정
	}
	public Student(int k, int e, int m, int h, int s) {
		korean = k;
		english = e;
		math = m;
		history = h;
		science =s;
		num = 5;//과목수 지정
	}
	//멤버메서드
	//총점구하기
	public int getTotal() {
		int total;
		if(num==3) {
			total = korean + english + math;
		}else {//num==5
			total = korean + english + math + history + science;
		}
		return total;
	}
	//평균구하기
	public int getAverage() {
		return getTotal()/num;
	}
}

public class StudentMain {
	public static void main(String[] args) {
		//인자의 개수가 3개인 생성자를 호출해서 객체 생성
		Student st = new Student(90,97,95);
		
		System.out.println("합계 = " + st.getTotal());
		System.out.println("평균 = " + st.getAverage());
		System.out.println("---------------------------");
		
		//인자의 개수가 5개인 생성자를 호출해서 객체 생성
		Student st2 = new Student(88,82,84,87,90);
		System.out.println("합계 = " + st2.getTotal());
		System.out.println("평균 = " + st2.getAverage());
		
	}
}
