package kr.s19.lang;//난수_2가지 방법이 있으니 골라서 쓰면 된다!
//난수? 제공되는 숫자가 계속 바뀜_"우연적인 효과" 정해지지 않은  ex)뽑기, 로또 프로그램 등등
//java.lang 기본 제공
//java.util 필수적인 내용들

import java.util.Random;

public class MathMain02 {
	public static void main(String[] args) {
		String[] gift = {"스마트폰","TV","냉장고","꽝"};
						//	0		1	2		3	<- index 부여
		
		//0.0 ~ 1.0 미만의 난수 발생(double 타입으로)
		double ran = Math.random();
		System.out.println("발생한 난수 : " + ran);
		
		//0~3 범위의 난수로 가공
		int index = (int)(ran*4);
		System.out.println("발생한 난수 : " + index);
		System.out.println("오늘의 선물 : " + gift[index]);
		
		System.out.println("-----------------------------");
		
		String[] luck = {"귀인을 만남","로또당첨","저렴한 상품 득템","피곤해~~~"};
						//	  0		   1		   2		  3		<-- index
		
		Random r1 = new Random();
		
		//0부터 인자로 전달된 값의 전까지를 범위로 난수 발생(0~3까지)
		index = r1.nextInt(4);
		System.out.println("발생한 난수 : " + index);
		System.out.println("오늘의 운세 : " + luck[index]);//범위가 작아서 겹칠수도 있음
		
		//index+1
		System.out.println("발생한 난수 : " + (index+1));
		System.out.println("오늘의 운세 : " + luck[index]);
		
	}//main
	
}//public class
