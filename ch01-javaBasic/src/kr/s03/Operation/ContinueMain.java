package kr.s03.Operation;

public class ContinueMain {
	public static void main(String[] args) {
		System.out.println("===continue문===");
		for(int i=0;i<=10;i++){
			
			//특정 조건일 때 수행문의 실행을 멈추고 다음 반복 회차로 건너뜀
			//반복문을 빠져나가는게 아님
			if(i%3==0) {//3의 배수(0,3,6,9)빼고 출력
				continue;//건너뛰렴
			}
			System.out.println(i);
		
		}
	
	}
}
