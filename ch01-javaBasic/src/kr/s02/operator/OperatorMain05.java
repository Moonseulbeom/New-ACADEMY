package kr.s02.operator;

public class OperatorMain05 {
	public static void main(String[] args) {
		java.util.Scanner input =
				new java.util.Scanner(System.in);//나중에 java 끝무렵에 설명하심
		
		System.out.print("국어:");
		//입력된 정수를 변수에 대입
		int korean = input.nextInt();
		
		System.out.print("영어:");
		int english = input.nextInt();
		
		System.out.print("수학:");
		int math = input.nextInt();
		
		int sum = korean + english + math;
		double avg = sum / 3.0;
		//sum이 자동으로 형변환되서 int->double로 바뀜(자료형이 중요하다)
		
		System.out.printf("국어 = %d%n", korean);
		System.out.printf("영어 = %d%n", english);
		System.out.printf("수학 = %d%n", math);
		System.out.printf("총점 = %d%n", sum);
		System.out.printf("평균 = %.2f%n", avg);
		
		input.close();
		//nextInt는 정수만 받음,실수 넣으면 에러남
		//nextDouble 실수로 받을 수 있음
	}
}
