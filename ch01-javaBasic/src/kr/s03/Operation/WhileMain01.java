package kr.s03.Operation;

public class WhileMain01 {
	public static void main(String[] args) {
		System.out.println("===while문===");
		int i=1;//초기값 설정
		
		while(i<=10) {//조건식(시계는 무한루프,증감식이 없으면 무한루프에 빠진당)_조건식을 제어하는게 목적
			System.out.println(i++);//증감식
		}
		
		System.out.println("-------------");
		
		int j = 10;//초기값 설정
		
		while(j>=0){//조건식
			System.out.println(j--);//증감식
		}
		
	
	}
	
}
