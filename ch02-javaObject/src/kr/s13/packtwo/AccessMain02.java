package kr.s13.packtwo;

import kr.s13.packone.People;

public class AccessMain02 extends People {
	public static void main(String[] args) {
		AccessMain02 am = new AccessMain02();
		//private, 같은 클래스가 아님
		//System.out.println(am.a));
		//default, 같은 패키지가 아님
		//System.out.println(am.b);
		
		//protected, 상속받은 클래스에서 호출_People
		System.out.println(am.c);
		
		//public, 접근제한이 없음
		System.out.println(am.d);
				
	}
}
