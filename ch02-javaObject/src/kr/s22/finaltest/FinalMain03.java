package kr.s22.finaltest;//상수 final - 클래스에

//클래스에 final를 명시하면 상속 불허
final class Me1{
	int var = 100;
	public int getVar() {
		return var;
	}
}

//public class FinalMain03 extends Me1{} -> class에 final 붙여서 오류남
public class FinalMain03{
	public static void main(String[] args) {
		
	
	}//end of main
	
}//end of public class
