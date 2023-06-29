package kr.s24.interfacetest;
/*
<interface 사용이유>
1.우회적인 다중상속 지원
2.자료형 사용가능 (형변환 가능)
3.형식을 만들어준다.
class를 도와주는 애라 구별해서 쓴다
*/

//인터페이스
interface Inter1{
	public int getA();//추상메서드
}

interface Inter2{
	public int getB();//추상메서드
}

//*인터페이스간 다중상속*(형식만 있어서+내용이 없어서 충돌 안남)
interface Inter3 extends Inter1,Inter2 {
	public int getData();//추상메서드
}
//인터페이스를 클래스에 구현
public class InterMain03 implements Inter3 {//구현이 누적(추상 다 구현해줘야함)
	//인터페이스의 추상메서드 구현
	@Override
	public int getA() {
		return 100;
	}
	@Override
	public int getB() {
		return 200;
	}
	@Override
	public int getData() {
		return 300;
	}
	public static void main(String[] args) {
		InterMain03 im = new InterMain03();
		
		System.out.println(im.getA());
		System.out.println(im.getB());
		System.out.println(im.getData());

		
	}//end of main
	
}//end of p.c












/*
상속관계

	p				o
---------		---------
toString (금)	toString (은_재정의)
---------		---------
	^^		\/\/>> 불허(즉,단일상속_java에선 단일상속만 인정한다)
	||		/\/\
---------
		 	java에선 p냐 o냐 뭘 쓸지 선택 못하는 문제 발생(다중상속_선택해야하는데 코드가 없어서 못함 : 결론은 불허)
---------
	c
	
	
	p				o
---------		---------
				   make
---------		---------
	^^		\/\/>> make가 쓰고싶은 c
	||		/\/\	***
---------		---------
		 	
---------		---------
	c	   ***	interface
  단일상속
   
*** : interface는 class x, 우회해서 o.make를 c로 훔쳐올수 있다

	<interface 사용이유>
   1.우회적인 다중상속 지원
   2.자료형 사용가능
   3.형식을 만들어준다.
   			
  class			interface
---------		*********
				
---------		*********
	^^		        ^^ 
상속	||			    ||
---------		*********
		 *******	
---------  구현	*********
  class	   
  
*점선으로 표시한다
*/
















