package kr.s02.list;

import java.util.ArrayList;

public class ArrayListMain03 {
	public static void main(String[] args) {
		//제네릭 표현 : 객체를 생성할 때 객체에 저장
		//			할수있는 요소의 타입을 지정
		//<이 사이에 저장하고 싶은 타입을 넣어주자>
		//이거 해주면 컴파일 단계에서 걸러준다
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("강호동");//String
		list.add("유재석");//String
		//list.add(1000);//Integer->Object //문법상 Object으로 관리해서 컴파일엔 문제가 없음
		list.add("박문수");//String
		//String->Object 이렇게 관리하다 제네릭표현 <String>써서 String으로 관리
		
		
		//반복문을 이용해서 요소의 출력(다 문자열인줄 알고)
		for(int i=0;i<list.size();i++) {
			String name = list.get(i);
			System.out.println(name);
		}
		System.out.println("-----------");

		//확장for문을 이용한 요소의 출력
		for(String name : list) {
			System.out.println(name);
		}
	
	}//end of main
	
}//end of p.c
