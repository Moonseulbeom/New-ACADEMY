package kr.s02.operator;

public class OperatorMain12 {
	public static void main(String[] args) {
		System.out.println("===조건(삼항)연산자===");
		//프로그램적으로 대,소문자 구분하기, 아스키코드 활용
		char ch = 'b';
		String s;//대문자인지 판단할 결과를 저장할 문자열 변수 선언
		
		//조건(삼항)연산자
			//조건					참값			거짓값
		//s = (ch>=65 && ch<=90) ? "대문자임" : "대문자가 아님";
		s = (ch>='A' && ch<='Z') ? "대문자임" : "대문자가 아님";
		System.out.println(ch + "=>" + s);
		//아스키코드 대문자(65~90), 소문자(97~122)
		//어디서부터(>=) ~(&&) 어디까지(<=) : 특정 구간을 확인시 비교연산자와 논리연산자 같이 쓰면 가능
		//'A'~'Z'방법도 가능(순서값을 가지기 때문 자동적으로 형변환해서 아스키코드 65~90으로 확인)
	
	}

}
