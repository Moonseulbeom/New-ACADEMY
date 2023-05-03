package kr.s04.array;

public class ArrayMain04 {//비교할 데이터가 많으면 배열, if, for문을 사용하면 비교가능하다.
	public static void main(String[] args) {
		//배열 선언, 생성, 초기화
		int[] score = {79,88,91,33,100,55,95};//length는 7
		//기준값? 배열안에서 찾아야함
		
		//배열의 첫번째 값으로 최대값을 초기화, 기준값 score[0]=79로 사용(첫 데이터라 그런듯)
		int max = score[0];
		//배열의 첫번째 값으로 최소값을 초기화
		int min = score[0];
	
		for(int i=1;i<score.length;i++) {//첫째값score[0]을 기준 삼아서 score[1]=88부터 비교 
			//최대값 구하기
			if(score[i]>max) {
				max=score[i];
			}
			//최소값 구하기
			if(score[i]<min) {
				min=score[i];
			}
		}
		
		//최대값, 최소값 출력
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

//		System.out.printf("최대값: %d%n", max);
//		System.out.printf("최소값: %d%n", min);
	}
}