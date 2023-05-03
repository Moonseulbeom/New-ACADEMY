package kr.s04.array;
//변수(메모리 공간 할당)<-- 하나의 값만 저장
//-> 데이터 여러개를 보관하면 힘듬(한계가 있다)

public class ArrayMain01 {
	public static void main(String[] args) {
		//투스텝
		char[] ch;//배열 선언 ch에 메모리 주소
		ch = new char[4];//배열 생성, 방번호:인데스
		
		//배열 초기화(0번부터 시작)
		ch[0] = 'j';
		ch[1] = 'a';
		ch[2] = 'v';
		ch[3] = 'a';
		
		//배열의 요소 출력
		System.out.println(ch[0]);
		System.out.println(ch[1]);
		System.out.println(ch[2]);
		System.out.println(ch[3]);
		
		System.out.println("-----------------");
		
		//반복문을 이용한 배열의 요소 출력
		//ch.length : 배열의 길이
		for(int i=0;i<4;i++) {
			System.out.println("ch["+i+"]" + ch[i]);
//								방의 개수		실제 데이터 읽어오는 부분
		}
		for(int i=0;i<ch.length;i++) {//i<=ch.length =넣으면 4까지 들어가서 안된다.
			System.out.println("ch["+i+"]" + ch[i]);
		}
		
		//배열의 선언 및 생성(원스텝)
		int[] it = new int[6];//length -> 6 (0~5)
		
		//배열의 선언 및 생성(명시적 배열 생성) 초기화_원칙
		char[] ch2 = new char[] {'j','a','v','a'};//방개수 따로 지정 x, 뒤{}에 값을 카운팅 해서 자동으로 적용됨	
		
		//배열의 선언 및 생성(암시적 배열 생성) 초기화_축약적
		char[] ch3 = {'자','바'};
		
		//처음부터 데이터를 가지고 시작하는 경우가 多
		
	}
}
