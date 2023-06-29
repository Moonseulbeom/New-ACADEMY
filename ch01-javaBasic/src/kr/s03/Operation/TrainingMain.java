package kr.s03.Operation;

public class TrainingMain {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 생년월일을 입력하고 만 나이를 출력하는 프로그램을 작성하시오.
		 * 만나이 = (현재 연도 - 태어난 연도) - (생일이 지났으면 0, 생일이 지나지 않아으면 1)
		 * 
		 * [입력 예시]
		 * 출생연도 입력: 2000
		 * 월 입력:3
		 * 일 입력:12
		 * 
		 * [출력 예시]
		 * 만 나이는 22
		 * 
		 */
		//현재 날짜 정보
		int thisyear = 2023;
		int thisMonth = 3;
		int thisDate = 21;
		
		java.util.Scanner input =
			new java.util.Scanner(System.in);
		
		System.out.print("출생연도 입력:");
		int year = input.nextInt();
		System.out.print("월 입력:");
		int month = input.nextInt();
		System.out.print("일 입력:");
		int date = input.nextInt();
		
		int age= thisyear-year;
		
		if(month>thisMonth) {
			age--;
		}else if(thisMonth==month && date>thisDate) {
			age--;}

		System.out.printf("만 나이는 %d입니다.", age);		
		input.close();
	}
}		
		//내가 한거 안됨/수정
/*
		java.util.Scanner input =
				new java.util.Scanner(System.in);
		System.out.print("연도 입력:");
		int year = input.nextInt();
		
		System.out.print("월 입력:");
		int month = input.nextInt();
		
		System.out.print("일 입력:");
		int date = input.nextInt();
		
		//현재 연도와 태어난 연도 연산(조건을 줄이려고 연산)
		int age = thisyear - year;
		
		//현재 월과 태어난 월을 비교
		if(thisMonth < month) {//예 10 < 11
			age--;//age-=1
		}else if(thisMonth==month && thisDate < date) {
			//현재 월과 태어난 월이 같으면 일 비교
			//예 6 < 30
			age--;//age-=1
		}
		//생일이 지난 경우이기 떄문에 age의 변동이 없음. 그래서 else는 명시할 필요가 없음
		/*else {
		}
		
		System.out.printf("만 나이는 %d세%n",age);
		//강사님이 한거
*/

