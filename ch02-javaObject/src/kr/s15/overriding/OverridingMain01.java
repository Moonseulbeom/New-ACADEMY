package kr.s15.overriding;//오버라이딩_리모델링<->오버로딩_재정의

//부모클래스
class GrandParent{
	public String getCar() {//상속을 여러곳에 시킬수 있음
		return "구형 자동차";
	}
}
//자식클래스
class Father extends GrandParent{
	
	/*
	 * Method Overriding(메서드 재정의)
	 * 상속관계일 때 부모클래스의 메서드를 자식클래스에서 재정의
	 */
	
	/*
	 * @Override : 어노테이션은 메서드 재정의 문법에 맞게 재정의가 되었는지를 검증(권장사항), 
	 * 문법에 맞게 재정의 되지 않으면 컴파일 오류가 발생(특별한 의미를 가지는 주석) 오버라이딩 할때 그냥 달아주기
	 */
	@Override
	
	public String getCar() {//매서드명 달라져도 컴파일시 오류는 안나는데, 데이터 수정이 안됨
		return "신형 자동차";//데이터만 달라짐 메서드 오버라이딩(재정의)
	}
}
//자식클래스
class Oncle extends GrandParent{
	//GrandParent의 getCar() 사용
	}

public class OverridingMain01 {
	public static void main(String[] args) {
		Father ft = new Father();
		System.out.println(ft.getCar());
		System.out.println("---------------");
		
		Oncle oc = new Oncle();
		System.out.println(oc.getCar());
	
	}
}

/*
상속 받고
아부지가 자동차 상속(30년됨)
불만가득한 불효자_리모델링 하고싶음(그대로 안쓰고)
상속받은거 오리지널로 안타도 된다(안써도 된다_재정의)
*/
