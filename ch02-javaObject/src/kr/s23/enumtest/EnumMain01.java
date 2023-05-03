package kr.s23.enumtest;//Enum 거의 문자열 상수이용/숫자 쓰면 final 쓰는게 편함

public class EnumMain01 {
	//문자열 상수
	public static final String JAVA = "JAVA";
	public static final String ORACLE = "ORACLE";
	public static final String HTML = "HTML";


	public static void main(String[] args) {
		System.out.println(EnumMain01.JAVA);//클래스명 생략
		System.out.println(EnumMain01.ORACLE);//클래스명 생략
		System.out.println(EnumMain01.HTML);//클래스명 생략

	}//end of main
	
}//end of public class
