package kr.s16.trainning;

public class Member {
	/*
	 * [실습]
	 * 멤버변수(은닉화):이름(name),나이(age),직업(job),
	 * 		 		주소(address),휴대폰(phone),
	 * 		 		취미(hobby)
	 * 생성자 : 인자가 없는 생성자, 인자가 있는 생성자
	 * 멤버메서드 : get/set메서드 정의
	 */
	
	//멤버변수
	private String name;
	private int age;
	private String job;
	private String address;
	private String phone;
	private String hobby;
	
	//생성자(인자가 없는)
	public Member() {}
	public Member(String name, int age, String job, String address,String phone, String hobby) {
		this.name = name;
		this.age = age;
		this.job = job;
		this.address = address;
		this.phone = phone;
		this.hobby = hobby;
	}
	
	//멤버메서드(get/set)
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
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	@Override
	public String toString() {//문자열에 포맷을 만들수있는 메서드(웹할때 가능)
							//문자열
		return String.format("%s\t%d\t%s\t%s\t%s\t%s\n", name,age,job,address,phone,hobby);
	}
	
	











}


