package kr.s13.packtwo;

import kr.s13.packone.People;

public class AccessMain01 {
	public static void main(String[] args) {
		People p = new People();
		//private, 같은 클래스가 아님
		//System.out.println(p.a));
		
		//default, 같은 패키지(폴더)가 아님
		//System.out.println(p.b);
		
		//protected, 같은 패키지(폴더) 아님 + 상속관계가 아님
		//System.out.println(p.c);
		
		//public, 접근제한이 없음
		System.out.println(p.d);

	}
}
