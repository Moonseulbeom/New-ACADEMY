package kr.s01.exception;

public class ExceptionMain03 {
	public static void main(String[] args) {
		int var = 50;
		//다중catch문
		//예외가 발생하면 예외객체가 전달되는 catch
		//블럭으로 이동해서 수행문을 실행
		try {
					   //String -> int
			int data = Integer.parseInt(args[0]);
			System.out.println(var/data);
			System.out.println("------");
			/*
			 * (주의)다중 catch문을 사용할 떄
			 * Exception과 하위 예외클래스를 동시에
			 * 명시할 떄는 하위 예외클래스를 먼저 명시하고
			 * 가장 뒤에 Exception을 명시해야 동작상의
			 * 문제가 발생하지 않음
			 */
		}catch(NumberFormatException e) {
			System.out.println("숫자가 아닙니다.");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("입력한 데이터가 없습니다.");
		}catch(ArithmeticException e){
			System.out.println("0으로 나눌수 없습니다.");
		}catch(Exception e) {
			//Exception은 부모라서 아래 예외 경우가 발생시 다 여기로 들어옴_컴파일 에러난 이유
			//아래에 넣으면 컴파일 에러 안남(위부터 check해서)
			System.out.println("나머지 예외는 여기로 오세요");
		}//end of try catch
		
		System.out.println("프로그램 종료!!");

	}//end of main
	
}//end of p.c

/*
1) 정상실행(argument에 10)		

5
------
프로그램 종료!!

2) NumberFormatException (argument에 서울)

숫자가 아닙니다.
프로그램 종료!!

3) ArrayIndexOutOfBoundsException (argument에 공백)

입력한 데이터가 없습니다.
프로그램 종료!!

4) ArithmeticException (argument에 0)

0으로 나눌수 없습니다.
프로그램 종료!!

*/