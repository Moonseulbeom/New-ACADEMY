package kr.s04.array;

public class ArrayMain09 {//		인자,파라미터
	public static void main(String[] args) {//외부 입력데이터를 String 문자로 받아들임;;
		//두 개의 정수를 전달한 후 + 연산
		System.out.println(args[0]+args[1]);
		System.out.println("-------------");
		
		//String(문자열) -> int(정수) 변환(함수) 자주 쓴다 암기하렴
		int num = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		System.out.println("합계 : " + (num+num2));
	
	
	}
}
