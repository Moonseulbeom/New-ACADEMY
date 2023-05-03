package kr.s01.exception;
//예외를 던져서(throw) 특정 조건일떄

public class ExceptionMain07 {//하나의 기법(선택의 문제)
	
	public void methodA(String[] n) throws Exception{
		
		if(n.length > 0) {//데이터 입력
			for(String s : n) {
				System.out.println(s);
			}
		}else {//데이터 미입력
			throw new Exception("입력한 데이터가 없습니다.");//메모리에 예외 객체 생성
		}
	}
	
	public static void main(String[] args) {
		
		ExceptionMain07 ex = new ExceptionMain07();
		
		try {
			ex.methodA(args);
		}catch(Exception e){
			//System.out.println(e.toString()); -> 객체의 이름이 보인다.
			System.out.println(e.getMessage());
		}
	}//end of main
	
}//end of p.c
