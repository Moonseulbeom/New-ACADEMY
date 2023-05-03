package kr.s03.method;

public class MethodArgMain03 {//method 분류(3)
	//인자 전달방식 : Variable Arguments(가변인자_인자의 개수가 막 변함_jdk5.0이상부터 사용가능)
	//*(전제조건_자료형은 고정_int면 정수만) 자료형은 일치할 때 전달하고자 하는 값의 개수를 다르게 저장할 수 있다.
	//전달되는 데이터는 내부적으로 배열로 인식함
	
	public void argTest(int ... n) {//n은 내부적으로 배열
		for(int i=0;i<n.length;i++) {
			System.out.println("n["+i+"]:" + n[i]);
		}
		System.out.println("----------------------");
	
	}

	public static void main(String[] args) {
//		argTest(10);//메모리 안올라간거(객체 생성해야함)
//		ma.argTest(10,20,30,"서울");//자료형이 일치하지 않아서 오류남
		//객체의 인자의 개수가 맞아야함
		//객체 선언 및 생성
		MethodArgMain03 ma = new MethodArgMain03();
		ma.argTest();//배열은 만들어졌는데 데이터가 없어서 length는 0
		ma.argTest(10);
		ma.argTest(10,20);
		ma.argTest(10,20,30);
		
	}
}
