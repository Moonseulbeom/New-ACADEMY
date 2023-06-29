package kr.s02.operator;//대분류

public class OperatorMain01 {
	public static void main(String[] args) {
		System.out.println("===증감연산자===");//1순위(빈도수가 높음)
		//증가연산자
		int i=5;
		//증가연산자를 변수 앞에 명시하면 변수값을 1 증가시킨 후 증가된 값을 읽어옴(원스텝_메모리가 증가한대로)
		System.out.println(++i);//6
		System.out.println("----------");
		
		//증가연산자를 변수 뒤에 명시하면 변수값을 먼저 읽어온 후 메모리의 변수의 값을 1 증가시킨다.
		//증가된 값을 보기 위해서는 한 번 더 호출 해야함(투스텝)
		System.out.println(i++);//6
		System.out.println(i);//7
		System.out.println("----------");

		//연산자 위치에 따라 보여지는게 달라짐(메모리 상에선 같다)
		// 효율적으로 위가 더 좋아 보이지만 둘다 쓴다.
		
		//감소연산자(증가연산자의 특징과 같다)
		int j = 10;
		System.out.println(--j);//9
		System.out.println("----------");

		System.out.println(j--);//9
		System.out.println(j);//8
		
		//반복문에 자주 쓰인다
		
		
	}

}