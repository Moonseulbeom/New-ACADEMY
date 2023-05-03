package kr.s04.array;

public class ArraySecondMain02 {
	public static void main(String[] args) {
		//2차원 배열의 선언,생성(암시적 배열 생성), 초기화
		int[][] score = {//5행 3열
				{98,99,90},
				{96,97,98},
				{95,96,97},
				{94,98,99},
				{93,95,96}
						};
		
		System.out.println("번호 국어 영어 수학 총점 평균");
		System.out.println("============================");
		
		//반복문을 이용해서 배열 요소 출력
		for(int i=0;i<score.length;i++) {//i는 행번호
			int sum = 0;//총점
			System.out.print(" "+ (i+1) + "  ");
			for(int j=0;j<score[i].length;j++) {//j는 열번호,score[i].length 열의 갯수,과목수
				//총점구하기
				sum += score[i][j];
				//과목 점수 출력
				System.out.print((score[i][j]) + " ");
			}
			//총점 출력 및 평균을 구하고 평균 출력
			System.out.println(" " + sum + "  " + sum/score[i].length);
			
			
		}
		
		
		
		
		
		
		
	}
}
