package kr.s07.constructor;

class Car2{//같은 패키지안에 동일한 명의 클래스가 있으면 오류난다
	String color;
	String gearType;
	int door;
	
	//동일한 생성자명이지만 인자값이 달라서 오류가 안났다. 생성자 overloading
	public Car2() {}//인자가 없는 생성자
	
	public Car2(String c, String g, int d) {//인자가 있는 생성자, 개수가 많아지면 초기에 세팅하기 힘들당,불편할지도..?
		color = c;
		gearType = g;
		door = d;
		
		
	}
	
}
public class CarMain02 {
	public static void main(String[] args) {
		//객체 선언 및 생성
		Car2 c1 = new Car2();//생성자 정의를 해서, 인자가 없는 생성자를 추가로 생성할 이유가 없음, 위에 추가로 정의해야한다
		//객체의 멤버변수에 데이터 할당 (투스텝) 데이터 넣어주는 작업해줘야한다
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		System.out.println(c1.color + "," + c1.gearType + "," + c1.door);
		System.out.println("--------------------------------------------");
		
		//인자가 있는 생성자를 이용해서 객체 생성
		//객체의 멤버변수를 초기화함
		Car2 c2 = new Car2("blue", "auto",2);
		
		System.out.println(c2.color + "," + c2.gearType + "," + c2.door);
		
		
		
	}
}
