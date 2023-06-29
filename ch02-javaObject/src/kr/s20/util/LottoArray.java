package kr.s20.util;
//없애는 과정 - 새로운 루프 - 배열에 넣어주기 - 넣은 숫자랑 기존 숫자랑 비교하기
//숫자를 오름차순으로 정렬
import java.util.Arrays;//오름차순 정렬
import java.util.Random;//난수 발생

public class LottoArray {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 로또프로그램 제작
		 * 배열을 생성하고
		 * 1~45 숫자 중 중복되지 않은(조건체크) 6개 숫자를 생성
		 * 해서 배열에 저장
		 * 난수 발생 : Math.random(), Random 클래스 둘 중 하나 사용
		 */
		//로또 번호를 저장할 배열 생성
		int[] lotto = new int[6];//방이 6개

		Random random = new Random();
		
		for(int i=0;i<lotto.length;i++) {
						//1~45
			lotto[i] = random.nextInt(45)+1;//1번
			
			//중복된 숫자가 있는지 검증
			for(int j=0;j<i;j++) {
				if(lotto[i] == lotto[j]) {
				//1번에서 만들어진 숫자를 index 0부터 i전까지 루프를 돌면서 대조
				i--;
				//i -=1;//중복되면 1번에서 만든 숫자를 불허,i를 하나
					 	//줄어들게 함으로써 루프 돌때 새 숫자로 덮어씌움
				break;
				}
			
			}//end of 확장for(j)
			
		}//end of for(i)
		
		//오름차순(작은 수가 앞에)으로 정렬_import java.util.Arrays; class 위에 
		Arrays.sort(lotto);
		//배열의 요소 출력
		for(int num : lotto) {
			System.out.print(num + "\t");
		}
		
	}//end of main
	
}//end of public class
