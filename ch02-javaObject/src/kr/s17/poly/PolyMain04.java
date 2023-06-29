package kr.s17.poly;//여러문법 사용
//매서드 오버로딩의 한계_한정적이다
//부모클래스
class Product{
	int price;//제품가격
	int bonusPoint;//제품 구매시 제공되는 보너스 점수
	//생성자_기본 생성자가 없음
	public Product(int price) {
		this.price = price;
		bonusPoint = price/10;
	}
	public String getName() {//class마다 재정의
		return "상품";
	}
}//class Product

class Tv extends Product{
	public Tv() {
		//부모클래스의 인자가 있는 생성자 호출
		super(100);
	}
	//메서드 오버라이딩(부모클래스의 메서드를 재정의)
	@Override
	public String getName() {
		return "Tv";
	}
}//class Tv extends Product

class Computer extends Product{
	public Computer() {
		//부모클래스의 인자가 있는 생성자 호출
		super(200);
	}
	//메서드 오버라이딩(부모클래스의 메서드를 재정의)
		@Override
		public String getName() {
			return "Computer";
		}
}//class Computer extends Product

class Audio extends Product{
	public Audio() {
		//부모클래스의 인자가 있는 생성자 호출
		super(300);
	}
	//메서드 오버라이딩(부모클래스의 메서드를 재정의)
		@Override
		public String getName() {
			return "Audio";
		}
}//class Audio extends Product

class Buyer{
	private int money = 1000;//구매자 보유 금액
	private int bonusPoint = 0;//보너스 점수
	
	public void buy(Product p) {//제품의 공통타입(Product) 지정_제품 구매할수있도록
//타입이 Tv라 tv만 전달받음->Object로 형변환_이또한 확장성의 문제발생_그냥 부모(Product) 정해주고 상속
//재정의하면 자료형변환 안하고 자식메서드 호출 가능_제품 많아지면 다운캐스팅 힘듦_재정의가 편함
//class마다 메서드 넣기 힘들다
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;//차감
		bonusPoint += p.bonusPoint;//누적
		
		System.out.println(p.getName() + "을(를) 구입하셨습니다.");
		System.out.println("현재 남은 돈은 " + money + "만원입니다.");
		System.out.println("현재 보너스점수는 " + bonusPoint + "점입니다.");
	}
}//class Buyer

public class PolyMain04 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		Tv tv = new Tv();
		Audio au = new Audio();
		Computer com = new Computer();
		
		//구매자가 Tv를 구매
		b.buy(tv);//Tv -> Product로 형변환
		//구매자가 Computer를 구매
		b.buy(com);//Computer -> Product로 형변환
		//구매자가 Audio를 구매
		b.buy(au);//Audio -> Product로 형변환
	
	}//main
	
}//public class PolyMain04
