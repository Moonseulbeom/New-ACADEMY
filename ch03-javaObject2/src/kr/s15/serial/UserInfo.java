package kr.s15.serial;//직렬화 대상이 되는 클래스(회원가입_arraylist에 직렬)

import java.io.Serializable;

public class UserInfo implements Serializable{
	private String name;
	private int age;
	private String address;
	
	//생성자 이용
	public UserInfo(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	//toString으로 데이터 반환
	@Override
	public String toString() {
		return "이름 : " + name + ",나이 : " + age + ", 주소 : " + address;
	}
	
}
