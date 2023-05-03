package kr.s06.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapMain02 {
	public static void main(String[] args) {
		String[] msg = {"Berlin", "Paris", "Seoul", "New York", "London"};
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		for(int i=0;i<msg.length;i++) {
				 //key,value
			map.put(i, msg[i]);
		}
		//HashMap에 key,value로 저장된 데이터의 목록
		System.out.println(map);
		System.out.println("--------------------------------------------------");
		//s 변수가 한번만 쓰여서 좀더 줄였다
		//Set<Integer> s = map.keySet();//s 변수가 한번만 쓰여서 좀더 줄였다
		//Iterator<Integer> keys = s.iterator();//한번만 호출하니까 메모리 차지하는 변수는 굳이 만들지 말자(여러번 반복될때 뺴고)
		Iterator<Integer> keys = map.keySet().iterator();
		while(keys.hasNext()) {
			Integer key = keys.next();//key 반환(검증된)
			System.out.println(key + "," + map.get(key));
			//Set 객체로 숫자만 뽑고
		}
		
		
		
		
	}//end of main
	
}//end of p.c

/*		   set	 iterator
0	B		0		0
1	P		1		1
2	S	->	2	->	2
3	N		3		3
4	L		4		4
		iterator()	hasNext(),next()
HashMap에는 key만 뽑아내는게 없음 set 이용
자료형이 안맞아서, 맞추려고 변환작업중
*/