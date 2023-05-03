package kr.s02.operator;

public class OperatorMain13 {
	public static void main(String[] args) {
		System.out.println("===대입연산자===");//+=,-=,*=,/=.%=
		int a = 5, b = 7;
		
		//+= 하나의 연산자로 붙여 써야됨(따로 쓰면 에러남)
		a += b;//a = a + b (왼쪽 값만 움직임) 누적
		System.out.println("a += b : " + a);//변동하는 a값만 출력{a(12) = 현재 a값(5) + b값(7)}

		a -= b;//a = a - b 차감
		System.out.println("a -= b : " + a);//변동하는 a값만 출력{a(5) = 현재 a값(12) - b값(7)}
		
		a *= b;//a = a * b
		System.out.println("a *= b : " + a);//변동하는 a값만 출력{a(35) = 현재 a값(5) * b값(7)}
		
		a /= b;//a = a / b
		System.out.println("a /= b : " + a);//변동하는 a값만 출력{a(5) = 현재 a값(35) / b값(7)}
		
		a %= b;//a = a % b
		System.out.println("a %= b : " + a);//변동하는 a값만 출력{a(5) = 현재 a값(5) % b값(7)}




		

	
	}
}
