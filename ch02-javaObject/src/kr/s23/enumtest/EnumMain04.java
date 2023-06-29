package kr.s23.enumtest; 
//enum 숫자 상수 사용하면 별로, FinalMain01의 final 쓰는게 좋당
//jdk5버전, 만든지 오래되서 잘 안쓰는데 엄한놈이 쓸지 모르니 알아두자

enum Item2{//생성자 명시 가능
	ADD(5), DEL(11), SEARCH(2), CANCEL(22); //()하면 생성자 호출 의미
	
	//위에 지정한 상수 값(데이터)들을 저장하기 위한 공간
	private final int var;
	
	//생성자
	Item2(int var){
		this.var = var;
	}
	
	public int getVar() {//호출할꺼
		return var;
	}
	
}//end of enum

public class EnumMain04 {
	public static void main(String[] args) {
		System.out.println(Item2.ADD);
		System.out.println(Item2.DEL);
		System.out.println(Item2.SEARCH);
		System.out.println(Item2.CANCEL);
		System.out.println("--------------");
		
		System.out.println(Item2.ADD.getVar());
		System.out.println(Item2.DEL.getVar());
		System.out.println(Item2.SEARCH.getVar());
		System.out.println(Item2.CANCEL.getVar());
		
		

		
		
		
		
	}//end of main
	
}//end of p.c
