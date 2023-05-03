package kr.s02.list;

import java.util.ArrayList;

public class ArrayListMain02 {
	public static void main(String[] args) {
		//List 구조의 특징 : 저장되는 순서를 유지,
		//				 중복 저장 허용
		ArrayList list = new ArrayList();
		
		list.add("홍길동");//0 String -> Object
		list.add("박문수");//1 String -> Object
		list.add("장영실");//2 String -> Object
		list.add("홍길동");//3 String -> Object

		//ArrayList에 저장된 요소의 목록
		System.out.println(list);
		System.out.println("----------");
		
		//반복문을 이용한 요소 출력
		for(int i=0;i<list.size();i++) {
						 //Object -> String
			String name = (String) list.get(i);//명시적 형변환 해야함
			System.out.println(name);
		}

		
	}//end of main
	
}//end of p.c

//기본자료형 데이터를 저장x, 참조자료형 객체만 저장o
//출력에 속지말장
