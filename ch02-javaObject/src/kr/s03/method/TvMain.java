package kr.s03.method;

class Tv{//객체를 하면 모델링해서 메모리에 올린다
	//Tv의 기능(멤버변수+멤버메서드)
	//메서드 잘만들면 그럴듯 하당,객체는 항상 사용x, 모델과 관련있는 메서드는 다 만들어주자
	//멤버변수 (Tv의 속성)
	boolean power; //전원상태(on/off 기능 부여)_boolean 기본값 false
	int channel;//int 채널_기본값 0
	
	//멤버메서드(Tv의 동작)
	public void isPower() {//Tv를 켜거나 끄는 기능
		power = !power;
	}
	public void channelUp() {//Tv의 채널을 높이는 기능
		++channel;
	}
	public void channelDown() {//Tv의 채널을 낮추는 기능
		--channel;
	}
}

public class TvMain {
	//java에서 지원하는 기능: .java 안에서 class (도면) 추가로 더 만들기 가능
	//규칙이 있다 주 클래스만 public 사용가능, class 하나 추가할땐 public 사용불가
	//따로 컴파일 됨

	public static void main(String[] args) {//클래스 실행하려면 main함수 있어야한다
		//객체 선언 및 생성
		Tv t = new Tv();
		t.isPower();//false -> true
		System.out.println("Tv 실행 여부 : " + t.power);
		System.out.println("현재 채널 : " + t.channel);
		System.out.println("-------------------------");
		
		t.channel = 7;//채널 변경_직접입력
		System.out.println("첫번째 변경된 채널 : " + t.channel);
		System.out.println("-------------------------");
		
		t.channelDown();//메서드 불러온거 -- : -1 감소
		System.out.println("두번째 변경된 채널 : " + t.channel);
		System.out.println("-------------------------");

		t.isPower();//true -> false
		System.out.println("Tv 실행 여부 : " + t.power);
		

	}
}
