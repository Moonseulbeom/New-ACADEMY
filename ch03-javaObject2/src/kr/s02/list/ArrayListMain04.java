package kr.s02.list;//만들었다가 삭제

import java.util.ArrayList;

public class ArrayListMain04 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("강호동");//0//저장할떄
		list.add("유재석");//1
		list.add("신동엽");//2
		list.add("박나래");//3
		list.add("강호동");//4 중복 허용

		//반복문을 이용한 요소 출력
		for(int i=0;i<list.size();i++) {
			String name = list.get(i);//불러올떄
			System.out.println(i + ":" + name);
		}
		System.out.println("----------------");
		
		//요소의 삭제
		//list.remove(2);//인덱스
		list.remove("강호동");//요소_가장 앞에 있는 index가 지워짐
		
		
		for(int i=0;i<list.size();i++) {
			String name = list.get(i);//불러올떄
			System.out.println(i + ":" + name);
		}//요소가 사라지고 인덱스는 그 다음부터 순서대로 당겨짐
		System.out.println("----------------");
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(40);
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(40);

		//반복문을 이용한 요소의 출력
		for(int i=0;i<list2.size();i++) {
			//참조자료형->기본자료형으로 변환
			//auto unboxing
			int num = list2.get(i);//불러올때
			System.out.println(i + ":" + num);
		}
		System.out.println("----------------");
		
		//요소의 삭제
		//list2.remove(2);//인덱스
		list2.remove((Integer) 40);//요소
		
		for(int i=0;i<list2.size();i++) {
			//참조자료형->기본자료형으로 변환
			//auto unboxing
			int num = list2.get(i);//불러올때
			System.out.println(i + ":" + num);
		}
		System.out.println("----------------");
		
		//요소의 변경
			  //인덱스, 데이터
		list2.set(1, 30);
		
		for(int i=0;i<list2.size();i++) {
			//참조자료형->기본자료형으로 변환
			//auto unboxing
			int num = list2.get(i);//불러올때
			System.out.println(i + ":" + num);
		}
		System.out.println("----------------");
		
		
	}//end of main
	
}//end of p.c
