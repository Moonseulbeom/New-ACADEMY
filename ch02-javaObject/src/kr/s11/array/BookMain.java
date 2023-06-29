package kr.s11.array;

public class BookMain {
	public static void main(String[] args) {
		//배열 선언 및 생성
		Book[] bookArray = new Book[3];
		int total = 0;
		
		//Book 객체를 3개 생성해서 배열에 저장
		bookArray[0] = new Book("IT","Java",50000,0.05);
		bookArray[1] = new Book("IT","Oracle",40000,0.03);
		bookArray[2] = new Book("미술","반 고흐",60000,0.06);
		
		//반복문을 이용해서 배열을 요소 출력
		for(int i=0;i<bookArray.length;i++) {
			System.out.printf("%s\t",bookArray[i].getCategory());
			System.out.printf("|%s\t",bookArray[i].getName());
			System.out.printf("|%,d원\t",bookArray[i].getPrice());
			System.out.printf("|%.2f%n",bookArray[i].getDiscount());

			//합계
			total += bookArray[i].getPrice();
		}//for문
		
		//합계 출력
		System.out.printf("책 가격의 합 : %,d원%n",total);
		System.out.println("---------------------------------------");
		
		//확장for문을 이용한 배열의 요소 출력_index[i] 호출,명시가 불가능
		for(Book book : bookArray) {
			System.out.printf("%s\t",book.getCategory());
			System.out.printf("%s\t",book.getName());
			System.out.printf("%,d원\t",book.getPrice());
			System.out.printf("%.2f%n",book.getDiscount());
		}
		
		
	}//main
	
}//class BookMain

/*
 * 객체 장점(2차원 배열 안하는 이유)
 * 1)자료형 통합필요 x
 * 2)method 호출 작업 가능
*/

/*
 * 객체 class 형태 - 배열 - 배열의 단점을 보완한 class
 * 배열의 단점 : 길이 지정시 추가로 늘릴수 없음(방을 3개라 정하면 늘릴수가 없음)
 * list..? 객체로 만들어지는데 방이 늘어남
 * 일차원 배열은 고정데이터를 사용할 때 배열이 주로 쓰임
 * 가변적인 경우 list를 사용하게 된다
*/
