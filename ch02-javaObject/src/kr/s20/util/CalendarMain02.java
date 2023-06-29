package kr.s20.util;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarMain02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//현재 날짜와 시간을 구함(2023년 3월 29일의 정보가 들어가있음_보고싶은 날짜로 세팅을 해야함)
		Calendar cal = Calendar.getInstance();
		System.out.println("희망 연도와 월을 입력하세요!!(ex 연도:2023, 월:3)");
		
		System.out.print("연도:");
		int year = input.nextInt();
		System.out.print("월:");
		int month = input.nextInt();
		
		System.out.println("	[" + year + "년 " + month + "월]");
		System.out.println("==========================");
		System.out.println("  일  월 화  수 목  금  토");
		
		//희망 연도,월,일을 셋팅
		//월의 범위는 0~11이기 때문에 입력월-1,
		//일은 달력이 1일부터 시작하기 때문에 1일로 셋팅
		cal.set(year, month-1, 1);
		
		//1일의 요일
		int week = cal.get(Calendar.DAY_OF_WEEK);//지금은4
		//마지막 날짜
		int lastOfDate = cal.getActualMaximum(Calendar.DATE);
		
		//1일 전 공백 만들기
		for(int i=1;i<week;i++) {
							 //자릿수	공백
			System.out.printf("%3s", " ");
		}
		
		//1~마지막날까지 반복
		for(int i=1;i<=lastOfDate;i++) {
			System.out.printf("%3d", i);
			if(week%7==0) {//토요일_week가 체크해줌
				System.out.println();//줄바꿈
			}
			week++;
		}
		System.out.println("\n==========================");
		
		input.close();
	}//end of main
}//end of public class

//Calendar가 정보를 줘서 코드가 그나마 좀 간단