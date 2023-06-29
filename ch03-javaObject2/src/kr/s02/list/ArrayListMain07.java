package kr.s02.list;//***연습해야한다

import java.util.ArrayList;

public class ArrayListMain07 {
	public static void main(String[] args) {
		//2차원 배열 형태를 ArrayList로 구현하기
		ArrayList<CartItem> list = new ArrayList<CartItem>();
		
		//ArrayList에 CartItem 저장
		list.add(new CartItem("A1001",2,2000));
		list.add(new CartItem("B1001",1,7000));
		list.add(new CartItem("C1001",3,2500));
		
		System.out.printf("%s %s %s%n", "상품코드", "수량", "가격");
		System.out.println("----------------------------------");
		//확장for문을 이용한 데이터 출력
		for(CartItem item : list) {
			System.out.printf("%s %d %,d%n", item.code, item.num, item.price);//은닉화x, 같은 패키지 내라 호출가능
		}
		


		
		
		
		
	}//end of main
	
}//end of p.c
