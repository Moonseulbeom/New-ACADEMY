package kr.s01.basic;
public class VariableTypeMain03 {
	public static void main(String[] args) {
		//다른 자료형이면 연산이 안됨
		System.out.println("===묵시적형변환(자동 형변환)===");
		//같은 자료형이면서 공간(byte)가 더 커야함
		//더 큰 자료형으로 승격이 일어나는 형태, 정보의 손실이 전혀 없으며 자동적으로 발생 (형변환_캐스팅)
		byte b1 = 127;//byte의 표현범위 : -128~127
		byte b2 = 127;
		//32bit(4byte)미만 byte형 데이터를 연산하면 32bit로 승격(데이터를 보호하기 위해) -> byte, short 적용
		int result1 = b1 +b2;
		System.out.println("result1 = " + result1);
		
		short s1 = 32767;//short의 표현범위 : -32,768~32,767
		short s2 = 32767;
		//32bit(4byte)미만 short형 데이터를 연산하면 32bit로 승격(데이터를 보호하기 위해) -> byte, short 적용
		int result2 = s1 + s2;
		System.out.println("result2 = " + result2);
		
		int in1 = 1234;//4byte
		long lg1 = 5678L;//8byte
		//in1이 int -> long으로 자동 형변환
		long result3 = in1 + lg1;
		System.out.println("result3 = " + result3);
		
		int in2 = 123;
		double db1 = 56.9;
		//in2가 int -> double로 자동 형변환
		double result4 = in2 +db1;
		System.out.println("result4 = " + result4);
		
	}
}
