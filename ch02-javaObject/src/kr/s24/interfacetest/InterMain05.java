package kr.s24.interfacetest;

interface I{//표준화(형식을 일치시켜준다)
	public abstract void play();//연주_내용 없음 정의만 함
}

class Pianist implements I{
	@Override
	public void play() {
		System.out.println("피아노를 연주하다");
	}
}

class Cellist implements I{
	@Override
	public void play() {
		System.out.println("첼로를 연주하다");
	}
}

class Stage {
	public void autoplay(I i) {
		i.play();
	}
}


public class InterMain05 {
	public static void main(String[] args) {
		Stage st = new Stage();
		st.autoplay(new Pianist());//Pianist->I
		st.autoplay(new Cellist());//Cellist->I
								   //자료형 변환?
	}//end of main
	
}//end of p.c

/*
피아니스트 첼리스트 연주 무대위에서
피아니스트 타입
첼리스트 타입
타입이 다르니 무대가 2개(확장성 떨어짐) -> 무대는 하나로
공통의 부모(object)를 가질수 없는 환경 -> interface가 공통의 부모 역할(추상메서드만 만들면됨)
*/