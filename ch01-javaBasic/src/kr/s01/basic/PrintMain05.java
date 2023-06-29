package kr.s01.basic;
public class PrintMain05 {
	public static void main(String[] args) {
		//System.out.printf(포맷문자, 데이터)를 이용한 출력(데이터의 종류를 표시할 수 있는 포맷문자 지원)
		//숫자(정수, 실수) 사용시 이점이 크다. 문자,문자열,논리값은 그닥 효용이 없음 println()이 더 나음.
		//데이터 종류가 혼합되어있으면 printf()가 더 편함
		//printf(null, args) -> \n,%n 줄바꿈
		
		//문자		      포맷문자
		System.out.printf("%c\n", 'A');//범용적으로 print, printnl, printf 다 쓸수 있음
		//6자리 확보 오른쪽에 정렬
		System.out.printf("%6c%n", 'B');//printf만 가능
		//6자리 확보 왼쪽에 정렬
		System.out.printf("%-6c%n", 'c');
		System.out.println("==========");
		
		//정수
		System.out.printf("%d%n", 67);
		//3자리 단위로 쉼표 표시
		System.out.printf("%,d원%n", 100000000);//돈 표시
		//5자리를 확보 오른쪽 정렬
		System.out.printf("%5d%n", 20);
		//5자리를 확보 왼쪽 정렬
		System.out.printf("%-5d%n", 20);
		System.out.println("==========");

		//실수
		//소수점 자리 6자리 확보, 비어 있는 자리는 0으로 채움
		System.out.printf("%f%n", 35.896);
		//소수점 둘째자리까지 출력(셋째자리에서 반올림)
		System.out.printf("%.2f%n", 35.896);
		//10자리 확보, 오른쪽에 정렬, 소수점 둘째자리까지 출력
		System.out.printf("%10.2f%n", 35.896);
		System.out.println("==========");

		
		//문자열
		System.out.printf("%s%n", "우주");
		System.out.println("==========");

		
		//논리값
		System.out.printf("%b%n", true);
		System.out.println("==========");
		
		//(복합적)데이터의 종류가 여러개일 경우 printf가 활용이 좋다.
		System.out.printf("%s는 %d점입니다.%n", "점수", 98);
		
		
	}
}
