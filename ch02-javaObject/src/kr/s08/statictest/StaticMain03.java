package kr.s08.statictest;

class StaticMethod{
	//인스턴스변수 (여기선 default를 쓴건데, 보통 private을 권장함)
	String s1 = "서울";
	//static(클래스)변수
	static String s2 = "한국";//접근지정자 default생략된거, public을 제일 많이 쓴다(공유니까)
	//static메서드
	public static String getString() {
		return s2;//StaticMethod.s2 이건데 생략한거
				 //s1은 객체를 생성하고, 호출해야한다(아직 메모리 올라가기전임)
	}
 }

public class StaticMain03 {
	public static void main(String[] args) {
		//static메서드는 클래스명.메서드명의 형식으로 호출
		System.out.println(StaticMethod.getString());//class StaticMethod != StaticMain03이라 클래스명 생략 불가
		//static 메모리 안에 변수가 생기면 초기화가 아니라 누적, 공유함
	}
}
