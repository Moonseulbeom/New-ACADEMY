package kr.s03.Operation;

public class ForMain06 {
	public static void main(String[] args) {
		System.out.println("===for문===");
		//문자를 반복문으로 뽑아오기
		
		char c = 'a';
		for(int i=0;i<26;i++ ) {
			//'a'부터 26개의 문자를 출력
			System.out.print(c++ + "\t");
		}
		
		System.out.println();//줄바꿈
		
		char d = 'A';
		for(int i=0;i<26;i++) {
			//'A'부터 26개의 문자를 출력
			System.out.print(d++ + "\t");
		}
		
		System.out.println();//줄바꿈

		char e = '0';//숫자로 보이지만 java에선 문자로인식 아스키코드
		for(int i=0;i<10;i++) {
			//'0'부터 10개의 문자를 출력
			System.out.print(e++ + "\t");
		}

	
	}
}
