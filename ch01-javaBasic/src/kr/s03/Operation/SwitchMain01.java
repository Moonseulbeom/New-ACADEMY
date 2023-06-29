package kr.s03.Operation;

public class SwitchMain01 {
	public static void main(String[] args) {
	 java.util.Scanner input =
			 new java.util.Scanner(System.in);
	 
	 System.out.println("===switch문===");
	 
	 System.out.print("정수 입력>");
	 int a = input.nextInt();
	 //switch의 인자값은 long을 제외한 정수형
	 //(byte,short,int),char 문자열 사용 가능
	 //if랑 달리 switch 영역 하나만 씀 그래서 조건별로 break;을 넣어줘야함
	 
	 switch(a) {
	 case 1:
		 System.out.println("1 입력");
		 break;//switch 블럭을 빠져나감
	 case 2:
		 System.out.println("2 입력");
		 break;//switch 블럭을 빠져나감
	 case 3:
		 System.out.println("3 입력");
		 break;//switch 블럭을 빠져나감
	 default :
		 System.out.println("1,2,3이 아닌 숫자 입력");//default는 break 생략 가능
	 }
	 
	 input.close();
	
	}
}
