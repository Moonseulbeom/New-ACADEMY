package kr.s11.array;

class Car{
	//은닉화
	private String color;
	private int speed;
	//캡슐화
	public void setColor(String color) {
		this.color = color;
	}//값을 저장
	public String getColor() {
		return color;
	}//값을 반환
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getSpeed() {
		return speed;
	}
}

public class CarMain {
	public static void main(String[] args) {
		//배열 선언 및 생성
		Car[] carArray = new Car[2];
		
		for(int i=0;i<carArray.length;i++) {
			System.out.println(carArray[i]);
		}
		System.out.println("------------------------");//배열에 초기값만 보여짐_호출할때 에러 안나려구
		
		//Car 객체를 생성해서 배열에 index 0에 저장
		//Car 객체의 주소가 저장됨
		carArray[0] = new Car();
		//배열의 index 0에 저장된 객체의 주소를 이용해서 객체 호출
		carArray[0].setColor("흰색");
		carArray[0].setSpeed(100);

		//Car 객체를 생성해서 배열의 index 1에 저장
		//Car 객체의 주소가 저장됨
		carArray[1] = new Car();
		//배열의 index 1에 저장된 객체의 주소를 이용해서 객체 호출
		carArray[1].setColor("검정색");
		carArray[1].setSpeed(200);
		
		//배열의 요소 출력(전통for문)
		for(int i=0;i<carArray.length;i++) {
			System.out.println(carArray[i]);
		}
		System.out.println("------------------------");//참조값이 나옴,주소가 저장되어 있음 객체로 접근
		
		//배열에 저장된 객체의 주소를 이용해서 객체의 멤버메서드 호출(전통for문)
		for(int i=0;i<carArray.length;i++) {
			System.out.println("carArray["+i+"]:색상 -> " + carArray[i].getColor());
			System.out.println("carArray["+i+"]:스피드 -> " + carArray[i].getSpeed());
		}
		System.out.println("------------------------");

		//확장for문을 이용한 배열의 요소 출력
		for(Car car : carArray) {
			System.out.println("색상: " + car.getColor() + " , " + "스피드: " + car.getSpeed());
		}
		
	}
}

//* 차는 2대, 일차원 배열에 객체 저장해서 이차원 배열 효과 나타냄
//---------------------------------------------
//주소(index0)	|	주소(index1)
//-----------------------------------------------
//	|			|
//	V			V
//	
//---car 객체---		---car 객체---		
//color 흰			color 검
//speed 100		speed 200
//
//<장점_이차원 배열보다>
//자료형 달라도 가능
//메소드 넣어서 관리도 가능

//배열 메모리(heap)
//----------------------------
//주소	주소	주소
//----------------------------
//car 주소
//객체를 만들어서 heap영역에 주소를 참조



