package kr.s14.extentaion;


//자식클래스에 부모클래스를 상속
public class SmartPhone extends Phone {
	private String os;
	
	public SmartPhone(String number, String model, String color, String os) {
		this.number = number;
		this.model = model;
		this.color = color;
		this.os = os;	
	}
	
	public String getOs() {
		return os;
	}
	
}//class SmartPhone
