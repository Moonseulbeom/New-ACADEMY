package kr.s04.array;

public class ArraySecondMain01 {
	public static void main(String[] args) {
		//2차원 배열 선언-처음이자 마지막일지도..?
		int[][] test;
		//2차원 배열 생성
		test = new int[2][3];//2행 3열
		test[0][0] = 100;
		test[0][1] = 200;
		test[0][2] = 300;
		
		test[1][0] = 400;
		test[1][1] = 500;
		test[1][2] = 600;
		
		//2차원 배열의 요소 출력
		System.out.println(test[0][0]);
		System.out.println(test[0][1]);
		System.out.println(test[0][2]);
		
		System.out.println(test[1][0]);
		System.out.println(test[1][1]);
		System.out.println(test[1][2]);
		System.out.println("----------");//가변값이 2개라 이중 for문 사용
		
		//반복문을 이용한 요소의 출력
		for(int i=0;i<test.length;i++) {//i:행번호 0,1
			for(int j=0;j<test[i].length;j++) {//j:열번호 0,1,2
				System.out.println("test["+i+"]["+j+"]:" + test[i][j]);
				//test[i].length -> test[0]의 방의개수 test[1]의 방의 개수 읽으려구
			}
		}
		
		//2차원 배열의 선언 및 생성
		int[][] test2 = new int[3][4];
		
		//2차원 배열의 선언 및 생성(명시적 배열 생성), 초기화
		int[][] test3 = 
				new int[][] {
								{100,200,300},
								{400,500,600},
							};
		//2차원 배열의 선언 및 생성(암시적 배열 생성), 초기화	
		int[][] test4= {{10,20,30},{40,50,60}};					
							
	}
}

/*
1차원 배열<-- 값을 여러개 저장하는 연속적인 메모리 공간
-> 배열도 여러개가 되면 슬프다(한계가 있다)

2차원 배열(자바는 객체로 데이터 관리-빈도수는 떨어지는데, 엄한놈이 쓸지도 몰라서 배워야된다.)
철수---> 데데데데데
영희---> 데데데데데
영철---> 데데데데데
호동---> 데데데데데

우리반---> 데이터 묶어버림(행,열의 개념을 가짐 4행*5열)

3차원 배열 - 존재하는데 java에서는 안쓴다! 하지말자
*/
