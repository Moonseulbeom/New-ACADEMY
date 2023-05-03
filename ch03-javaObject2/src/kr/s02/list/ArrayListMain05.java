package kr.s02.list;//remove 예제

import java.util.ArrayList;

public class ArrayListMain05 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(15);
		list.add(16);

		//요소의 목록 출력
		System.out.println(list);
		System.out.println("----------------");
		//짝수를 삭제
		//index 0부터 시작해서 조건 체크를 하면서
		//데이터를 삭제할 경우 조건 체크를 못 하고
		//건너뛰는 데이터가 발생할 수 있음
		/*
		for(int i=0;i<list.size();i++) {//앞부터 루프를 돌다보니 index변화를 감지 못했다?
			if(list.get(i)%2==0) {//짝수
				list.remove(i);
			}
		}
	
		20(감지를못함)	0		10(x)
		15			1		20
		16			2		15
					3		16
		뒤부터 삭제해야 놓치는 데이터 없이 검증 가능하다			

		*/
		
		//모든 데이터를 조건체크하려면 뒤에서 앞으로
		//이동하면서 조건 체크해야 함
		for(int i=list.size()-1;i>=0;i--) {//마지막 인덱스부터 i가 0까지
			if(list.get(i)%2==0) {
				list.remove(i);
			}
		}//end of for
		
		System.out.println(list);
		
	}//end of main
}//end of p.c