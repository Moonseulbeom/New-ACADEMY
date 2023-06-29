package kr.s20.util;

import java.util.StringTokenizer;
//연-월-일 시:분:초
//스플릿 3번 작업해야함 <-> StringTokenizer 쓰면 한번에 가능

public class StringTokenizerMain01 {
	public static void main(String[] args) {
		String source = "100,200,300,400";
									//문자열, 구분자
		StringTokenizer st = new StringTokenizer(source,",");
		
		//반복문을 이용해서 구분자로 잘라낸 문자열을 출력(while문)
				//구분자를 이용해서 잘라낸 문자열이 있는지 검증
		while(st.hasMoreTokens()){
								//구분자로 잘라낸 문자열 반환
			System.out.println(st.nextToken());
		}
		
		
		
	
	}//end of main
	
}//end of public class
