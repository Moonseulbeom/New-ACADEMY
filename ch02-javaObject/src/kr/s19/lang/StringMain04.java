package kr.s19.lang;

public class StringMain04 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 아래 문자열의 소문자는 대문자로 대문자는 소문자로 변경하시오.
		 */
		String str = "abcMDye-4W?EWzz";//반복문 루프 돌리기
		String result = "";//빈 문자열로 초기화_문자열에 누적시키기 위해
		
		//반복문 활용
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c>=65 && c<=90) {//대문자
				//대문자 -> 소문자로 변환
				result += String.valueOf(c).toLowerCase();//c가 문자여서 문자열로 변환
			}else if(c>=97 && c<=122) {//소문자
				//소문자 -> 대문자로 변환
				result += String.valueOf(c).toUpperCase();//누적이니까 +=
			}else {//대소문자가 아닌 문자
				result += c;//특수문자 같은거 땜시
			}
		}//for문
		
		System.out.println(result);
	
	
	}//main
	
}//public class
//대문자 65~90