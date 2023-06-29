package kr.s03.Operation;

public class ForMain05 {
	public static void main(String[] args) {
		System.out.println("===for문===");
		
		//다중for문(2개의 값이 연속으로 변할때 사용)_3개쯤 쓰면 명시 잘못하면 몹시 느려짐 '무한 loop에 빠진당2'
		for(int dan=2;dan<=9;dan++) {
			//단을 2~9까지 지정
			System.out.println("**" + dan + "단**");
			for(int i=1;i<=9;i++) {
				//i는 곱해지는 수(1~9)
				System.out.println(dan + "*" + i + "=" + dan * i);
			}
		}
	
	}
}
