package kr.s15.serial;//참고용 객체의 직렬화

import java.io.Serializable;

/*
 * Serializable 인터페이스를 구현하면 해당 클래스는
 * 객체직렬화 대상이 되어 언제든지 객체직렬화를 수행할 수 있음.
 * Serializable 인터페이스가 구현되지 않으면
 * 객체직렬화 불가능.
 * 멤버변수가 직렬화 대상.
 클래스명 멤버변수 내용(메서드는 저장이 안됨) 데이터 보관용도
 */

								//마킹 인터페이스 느낌(추상메서드가 없다)
public class Customer implements Serializable {
	private String name;
	
	//생성자
	public Customer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "당신의 이름은 " + name;
	}
	
	
}
