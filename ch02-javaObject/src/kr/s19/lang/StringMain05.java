package kr.s19.lang;//Character 활용

public class StringMain05 {
	public static void main(String[] args) {
		String str = "abcMDye-4W?EWzz";//char[]로 바꿔줄꺼
		String result = "";
					   //String -> char[]
		for(char c : str.toCharArray()) {
			//대문자이면 true, 소문자이면 false
			if(Character.isUpperCase(c)) {//대문자
				//소문자로 변환
				result += Character.toLowerCase(c);
				//소문자이면 true,대문자이면 false
			}else if(Character.isLowerCase(c)) {//소문자
				//대문자로 변환
				result += Character.toUpperCase(c);
			}else {
				result += c;
			}
			
		}//end of for
		
		System.out.println(result);
		
	
	}//end of main

}//end of public class

//메서드를 적극적으로 쓰면 코드가 줄어든다
