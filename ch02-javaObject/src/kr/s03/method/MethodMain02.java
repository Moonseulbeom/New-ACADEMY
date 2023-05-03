package kr.s03.method;

public class MethodMain02 {
	/*
	 * [실습]
	 * 입력한 int형 정수값이 음수이면 -1을,0이면
	 * 0을, 양수이면 1을 반환하는 signOf 메서드를 작성하시오.
	 * 
	 */
	
	
//	public int signOf(int num) {
//		if(num<0) {
//			return -1;
//		}else if(num>0) {
//			return 1;
//		}else {
//			return 0;
//		}
//	}
//	
//	public static void main(String[] args) {
//		
//		MethodMain02 method = new MethodMain02();
//		
//		java.util.Scanner input =
//				new java.util.Scanner(System.in);
//		
//		System.out.print("정수 입력 : ");
//		int num = input.nextInt();
//		
//		int result = method.signOf(num);
//		
//		System.out.println("result = "+result);
//
//		input.close();
//		
//		//내가한거 돌아감
	
	//***멤버메서드는 객체를 생성하지 않으면 사용할수 없다 아래에서 객체 선언 및 생성 해야한다.,재활용성이 증가
	public int signOf(int n) {
		int sign = 0;//조건체크
		if(n>0) {
			sign = 1;
		}else if(n>0) {
			sign = -1;
		}
		return sign;//차피 0이니까, 출구역할을 해서 메서드 밖으로 나감
	}
	
	public static void main(String[] args) {
		java.util.Scanner input =
				new java.util.Scanner(System.in);
		
		System.out.print("정수 입력> ");
		int x = input.nextInt();
		
		//객체 선언 및 생성
		MethodMain02 mt = new MethodMain02();//signOf메모리에 올라감
		int result = mt.signOf(x);//메서드에서 나와서 바로 변수result에 대입
		
		System.out.println("signOf(x)는 " + result + "입니다.");

		input.close();
	}
}
