package kr.s22.finaltest;//상수 final - 메서드에

//부모클래스
class Me{
	int var = 100;
	//메서드에 final를 지정하면 자식클래스에서
	//메서드 오버라이딩을 할수없음(메서드 확장을 막음)
	public final void setVar(int var) {
		this.var = var;
	}
}

public class FinalMain02 extends Me{
	/*
	@Override
	public void setVar(int var) {
		this.var = var + 100;
	}
	*/
	public static void main(String[] args) {
		
		
		
		
	
	}//end of main
}//end of public class
