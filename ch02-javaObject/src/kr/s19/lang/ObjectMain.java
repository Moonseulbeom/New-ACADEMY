package kr.s19.lang;

public class ObjectMain {
	public static void main(String[] args) {
		//ObjectMain에 Object가 상속되어 있고
		//Object로부터 상속 받은 메서드를 호출
		ObjectMain om = new ObjectMain();
		//클래스 정보 반환
		System.out.println(om.getClass());
		//클래스명 반환
		System.out.println(om.getClass().getName());
		//해시코드(10진수) 반환
		System.out.println(om.hashCode());//객체의 유니크한 해시코드값
		//해시코드(16진수) 반환
		System.out.println(Integer.toHexString(om.hashCode()));
		
		//참조값 반환
		System.out.println(om.toString());//위 내용을 토대로 toString이 참조값 만든다
		System.out.println(om);
		
	}
}
//Object는 모든 class의 부모
//java.lang에서 제일 중요한건 String(기본 클래스)
//deprecated : 지원하지 않겠다(완곡하게 사용하지마라)_앵간하면 안쓰는게 좋을듯 곧 지원 끊긴다
