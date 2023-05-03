package kr.s01.basic;
public class VariableTypeMain04 {
	public static void main(String[] args) {
		System.out.println("===명시적 형변환(강제 형변환)===");
		//더 작은 자료형으로 강등이 일어나는 형태, 정보의 손실이 발생할 수있음.
		byte b1 = 127;
		byte b2 = 127;
		//자동적으로 int로 승격(byte의 범위를 넘어서)되는 것을 byte로 강등시킴
		byte result1 = (byte)(b1 +b2);
		System.out.println("result1 = " + result1);//완전 왜곡됨(-2)
		
		short s1 = 32767; 
		short s2 = 32767;
		//자동적으로 int로 승격되는 것을 short로 강등시킴
		short result2 = (short)(s1 + s2);
		System.out.println("result2 = " + result2);//완전 왜곡됨(-2)
		//(byte),(short) -> 캐스트 연산자
		//드문경우지만, 연산법 기억할것 아래부터 주로 사용
		
		int it1 = 1234;
		float f1 = 345.567f;//.아래로 다 절삭,반올림 아님
		//f1의 자료형 float -> int로 강제 형변환
		int result3 = it1 + (int)f1;
		System.out.println("result3 = " + result3);//데이터 왜곡

		int it2 = 123;
		long lg1 = 567L;
		//lg1의 자료형 long -> int로 강제 형변환
		int result4 = it2 +(int)lg1;
		System.out.println("result4 = " + result4);//int표현범위에 들어가서 데이터 손실이 없음
	}
}
/*
 * 명시적 형변환(강제 형변환) - 데이터 손실이 있음

int double
정수 실수
3 + 5.7

int int int
3 + 5 = 8

묵시적 형변환(자동 형변환) - 데이터 손실이 없음

double double double
3.0 + 5.7 = 8.7


자료형을 맞춰야한다.
정수끼리는 bit로 비교
정수 < 실수
long(64bit) < float(32bit)
*/

