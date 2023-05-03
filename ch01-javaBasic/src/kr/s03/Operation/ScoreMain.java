package kr.s03.Operation;

public class ScoreMain {//switch랑 do~while 쓸꺼
	public static void main(String[] args) {
		java.util.Scanner input =
				new java.util.Scanner(System.in);
		int korean,english,math,sum;
		char grade;
		float avg;
		
		//선 처리, 후 비교
		do {
			System.out.print("국어:");
			korean=input.nextInt();
		}while(korean < 0 || korean > 100);//0~100입력 안하면 못빠져나감 false가 되서
		
		do {
			System.out.print("영어:");
			english=input.nextInt();
		}while(english < 0 || english > 100);
	
		do {
			System.out.print("수학:");
			math=input.nextInt();
		}while(math < 0 || math > 100);
		
		//총점 구하기
		sum=korean+english+math;
		//평균 구하기
		avg=sum/3.0f;//sum은 현재 int 자료형, avg는 float 자료형이라 3을 3.0f로 바꿔준거
		
		//등급 구하기
		
		switch((int)avg/10) {//자료형을 맞춰야함,switch는 정수(int)만 되기에 avg(float)을 int로 강제 형변환
			case 10:
			case 9:
				grade = 'A';break;
			case 8:
				grade = 'B';break;
			case 7:
				grade = 'C';break;
			case 6:
				grade ='D';break;
			default :
				grade ='F';//break는 생략
		}
		
		System.out.println("");//줄바꿈
		System.out.println("총점 = " + sum);
		System.out.printf("평균 = %.2f점%n", avg);
		System.out.printf("등급 = %c학점", grade);
		
		input.close();
	}
}
