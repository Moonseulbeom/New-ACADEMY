package kr.s02.instance;

public class InstanceMain01 {
	//클래스의 기본구조
	
	//멤버필드(속성_변수_상수(추후 나옴))_연료_데이터 저장
	int var1;//멤버변수
	String var2;//멤버변수
	
	//생성자(명시하지 않으면 컴파일시 자동 생성)_객체 만드는데 도움역할, 객체가 되진 않음_생략가능
	public InstanceMain01() {}
	
	//멤버메서드(자바에는 함수 명칭이 없다. 메서드)_기능_동작
	public int sum(int a, int b) {//sum(안에 이거) 인자,파라미터,
		return a + b;//메서드 빠져나옴,밖으로 보낸다
	}
	
	
	public static void main(String[] args) {
		//객체 선언 및 생성
		//자료형	참조변수(주소저장) 객체생성연산자 생성자
		InstanceMain01 me = new InstanceMain01();
		//객체의 멤버변수 값 초기화
		me.var1 = 1000;
		me.var2 = "서울";
		//객체의 멤버메서드 호출
		int result = me.sum(20,30);//메서드(입구)->sum~~->result(결과_return)
		
		System.out.println(me.var1);
		System.out.println(me.var2);
		System.out.println(result);
	}

}
/*
 * 객체에 포함되는건 멤버변수(필드),멤버메서드
 ----------------
 InstanceMain01
 ----------------
 var 1 = 0
 var 2 = null
 sum = null
 
 * 메서드 작동방식 (출구가 입구 o, 입구x 여러 경우가 있다)
 					입구
 public int sum(int a, int b){
 	출구	 작업(동작)
 	return a+b;
 };
 
 				
 		sum	< >(입구 -> 인자 (a,b))
 ------------  ----
 		
 	(동작) a+b
 
 ---   -------------
 	< >
 	return(출구) : 출력 or 변수 데이터 입력 
 				  int result
 */

