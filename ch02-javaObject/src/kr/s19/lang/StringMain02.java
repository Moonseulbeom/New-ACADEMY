package kr.s19.lang;
//String이 가지는 주요한 메서드_암기

public class StringMain02 {
	public static void main(String[] args) {
		String s1 = "Kwon Sun Ae";
				   //012345678910_0~10까지 인덱스가 부여_길이(length)=11
		
		int index = s1.indexOf('n');
		System.out.println("맨 처음 문자 n의 위치 : " + index);//인덱스가 3이다(길이4번째)
		
		index = s1.indexOf("Sun");//(앞부터 찾고) return할때 값 하나밖에 반환 못함
		System.out.println("문자열 Sun의 위치 : " + index);//S의 인덱스 5
		
		index = s1.lastIndexOf('n');//(뒤부터 찾고)
		System.out.println("마지막 문자 n의 위치 : " + index);//인덱스 7
		
		char c = s1.charAt(index);//문자 추출(7담겨 있음)
		System.out.println("추출한 문자 : " + c);
		
		index = s1.indexOf('S');
		//System.out.println(index);//소문자 s_못찾으면 -1로 알려줌
		//전달된 인덱스부터 마지막 인덱스까지 문자열 추출
		String str = s1.substring(index);
		System.out.println("대문자 S부터 끝까지 잘라내기 : " + str);
	
		//begin index부터 end index "전까지" 문자열 추출
		str = s1.substring(index,index+3);//현재 인덱스 5~8까지
		System.out.println("대문자 S로부터 3자까지 잘라내기 : " + str);
		
		int length = s1.length();
		System.out.println("s1의 길이 : " + length);//인덱스 0~10까지
		
		
		//구분자를 이용해서 문자열을 잘라내는 구조_Kwon Sun Ae 공백으로 문자열 잘라냄
		String[] array = s1.split(" ");//공백이 구분자 역할(잘라내서 배열에 저장)_여러개의 구분자를 사용x
		for(int i=0;i < array.length;i++) {
			System.out.println("array["+i+"]: " +array[i]);
		}
		//공백 안해주면 각각의 문자들이 다 추출된다(빈문자열) 방은 없고 메모리만 점유중
		//연월일시분초때에도 사용함
	}//main
	
}//public class

/*
 * String s1 = null;<-객체 생성 x(평소 하는거)
 * String s2 = ""<-- 객체 생성 o(문자열 누적작업해야할때 많이 쓴다)
 */

