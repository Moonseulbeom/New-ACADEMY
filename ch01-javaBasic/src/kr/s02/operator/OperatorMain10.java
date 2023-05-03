package kr.s02.operator;

public class OperatorMain10 {
	public static void main(String[] args) {
	System.out.println("===조건(삼항)연산자===");
	
	int x = 10;
	int y = -10;
	
	//조건(삼항)연산자
				//조건 (?)    	 참값  거짓값
				//조건 (true면)    참값 (얘를 불러옴) 거짓값
				//조건 (false면)   참값  거짓값 (얘를 불러옴)
	int absX = (x >= 0) ? x : -x;//조건:true 참 값 불러옴 (전자)
	int absY = (y >= 0) ? y : -y;//조건:false 거짓 값 불러옴 (후자)
	
	System.out.println("x=10일 때, x의 절대값은 " + absX);
	System.out.println("y=-10일 때, y의 절대값은 " + absY);

	}
	//보통 if문을 쓰긴 하는데, 간간히 쓰더라
}
