package kr.s19.lang;
/*StringBuffer 배우는 이유
필자가 S1에 여름을 추가하고 싶음(*문자열 불변의 특성*)
		메모리
	----------------------------
S1	->(X)	봄{여름..?(문자열 불변의 특성)} --->> S1이 봄과의 참조를 끊어버리고, 새로운 객체(봄,여름)을 만들어서 걔랑 참조함
S1	->(O)	봄 여름

[과정이 반복되면 메모리에 "쓰레기 객체"가 쌓여버림 -> 프로그램이 느려짐 
-> garbage collector가 지워줌(얘도 지우긴 하는데 속도가 느림) -> 또 느려짐 이하 반복]
(프로그래머는 객체 소멸 권한이 없음)
객체로 여러 가공을 할수있는 객체가 필요함 : StringBuffer 등장배경
String 수정 대강 10번은 ㅇㅋ, 이상가면 슬퍼짐
대용량 데이터 처리할 경우는 StringBuffer를 써야한다.(웹 등)
java.lang package에 있어서 자동으로 import됨
*/


public class StringBufferMain {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("여름 덥다!!");//index(0123456)
		//Buffer: 객체가 활용하는 메모리 공간_가공해도 쓰레기 객체 안만든다
		System.out.println("1:"+sb);
	
		//문자를 희망하는 index에 추가
		sb.insert(2, '이');
		System.out.println("2:"+sb);//index[2]공백자리에 추가하고 공백을 뒤로 밀어버림
	
		//기존 문자열 "뒤"에 새로운 문자열을 추가
		sb.append("가을은 ");
		System.out.println("3:"+sb);
		
		sb.append("시원하다");
		System.out.println("4:"+sb);
		
		//기존 문자열의 특정 문자열을 새로운 문자열로 대체(수정의 개념)
		//대체범위는 시작 index부터 끝 index "전"까지(index[3]은 포함안된다)
		sb.replace(0, 3, "여행가자!!");//index(0~3) 교체인데, end index 바로 앞까지 즉 index(0~2)
		System.out.println("5:"+sb);
		
		//index를 지정해서 해당 index의 문자를 삭제
		sb.deleteCharAt(0);
		System.out.println("6:"+sb);
		
		//시작 index와 끝 index를 지정해서 문자열을 삭제
		//(범위는 시작 index부터 끝 index전까지)
		sb.delete(0, 3);
		System.out.println("7:"+sb);

		//StringBuffer -> String 변환(명시적으로 해줘야함)
		String str = sb.toString();//String str = sb; 형태가 안맞아서 오류난다
		System.out.println("str:"+str);

	}//main
	
}//public class
