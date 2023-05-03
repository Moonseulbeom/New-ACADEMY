package kr.s19.lang;//String 이어서(암기하렴)

public class StringMain03 {
	public static void main(String[] args) {
		String s1 = " aBa ";//공백 앞뒤로
		String s2 = "abc";
		int a = 100;
		String msg = null;
		
		//(영문)대문자로 변환
		msg = s1.toUpperCase();
		System.out.println("msg:"+msg);//공백은 유지
		
		//(영문)소문자로 변환
		msg = s1.toLowerCase();
		System.out.println("msg:"+msg);//공백은 유지
		
		//old 문자를 new문자로 대체
		msg = s1.replace("aB", "b");
		System.out.println("msg:"+msg);
		
		//문자열 앞뒤 공백제거,중간은 안된다
		msg = s1.trim();
		System.out.println("msg:"+msg);//공백도 데이터로 인정
		
		//대상 문자열에 검색하는 문자열이 포함되어 있는지 검증
		boolean f = s1.contains("aB");
		System.out.println("f:"+f);
		
		//검색하는 문자열이 대상 문자열의 "앞"에 위치하는지 검증
		f = s2.startsWith("ab");
		System.out.println("f:"+f);
		
		//검색하는 문자열이 대상 문자열의 "뒤"에 위치 하는지 검증
		f = s2.endsWith("bc");
		System.out.println("f:"+f);
		
		//int -> String 변환(둘다 문법적으로 정식문법임)
		msg = String.valueOf(a);
		msg = a + "";//간단하게 변경가능," " 공백을 넣으면 안됨 ""빈 문자열을 넣어야 String 자료형으로 변경됨
		
	}
}
