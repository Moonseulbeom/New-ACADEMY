package kr.s03.Operation;

public class WhileMain02 {
	public static void main(String[] args) {
		System.out.println("===while문===");
		//형태는 다르지만 for문처럼 사용한거
		
		int sum = 0, su = 1;//초기값 지정
		
		while(su <= 100) {//조건식
			sum += su;//sum에 누적(sum=sum+su)
			su++;//증감식
		}
		System.out.println("1부터 100까지의 합 : " + sum);

	}
}
