package kr.s23.enumtest;//Enum 참고사항

//열거형 상수
enum Lesson{//사용빈도수에 따른 상수 묶음?
	JAVA,ORACLE,HTML
}

public class EnumMain02 {
	public static void main(String[] args) {
		System.out.println(Lesson.JAVA);
		System.out.println(Lesson.ORACLE);
		System.out.println(Lesson.HTML);
		System.out.println("-------------");
		//열거 객체의 문자열을 반환
		System.out.println(Lesson.JAVA.name());
		System.out.println(Lesson.ORACLE.name());
		System.out.println(Lesson.HTML.name());
		System.out.println("-------------");
		//열거 객체의 순번(0부터 시작)을 반환
		System.out.println(Lesson.JAVA.ordinal());
		System.out.println(Lesson.ORACLE.ordinal());
		System.out.println(Lesson.HTML.ordinal());
		System.out.println("-------------");

	}//end of main
	
}//end of public class
