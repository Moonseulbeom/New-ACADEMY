package kr.s03.Operation;

public class DoWhileMain01 {
	public static void main(String[] args) {
		System.out.println("===do~while문===");
		
		int su = 0;
		String str = "Java DoublePlus";
		
		//선 처리, 후 비교(6번 실행)
		do {
			System.out.println(str);
		}while(su++ <5);//(주의)semicolon 생략시 오류발생
		
		System.out.println("---------------------");
		
		int su2 = 0;
		
		//선 비교, 후 처리(5번 실행)
		while(su2++ < 5) {
			System.out.println(str);
		}
		//몇번 반복하는지 확인하고 써야함 do~while과 while 똑같이 쓰면 실행 값이 달라짐
	}
}
