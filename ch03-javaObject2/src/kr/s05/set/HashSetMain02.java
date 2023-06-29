package kr.s05.set;

import java.util.HashSet;
import java.util.Collections;
import java.util.ArrayList;

public class HashSetMain02 {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		while(hs.size()<6) {
			//난수발생 1~45
			int num = (int)(Math.random()*45)+1;
					hs.add(num);//중복값 불허
		}
		//HashSet -> ArrayList로 변환
		ArrayList<Integer> list = new ArrayList<Integer>(hs);
		
		//오름차순으로 정렬
		Collections.sort(list);
		
		for(int num : list) {
			System.out.print(num + "\t");
		}
		
		
	}//end of main
	
}//end of p.c
