package kr.s21.abs;
//추상클래스끼리 상속? AbstractMain04로~
//추상클래스
abstract class Animal{
	public void breathe() {//일반 메서드_자식class에서 울음소리 변경/의무만?/가이드가 가능하니 기본값 지정
		System.out.println("숨을 쉬다");
	}
	//추상메서드
	public abstract void sound();//동물마다 다르니 기본값이 의미가 x,자식클래스에서 구현해라
	
}//end of abstract class Animal
//자식클래스
class Dog extends Animal{
	//부모클래스의 추상메서드를 반드시 구현해야 함
	@Override
	public void sound() {
		System.out.println("개는 멍멍멍~~");
	}
}

class Cat extends Animal{
	//부모클래스의 추상메서드를 반드시 구현해야 함
	@Override
	public void sound() {
		System.out.println("고양이는 야옹!!");
	}
}

public class AbstractMain03 {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.breathe();
		d.sound();
		System.out.println("-----------");
		
		Cat c = new Cat();
		c.breathe();
		c.sound();
		
		
		
	
	}//end of main
	
}//end of public class
