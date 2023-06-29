package kr.s10.trainning;

public class Animal {
	/*
	 * [실습]
	 * Animal 
	 * 멤버변수 : 이름(name_String),나이(age_int),비행여부(fly_boolean)
	 * 멤버메서드 : Set,get 메서드 생성(변수 각각생성)
	 * 			boolean 예)setFly, isFly
	 * 생성자 : 인자가 없는 생성자, 인자가 있는 생성자
	 * 
	 */
	
	//멤버변수(은닉화_캡슐화)
	private String name;//이름
	private int age;//나이
	private boolean fly;//비행여부
	
	//인자가 없는 생성자(오버로딩)
	public Animal() {};
	//인자가 있는 생성자
	public Animal(String name, int age, boolean fly) {
	//멤버변수		지역변수(this)
	this.name = name;
	this.age = age;
	this.fly = fly;
	}
	
	//멤버메서드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isFly() {
		return fly;
	}
	public void setFly(boolean fly) {
		this.fly = fly;
	}
		
}//class Animal body
