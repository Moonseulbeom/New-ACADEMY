package kr.s23.enumtest;//Enum 참고사항
//ordinal? 순번 나오는거

enum Item{//상수니까 그냥 대문자 쓰렴
	ADD, DEL, SEARCH, CANCEL
}

public class EnumMain03 {
	public static void main(String[] args) {
		//values()메서드는 열거타입의 모든 열거
		//객체들을 배열로 만들어 반환(루프를 만들어 정보처리)
		Item[] items = Item.values();
		System.out.println("items.length : " + items.length);
		//저장되어 있는 정수값을 확인할 수 있음
		for(Item n : items) {
			System.out.println(n + ":" + n.ordinal());
		}
		
		
		
		
	}//end of main
	
}//end of public class
