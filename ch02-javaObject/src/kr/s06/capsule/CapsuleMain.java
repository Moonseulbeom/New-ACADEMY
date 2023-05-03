package kr.s06.capsule;

class Capsule{
	//은닉화
	//데이터를 보호, 변수를 제어하려고, setA랑 getA를 동시에 보통 걸어준다
	private int a;
	//돈 저장하는 a(금고) setA(돈 받는 은행원)와 getA(돈 주는 은행원)가 감싸고 있음
	//중요한건 setA, getA
	
	//캡슐화
	//데이터를 셋팅하는 메서드(원치않는 데이터 검증해준다)
	public void setA(int n) {//n은 위 a에다가
		if(n>=0) {
			a=n;//돈 잘준거
		}else {
			System.out.println("음수는 허용되지 않습니다.");//위조지폐 준경우
		}
	}
	
	//데이터를 반환하는 메서드(특별한 반응이 필요하면 셋팅 해줄텐데 없당)
	public int getA() {
		return a;
	}
}

public class CapsuleMain {//접근제한 같은 class내에서만 private
	public static void main(String[] args) {
		Capsule cap = new Capsule();
		/*
		 * 변수 a의 접근 지정자(제한자)가 private
		 * 이기 때문에 같은 클래스 내에서는 호출이
		 * 가능하지만 다른 클래스에서 호출 불가능
		 */
		//cap.a=-1;
		// System.out.println(cap.a);
		
		cap.setA(100);//데이터 저장
		System.out.println(cap.getA());//데이터 호출
		System.out.println("---------------");
		
		cap.setA(-200);//음수는 안됨,데이터 걸러짐
		System.out.println(cap.getA());//데이터 호출
		System.out.println("---------------");

		
		
		
	}
}