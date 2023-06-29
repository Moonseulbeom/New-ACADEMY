package kr.s03.method;

public class MethodMain01 {
	//인자에 데이터를 전달하고 메서드내에서 가공한 후 
	//결과값을 반환하는 메서드
	//	 반환형(타입) 메서드명 인자 또는 파라미터
	public int add(int a,int b) {
		return a+b;//위 int로 명시
	}
	
	//반환하는 데이터가 없는 경우
	//void:비어있는 return이 없는데 형식때문에 void라고 명시해줌
	//접근지정자 반환형 메소드명
	public void print(String str) {
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		//객체 선언 및 생성
		MethodMain01 method = new MethodMain01();
		//반환하는 데이터가 있는 매서드 호출
		int result = method.add(100, 200);//결과값이 result로 리턴, 대입됨 
		System.out.println("result ="+result);
		
		//반환하는 데이터가 없는 메서드 호출
		method.print("서울");
	}
}
