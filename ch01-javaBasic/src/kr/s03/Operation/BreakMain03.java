package kr.s03.Operation;

public class BreakMain03 {
	public static void main(String[] args) {
		//브레이크 레이블문
		exit_for://레이블 설정 for라고 정한거 암거나 해도됨
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				if(j==3) {
					//레이블이 지정된 for문 영역을 빠져나감
					break exit_for;//암기 switch, 반복문에서 특정 조건일때 사용
				}
				System.out.println(i + "," + j);
			}
		}//여기까지 다 나가는듯
	}

}
