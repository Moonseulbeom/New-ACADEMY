package kr.s07.constructor;

class Car{
	String color;//색상_null
	String gearType;//변속기 종류 - auto(자동), manual(수동)_null
	int door;//문의 개수_0
	
	//생성자(생략 가능하고 생략하면 컴파일 시 자동 생성)
	//객체 생성시 호출되고 멤버변수를 초기화하는 역할
	public Car() {}
	
	
}
public class CarMain01 {
	public static void main(String[] args) {
		//객체 생성시 생성자는 처음에 한 번만 실행되고
		//객체 생성 이후에는 호출 불가능
		Car c1 = new Car();
		System.out.println(c1.color + "," + c1.gearType + "," + c1.door);
		//null 메모리 객체로 생성되야하는데, 데이터도 없고, 참조 주소도 없음, 일단 초기화
		System.out.println("----------------------");
		
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		System.out.println(c1.color + "," + c1.gearType + "," + c1.door);
		System.out.println("----------------------");

		Car c2 = new Car();//객체 생성 이후 초기화
		System.out.println(c2.color + "," + c2.gearType + "," + c2.door);
		System.out.println("----------------------");
		
		c2.color = "red";//멤버변수 넣어주기
		c2.gearType = "manual";
		c2.door = 5;
		
		System.out.println(c2.color + "," + c2.gearType + "," + c2.door);

		
	}
}
