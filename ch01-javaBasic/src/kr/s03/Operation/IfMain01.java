package kr.s03.Operation;

public class IfMain01 {
	public static void main(String[] args) {
		System.out.println("===단일if문===");
		
		int n = 10;
		
		//단일if문 : 조건이 true이면 if블럭안의 수행문을 실행{if블럭 시작 }if블럭 끝
		if(n > 5) {
			System.out.println("n은 5보다 크다");//조건은 true->수행문 실행
			//여러개의 수행문도 넣을수 있음
		}
		System.out.println("============");
		
		//if블럭내의 수행문이 한 줄이면 중괄호 블럭{}을 생략할 수 있음, 반복문은 생략 안하는데 비교
		if(n < 5)
			System.out.println("~~~~~~"); //false가되서 수행문이 실행되지 않음
		
		System.out.println("프로그램 종료!!");
	
		//지금은 true일때만 작동함. false일때도 작동하려면 if else를 쓰자.
	}
}
