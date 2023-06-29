package kr.s03.Operation;

public class SwitchMain04 {//항상 사용자가 부족할지도 모른다는 것을 기억하장
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 두 개의 정수와 연산자를 입력한 후 연산의 결과를 출력하시오.
		 * 
		 * [입력 예시]
		 * 첫번쨰 수 : 10
		 * 연산자 : + (input.next())
		 * 두번째 수 : 20
		 * 
		 * [출력 예시]
		 * 10 + 20 = 30
		 * printf 
		 */
		/*
		java.util.Scanner input = 	
		
				new java.util.Scanner(System.in);
		
		int first, second, result;
		//굳이 first,second 따로 선언 하지말것 한번에 선언 초기화 다하기
		//여기서 result = 0; 으로 선언했어야함
		
		System.out.print("첫번째 수 : ");
		first = input.nextInt();
		System.out.print("연산자 : ");
		String method = input.next();
		
		switch(method) {//여기서 result = first second 수식 연결해줘야함
		 case "+":
			 System.out.println("+");
			 break;
		 case "-":
			 System.out.println("-");
			 break;
		 case "*":
			 System.out.println("*");
			 break;
		 case "/":
			 System.out.println("/");
			 break;
		 default :
			 System.out.println("계산 x");
		 }
		
		System.out.print("두번째 수 : ");
		second = input.nextInt();
		
		if(method == "+") {
			result = first + second
			 }elseif(method=="-"){
				 result = first - second
			 }
		//이런거 안해도됨(if 날리기)
		 
		System.out.printf("%d + %c+ %d = %d", first, method, second, result);
		//굳이 +로 연결 안해도 됨
		//method는 문자열이니까 %s
		*/
		//??? 몰겠음 삽질
		
		java.util.Scanner input = 	
				new java.util.Scanner(System.in);
		//결과값을 저장하는 변수 선언
		int result = 0;//변수 선언에서 그릇 만든거구나
		
		System.out.print("첫번째 수 : ");
		int first = input.nextInt();
		
		System.out.print("연산자 : ");
		String operator = input.next();
		
		System.out.print("두번째 수 : ");
		int second = input.nextInt();
		
		switch(operator) {
		case "+":
			result = first + second;break;//이렇게 연결해도 됨
		case "-":
			result = first - second;
			break;
		case "*":
			result = first * second;
			break;
		case "/":
			if(second!=0) {
				result = first / second;
			}else {
				System.out.println("0으로 나눌 수 없습니다.");
				System.exit(0);//프로그램 종료

			}
			break;
		case "%":
			if(second!=0) {//second가 0이 아니면(부정)
				result = first % second;
			}else {
				System.out.println("0으로 나눌 수 없습니다.");
				System.exit(0);//프로그램 종료(0은 안전하게 종료,정상종료)

			}
			break;
		default: 
			System.out.print("잘못된 연산자 입력");
			System.exit(0);//프로그램 종료
		}
		
		System.out.println();//단순 줄바꿈
		System.out.printf("%d %s %d = %d", first, operator, second, result);
		
		input.close();
		
	}
}
