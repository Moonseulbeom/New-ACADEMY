package kr.s04.array;

public class ArrayMain11 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 단을 입력 받아서 1~9까지 곱해서 값을 구하고
		 * 배열에 그 값을 저장한 후 배열에 저장된
		 * 값을 읽어서 구구단 출력 형식(2*1=2)으로
		 * 출력하시오
		 * 
		 *[입력 예시]
		 *단 입력:2
		 *
		 *[출력 예시]
		 *2*1 = 2
		 *
		 *
		 *2*9 = 18
		 */
//		java.util.Scanner input=
//				new java.util.Scanner(System.in);
//		
//		System.out.print("단 입력:");
//		int num = input.nextInt();
//		System.out.println("---------");
//		int[] dan = {1,2,3,4,5,6,7,8,9};
//		int result = 0;
//		
//		
//		for(int i=0;i<dan.length;i++) {
//			if(num<0 || num>9) {
//				System.out.println("잘못된 숫자입니다. 1~9까지 넣어주십쇼");
//				System.exit(0);
//			}else {
//				result = num*dan[i];
//				System.out.println(num+"*"+dan[i]+"="+result);
//			}
//		}
//		input.close(); 
//		돌아는 가는데 결과값을 배열에 안넣음;;
		
		java.util.Scanner input=
				new java.util.Scanner(System.in);
		
		System.out.print("단 입력:");
		int dan = input.nextInt();
		
		//배열 선언 및 생성
		int[] array = new int[9];
		
		System.out.println(dan + "단");
		System.out.println("----------");
		
		for(int i=0;i<array.length;i++) {
			array[i] = dan * (i+1);
			System.out.println(dan + "*" + (i+1) + "=" + array[i]);
		}
		input.close();
		//강사님이 한거
		
	}
}
