package kr.s01.exception;

public class ExceptionMain02 {
	public static void main(String[] args) {
		int[] array = {10,20,30};
		//테스트용으로 없는 인덱스 3을 호출해서
		for(int i=0;i<=array.length;i++) {
			//예외처리
			//예외가 발생해도 정상 종료될 수 있도록
			//프로그램적으로 처리하는 것을 말함
			try {
				//예외가 발생할 가능성이 있는 코드를 명시
				//만약 예외가 발생하면 예외가 발생한 코드의
				//실행을 멈추고 catch블럭으로 이동		  //예외발생
				System.out.println("array["+i+"]:"+array[i]);
				//위의 코드에서 예외가 발생하면 아래 코드는 실행되지 않음
				System.out.println("~~~~~~");//정상적인 작동확인 요소
			    //예외발생시 생성되는 예외 객체의 타입(자료형) 변수(생성된 예외객체)
			}catch(ArrayIndexOutOfBoundsException e) {//java.lang 패키지에 있어서 import 안해도 된다
				//예외가 발생하면 catch블럭으로 이동해서 예외가
				//발생한 이유를 설명하거나 대체코드를 작성
				System.out.println("없는 인덱스 호출");//예외문구 출력
			}//end of try catch
		
		}//end of for
		
		System.out.println("프로그램 끝!!");//프로그램 정상종료

	}//end of main
	
}//end of p.c
//무조건 try{} catch(){} 강요하는 예외
//-> 일반적 Exception {IOException, interruptedException}
//-> 안해주면 컴파일 에러남
//-> 실행시 Exception은 강요는 아님