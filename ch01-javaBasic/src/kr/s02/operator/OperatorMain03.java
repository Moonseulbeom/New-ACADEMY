package kr.s02.operator;

public class OperatorMain03 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 변수 선언시 자료형은 모두 int
		 * 변수는 korean,english,math를 선언하고
		 * 90,95,88 으로 초기화
		 * 총점을 구해서 sum에 저장, 평균을 구해서
		 * 변수 avg에 저장.
		 * 국어,영어,수학,총점,평균을 출력하시오.
		 */
		
		/*
		int korean = 90;
		int english = 95;
		int math = 88;
		int sum = korean + english + math;
		int avg = sum / 3;
		System.out.println("국어 = " + korean);
		System.out.println("영어 = "+ english);
		System.out.println("수학 = " + math);
		System.out.println("총점 = " + sum);
		System.out.println("평균 = " + avg);
		*/
		//내가 한거
		
		int korean = 90, english = 95, math = 88;
		//총점 구하기
		int sum = korean +english + math;
		//평균 구하기
		int avg = sum / 3;
		
		System.out.printf("국어 : %d점%n", korean);
		System.out.printf("영어 : %d점%n", english);
		System.out.printf("수학 : %d점%n", math);
		System.out.printf("총점 : %d점%n", sum);
		System.out.printf("평균 : %d점%n", avg);
		//강사님이 한거




	
	
	
	
	
	
	}

}
