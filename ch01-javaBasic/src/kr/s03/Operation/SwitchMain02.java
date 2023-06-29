package kr.s03.Operation;

public class SwitchMain02 {
	public static void main(String[] args) {
		java.util.Scanner input=
				new java.util.Scanner(System.in);
		System.out.println("===switch문===");
		
		System.out.print("계절 입력>");
		//next() : 봄 여름 -> 문자 사이 공백 있으면 '봄' 만 반환
		//nextLine() : 봄 여름 -> 봄 여름 / 한 라인의 데이터 반환 공백 있어도 ok
		String season = input.nextLine();
		
		switch(season) {
		case "봄":
			System.out.println("꽃이 피는 계절");
			break;
		case "여름":
			System.out.println("뜨거운 태양의 계절");
			break;
		case "가을":
			System.out.println("산들바람이 부는 계절");
			break;
		case "겨울":
			System.out.println("눈이 내리는 계절");
			break;
		case "빅뱅":
			System.out.println("봄,여름,가을,겨울");
			break;
		default://else역할
			System.out.println("없는 계절");
		}
		input.close();
	}
}
//if : 비교연산자 논리연산자 다양하게 조건체크를 걸 수 있다,일반적
//switch : equal 비교만 가능하다 단순하게 조건체크,직관적,타인 코드를 이해하기 위해