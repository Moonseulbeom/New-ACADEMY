package kr.s19.lang;

public class StringMain01 {
	public static void main(String[] args) {
		//1) 암시적으로 문자열 생성
		//암시적으로 문자열을 생성하면 문자열이 같을 경우
		//* 하나의 객체를 만들어서 공유함_주로 씀(사용이 편해서)
		String str1 = "abc";
		String str2 = "abc";
		
		//객체비교
		if(str1 == str2) {//같은 객체
			System.out.println("str1과 str2는 같은 객체");
		}else {//다른 객체
			System.out.println("str1과 str2는 다른 객체");
		}
		
		//문자열 비교 
		//<로그인 할때_if(null.equals(null)){}else{} 이거 써야됨_비교연산자 쓰면 잡혀감>
		if(str1.equals(str2)) {//같은 문자열
			System.out.println("str1과 str2의 내용이 같다");
		}else {//다른 문자열
			System.out.println("str1과 str2의 내용이 다르다");
		}
		
		//2) 명시적으로 문자열 생성
		//명시적으로 문자열을 생성하면 같은 문자열이라도
		//*객체를 따로 생성함
		String str3 = new String("Hello");
		String str4 = new String("Hello");

		//객체 비교
		if(str3 == str4) {//같은 객체
			System.out.println("str3와 str4는 같은 객체");
		}else {//다른 객체
			System.out.println("str3와 str4는 다른 객체");

		}
		
		//문자열 비교 <로그인 할때>
		//<로그인 할때_if(null.equals(null)){}else{} 이거 써야됨_비교연산자 쓰면 잡혀감>
		if(str3.equals(str4)) {//같은 무자열
			System.out.println("str3와 str4의 내용이 같다");
		}else {//다른 문자열
			System.out.println("str3와 str4의 내용이 다르다");
		}
		
		System.out.println("---------------------------------------");
		
		String str5 = "bus";
		String str6 = "Bus";
		
		//대소문자 구분하지 않고 문자열 비교-> if(null.equalsIgnoreCase(null) {} else {} ex)사람 이름
		if(str5.equalsIgnoreCase(str6)) {
			System.out.println("[대소문자 구분없이 비교] str5와 str6의 내용이 같다");
		}else {
			System.out.println("[대소문자 구분없이 비교] str5와 str6의 내용이 다르다");
		}
	
	}//main
	
}//public class StringMain01

/*
String s1 = "봄"; -> 암시적 문자열 생성
String s2 = new String("여름"); -> 명시적 문자열 생성
*봄이라는 메모리 공간을 공유한다(암시적인 경우)
 다른 봄 메모리 공간을 만든다(명시적인 경우)

한글은 구별 상관x, 영어 처리할 때 대문자 소문자 구별은 열심히 한다

equalsIgnoreCase : 대소문자 구별 안하는 메서드
*/