package kr.s03.Operation;

public class ForMain04 {
	public static void main(String[] args) {
		System.out.println("===for문===");
		
		java.util.Scanner input = 
				new java.util.Scanner(System.in);
		
		System.out.print("단 입력> ");
		int dan = input.nextInt();
//		//if(dan>9) {
//			System.out.print("구구단이 아닙니다.");
//			System.exit(0);
//		} 내가 그냥 걸어본거
		
		System.out.println(dan + "단");
		System.out.println("---------");
		
		for(int i=1;i<=9;i++) {//i는 곱해지는 수
			System.out.println(dan + "*" + i + "=" + dan*i);
		}
		input.close();
	
	}
}
