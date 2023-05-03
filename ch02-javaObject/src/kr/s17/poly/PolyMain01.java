package kr.s17.poly;//다형성

//부모클래스
class Parent{
	int a = 100;
}
//자식클래스
class Child extends Parent{//참조자료형은 객체가 가지고있는 범위를 알수 있다.
	int b = 200;
}
public class PolyMain01 {
	public static void main(String[] args) {
		Child ch = new Child();//상속관계일때만, 자료형형변환 된다
		System.out.println(ch.a);
		System.out.println(ch.b);
		
		Parent p = ch;//ch에 저장된 객체의 주소를 p에 저장
						//자식클래스타입 -> 부모클래스타입 형변환
						//업캐스팅, 자동적으로 형변환
		//참조자료형을 부모클래스 타입으로 명시하면
		//부모클래스영역의 멤버만 호출 가능
		System.out.println(p.a);//부모타입 부르면 자식껀 못 가져옴
		//호출범위가 줄어들어 호출 불가능_메모리에는 올라가 있음_다시 부르고 싶으면 Child 타입으로 바꾼다
		//System.out.println(p.b);
		
		//부모클래스타입 -> 자식클래스타입 형변환
		//명시적 형변환 필요_줄어든 범위를 늘려주기 위해서
		//다운캐스팅, 명시적으로 형변환
		//(Child)캐스팅 연산자 넣어줘야한다
		Child ch2 = (Child)p;
		System.out.println(ch2.a);
		System.out.println(ch2.b);
		
		
		
		

	}
}
/*
 * 
-----객체--------
a = 100 -> ch      P //나가리
b = 200 -> p		C

메모리에는 부모 자식 데이터가 다 들어가있는데, 호출범위를 제한하려고 부모-자식간의 형변화 진행하는듯?
 */
