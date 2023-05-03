package kr.s03.method;

public class MethodMain03 {
	/*
	 * [실습]
	 * 배열 요소의 수를 입력받아서 배열 x 생성
	 * 입력받은 정수를 배열 x에 저장하고
	 * 배열 x가 가진 모든 요소의 합을 구하는 
	 * sumOf(int[] a) 메서드를 정의하시오.
	 * 
	 * [출력 예시]
	 * 모든 요소의 합은 200입니다.
	 */
	
//	public int sumOf(int[]a) {
//		int sum = 0;
//		for(int i=0;i<a.length;i++) {
//			sum += a[i];
//		}return sum;
//	}
//	
//	public static void main(String[] args) {
//		java.util.Scanner input=
//				new java.util.Scanner(System.in);
//		
//		System.out.print("입력받은 정수:");
//		int b = input.nextInt();
//		int[] a = new int[b];
//		
//		MethodMain03 summ = new MethodMain03();
//		
//		int result = summ.sumOf(a);
//		
//		System.out.printf("모든 요소의 합은 %d입니다.", result);
//	
//		input.close();
//	}
//}
//내가 한거 안됨;;;
	
	public int sumOf(int[] a) {
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			//누적
			sum += a[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		java.util.Scanner input=
				new java.util.Scanner(System.in);
		
		System.out.print("요소 수>");
		int num = input.nextInt();
		
		//num개의 요소를 가지는 배열
		int[] x = new int[num];
		
		//데이터를 입력 받아서 배열에 저장
		for(int i=0;i<x.length;i++) {//x.length 대신에 num 넣어도 된다
			System.out.print("x["+i+"]: ");
			x[i] = input.nextInt();
		}
	
		//객체 선언 및 생성
		MethodMain03 mt = new MethodMain03();
		int result = mt.sumOf(x);//num개의 요소를 가지는 배열(x)를 넘겨줌, 윗 메서드에서 sum을 result로 넘겨줌
		System.out.println("모든 요소의 합은 "+ result + "입니다");
		
		input.close();
	}
}
//메서드를 만들어서 재활용성을 높였다! 