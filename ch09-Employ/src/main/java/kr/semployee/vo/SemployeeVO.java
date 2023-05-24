package kr.semployee.vo;

import java.sql.Date;
//DB연동시 필요한 데이터를 보관하는 객체
//자바빈, VO(value Object), DTO(Date Transfer Object)
public class SemployeeVO {
	//멤버변수(또는 프로퍼티)-컬럼과 1대1 대응하게끔
	private int num;
	private String id;
	private String name;
	private String passwd;
	private int salary;
	private String job;
	private Date reg_date;
	
	//비밀번호 체크
	public boolean isCheckedPassword(String userPasswd) {
		//passwd : DB에 저장된 비밀번호
		//userPasswd : loginForm에서 입력한 비밀번호
		if(passwd.equals(userPasswd)) {
			return true;
		}
		return false;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Date getReg_date() {
		return reg_date;
	}

	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	
	

}
