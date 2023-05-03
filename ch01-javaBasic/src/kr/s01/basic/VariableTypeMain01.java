package kr.s01.basic;

public class VariableTypeMain01 {
	public static void main(String[] args) {
		//변수는 자료형을 결정해줘야함
		System.out.println("===논리형===");
		//논리형(true,false)-숫자는 안됨(다른 언어에서는 대체되는데, java에선 0과 1로 대체할 수 없음)
		boolean b = true;
		System.out.println("b = " + b);
		
		System.out.println("===문자형===");
		//문자형, 크기 : 2byte(암기), 표현범위 : 0~65,535(음수가 없음, 영어는 1byte, 다른 언어는 2byte)
		//다국어처리를 위한 유니코드(unicode) 방식 - 2byte로 전세계 문자 구현 가능
		//'A'=65(아스키 코드)='\u0041'(유니코드) 다같은 거임 -> 굳이 암기는 ㄴㄴ
		char c1 = 'A';//내부적으로 아스키코드값 65로 인식(실제 사용)
		System.out.println("c1 = " + c1);
		
		char c2 = 65;//A에 해당하는 아스키코드값 직접 입력 (원리만)
		System.out.println("c2 = " + c2);
		
		char c3 = '\u0041'; //A를 유니코드로 표현 (원리만)
		System.out.println("c3 = " + c3);
		
		char c4 = '자';
		System.out.println("c4 = " + c4);
		
		char c5 = '\uc790';//(내부적으로 원리만, 한글은 최소 2byte 이상 필요함으로 아스키코드로 표현 안된다)
		System.out.println("c5 = " + c5);
		
		System.out.println("===정수형===");//1,2,4,8 크기 순서(1 byte = 8 bit)
		//byte, 크기 : 1byte, 표현범위 : -128~127
		byte b1 = 127;//입출력(데이터 주고 받을때) 사용, 연산시에는 주로 int사용, 범위 밖인 128을 하면 사용 불가
		System.out.println("b1 = " + b1);
		
		//short, 크기 : 2byte, 표현범위 : -32,768 ~ 32,767, 범위 밖인 32768을 하면 사용 불가
		short s1 = 32767;
		System.out.println("s1 = " + s1);
		
		//<정수표현의 기본> int, 크기 : 4byte, 표현범위 : -2,147,483,648~2,147,483,647(약20억대)-일반적인 연산에서 사용(금융권 제외)
		int n1 = 12345;
		System.out.println("n1 = " + n1);

		//long, 크기 : 8byte, 표현범위 : 몹시 크다.
		long lg = 56789L;//L 안붙이면 int로 인식할 수 있음 작업을 2번하게된다. 처음부터 long으로 확인하기위해 L자 붙여주기, L자는 자료형을 의미
		System.out.println("lg = " + lg);
		
		System.out.println("===실수형===");
		//float, 크기 : 4byte
		float f1 = 9.1F;//(소,대문자 상관없음, long도 마찬가지) F 꼭 넣어줘야함(의무)
		System.out.println("f1 = " + f1);
		
		//<실수 표현의 기본> double, 크기 : 8byte (정밀도가 더 높다)
		double d1 = 9.8;
		System.out.println("d1 = " + d1);
		
		System.out.println("===문자열 표시===");
		//문자열은 기본자료형이 아닌 참조자료형임
		//기본자료형은 소문자로 시작
		//java는 자료형이 몹시 중요하다
		//String 대문자로 시작
		String str = "Hello World!";
		System.out.println("str = " + str);
		
		
		
		
		
		
		
	}

}
