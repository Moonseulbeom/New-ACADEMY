package kr.s11.array;

import java.util.Scanner;

public class ScoreMain {
	/*
	 * [실습]
	 * 1.배열 생성(길이는 4)
	 * 2.Score 객체를 생성하고 초기화
	 * 3.객체 저장된 정보를 출력(확장 for문 or 전통 for문)
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//배열 선언 및 생성
		Score[] scoreArray = new Score[4];
		
		//Score 객체를 4개 생성해서 배열에 저장
		//각 4명의 성적 정보를 입력 받아서 객체에 저장하고
		//객체를 배열에 저장함
		for(int i=0;i<scoreArray.length;i++) {
			System.out.print("이름:");
			String name = input.nextLine();
			System.out.print("국어:");
			int korean = input.nextInt();
			System.out.print("영어:");
			int english = input.nextInt();
			System.out.print("수학:");
			int math = input.nextInt();
		    input.nextLine();//enter 흡수
		    
			scoreArray[i] = new Score(name,korean,english,math);
			System.out.println("---------------------");
		}
		
		/*
		scoreArray[0] = new Score("홍길동",98,96,88);
		scoreArray[1] = new Score("이순신",99,72,82);
		scoreArray[2] = new Score("장영실",97,83,81);
		scoreArray[3] = new Score("김유신",86,66,83);
		 */

		//4명의 국어,영어,수학,총점,평균
		for(Score s : scoreArray) {
			System.out.printf("%s\t", s.getName());
			System.out.printf("%d\t", s.getKorean());
			System.out.printf("%d\t", s.getEnglish());
			System.out.printf("%d\t", s.getMath());
			System.out.printf("%d\t", s.makeSum());
			System.out.printf("%d\t", s.makeAvg());
			System.out.printf("%s\t%n", s.makeGrade());//반복문 끝에만 %n(줄바꿈)해주면 깔끔해짐

		}
		
		input.close();
	
	}//main
	
}//class ScoreMain
