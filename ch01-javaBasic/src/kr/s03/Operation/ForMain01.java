package kr.s03.Operation;

public class ForMain01 {
	public static void main(String[] args) {
		//초기식 = 변수 선언, 이 변수를 쓰려고 사용
		//조건식 = true면 수행문 실행, false면 빠져나옴
		//증감식 = 연산자 사용(일반적으로 증감연산자가 씌임)
		System.out.println("===for문===");
		//초기식;조건식;증감식
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
		System.out.println("------------");
		//수행문이 한 줄일 경우 {} 생략 가능_반복문은 근데 생략 잘 안함
		for(int i=1;i<=5;i++)
			System.out.println(i);
		
		System.out.println("프로그램 끝!!");
		
		
	}
}
