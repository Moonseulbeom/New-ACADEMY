package kr.s02.list;

import java.util.ArrayList;
import java.util.Collections;//사전순(ㄱㄴㄷ)으로 정렬하는 메서드

public class ArrayListMain06 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("머루");//0
		list.add("사과");//1
		list.add("앵두");//2
		list.add("자두");//3
		list.add("사과");//4

		//인덱스 탐색
		int index1 = list.indexOf("사과");
		System.out.println("첫번쨰 사과 : " + index1);
		int index2 = list.lastIndexOf("사과");
		System.out.println("마지막 사과 : " + index2);
		int index3 = list.lastIndexOf("망고");
		System.out.println("망고 : " + index3);//없다 개념을 음수로 표현(-1)
		
		//요소의 목록 출력
		System.out.println(list);//저장한 순서대로 들어가있음
		System.out.println("------------------------");
		
		//정렬(사전에 명시된 순서로 정렬)
		Collections.sort(list);//사전순(ㄱㄴㄷ)으로 정렬하는 메서드
		System.out.println(list);
		System.out.println("------------------------");
		
		//역순으로 정렬
		Collections.reverse(list);
		System.out.println(list);
		System.out.println("------------------------");
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(10);//0
		list2.add(100);//1
		list2.add(15);//2
		list2.add(2);//3
		list2.add(40);//4
		
		//오름차순 정렬
		Collections.sort(list2);
		System.out.println(list2);
		System.out.println("------------------------");
		
		//내림차순 정렬
		Collections.reverse(list2);
		System.out.println(list2);
		System.out.println("------------------------");
		
		

	}//end of main
	
}//end of p.c

//일반적인 언어들은 index순서값이 0부터 시작, 없으면 음수부터 시작한다
//자료형이 안맞으면 작업을 못함, 메서드 이용 못함, 객체를 여러번 변환해서 써야함
//공통점 index의 위치가 움직인다

//<배열보다 ArrayList가 좋은 이유(장점)> 
//1) 가변길이때문에 
//2) 데이터 수정이 자유롭다(변경,삭제)
//3) 기본값, 참조가능

//배열은 정해져있는 값을 사용할떄(변경x,고정값일 경우)가 좋다.

//게시판 만들때 ArrayList 써서 DB랑 연결
//ArrayList+객체로 작업 요망