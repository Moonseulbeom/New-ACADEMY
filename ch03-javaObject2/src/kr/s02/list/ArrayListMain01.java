package kr.s02.list;

import java.util.ArrayList;

class A{
	@Override
	public String toString() {
		return "A클래스";
	}
}
class B{
	
}

public class ArrayListMain01 {//공간이 가변적
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		//ArrayList에 객체 (주소)저장
		
		list.add(new A());
		//kr.s02.list.A@73a28541 참조값이 보여짐
		//Object의 toString을 재정의해서 A클래스로 보여짐
		//A -> Object 형변환
		
		list.add(new B());
		//kr.s02.list.B@6f75e721 참조값이 보여짐
		//재정의 안되있음
		//B -> Object 형변환
		
		list.add("박문수");
		//toString이 동작되서 저장된 데이터가 보여짐 박문수
		//String -> Object 형변환
		
		//list.add(new Integer(100)); deplecate 되버림 그냥 숫자 넣으면 integer 객체 생성됨
		
		list.add(100);
		//toString이 동작되서 저장된 데이터가 보여짐 100
		//Integer -> Object
		
		//ArrayList에 저장된 요소의 목록
		System.out.println(list);


		
	}//end of main
	
}//end of p.c

/*
list
--------------------------
주소  주소	  주소	  주소 
a	|b	|박문수	|100
0	 1	  2		  3

여러 타입 저장 되긴 하는데 출력떄 힘들어서 한 타입으로 관리하는 것이 좋다.
*/