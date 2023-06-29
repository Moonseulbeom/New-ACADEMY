package kr.s09.score;

public class Score {
	/*
	 * [실습]
	 * 멤버변수 : 이름(name), 국어(korean), 영어(english), 수학(math)
	 * 멤버메서드:get/set 메서드
	 * 총점구하기(makeSum), 평균구하기(makeAvg_double),등급구하기(makeGrade)
	 */
	//멤버변수
	private String name;
	private int korean;
	private int english;
	private int math;
	
	//총점구하기
	public int makeSum() {
		return korean+english+math;
	}
	
	//평균구하기
	public double makeAvg() {
		return makeSum()/3.0;//둘다 double(실수 맞춰주기)
	}
	
	//등급구하기
	public String makeGrade() {
		String grade;
		switch((int)makeAvg()/10) {//()안에 int밖에 안들어감 캐스팅연산자 (int) 들어가야함
		case 10:
		case 9: grade = "A";break;
		case 8: grade = "B";break;
		case 7: grade = "C";break;
		case 6: grade = "D";break;
		default: grade = "F";
		}//end of switch문
		return grade;
	}//end of public String makeGrade()
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
}
