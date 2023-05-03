package kr.s02.operator;

public class OperatorMain09 {
	public static void main(String[] args) {
/* 연산 수행방식 확인

논리곱(&&)

선조건 && 후조건	결과값
true	true	true
true	false	false

false ->미실행	false

논리합(||)

선조건 || 후조건	결과값
true -> 미실행	true

false	true	true
false	false	false

부정 !
!true -> false
!false -> true
둘이 반대로 나타냄
부정은 1순위

* 논리 연산자의 수행 방식 이유?
- 연산자를 빠르게, 연산방식의 효율성 추구


*/
		System.out.println("===논리연산자===");
		//증감연산자(1순위),비교연산자(4순위),논리연산자(6순위,부정은 1순위)
		int a, b;
		a = b = 10;
		
		boolean c = a++ >= ++b && ++a > b++;
		//c(false) = 10(메모리11)>+11(false) && 11>10(메모리11)
		//선조건이 false임으로 후조건 미실행, 즉 c는 false
		
		System.out.println(a + "," + b);
		System.out.println(c);
		//연습
		System.out.println("==========");
		
		int d,e;
		d = e = 10;
		
		boolean f = ++d < e++ || d++ >= ++e;
			  //f = 11 < 10(메모리11) || 11(메모리12) >= 12
			  //     (false) 		|| 		(false) 
		System.out.println(d + "," + e);//12,12
		System.out.println(f);//false
		//연습_동작방식 무시하면 실행이 안된다.
		
	
	}
}
