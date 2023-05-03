package kr.s20.util;
//Date -> 연월일시분초 다 필요할떄
//Calendar -> 연월일시분초 중에서 몇개만 필요할 때 ex)달력

import java.util.Calendar;

public class CalendarMain01 {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		System.out.println(today);//GregorianCalendar은 Calendar 자식
		
		int year = today.get(Calendar.YEAR);//상수_static한 식별자??//년도
		int month = today.get(Calendar.MONTH)+1;//월 0~11(2로 출력되서 +1함)
		int date = today.get(Calendar.DATE);//일
		
		System.out.printf("%d년%d월%d일 ",year,month,date);
		
		int day = today.get(Calendar.DAY_OF_WEEK);//요일 1~7(일 ~ 토)
		
		String nday = null;
		switch(day) {//한글화
		case 1: nday = "일";break;
		case 2: nday = "월";break;
		case 3: nday = "화";break;
		case 4: nday = "수";break;
		case 5: nday = "목";break;
		case 6: nday = "금";break;
		case 7: nday = "토";break;
		}
		System.out.printf("%s요일", nday);

		//오전 0, 오후 1
		int amPm = today.get(Calendar.AM_PM);
						//조건				참값		거짓값 <- 삼항연산자
		String str = amPm == Calendar.AM ? "오전" : "오후";
		
		//시 HOUR_OF_DAY(24시 표기)
		int hour = today.get(Calendar.HOUR);
		//분
		int min = today.get(Calendar.MINUTE);
		//초
		int sec = today.get(Calendar.SECOND);
		
		System.out.printf(" %s %d시%d분%d초", str, hour, min, sec);
		
	}//main
	
}//end of public class
