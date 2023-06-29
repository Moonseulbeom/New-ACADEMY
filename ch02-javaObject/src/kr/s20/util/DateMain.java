package kr.s20.util;//기본 패키지가 아님으로 항상 import 해줘야한다

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;



public class DateMain {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		//참조변수 출력하니 toString 자동으로 실행되서 Object에서 재정의
		//연월일시분초가 한국 국룰
		System.out.println("------------------------------");//Wed Mar 29 15:06:16 KST(한국표준시) 2023

		
		//deprecated 되어 사용하지 않음
		System.out.println(now.toLocaleString());
		System.out.println("------------------------------");//2023. 3. 29. 오후 3:21:09
		
		DateFormat df = DateFormat.getInstance();
		String today = df.format(now);
		System.out.println(today);//연도 뒷자리2개만 보통 표시된다
		System.out.println("------------------------------");//23. 3. 29. 오후 3:21

		df = DateFormat.getDateTimeInstance();//(국룰)연 월 일 시 분 초
		today = df.format(now);
		System.out.println(today);
		System.out.println("------------------------------");//2023. 3. 29. 오후 3:21:09

		df = DateFormat.getDateInstance();//연 월 일
		today = df.format(now);
		System.out.println(today);
		System.out.println("------------------------------");//2023. 3. 29.

		df = DateFormat.getTimeInstance();//시 분 초
		today = df.format(now);
		System.out.println(today);
		System.out.println("------------------------------");//오후 3:25:52
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy년MM월dd일 (E) a hh:mm:ss");
		today = sf.format(now);
		System.out.println(today);
		System.out.println("------------------------------");//2023년03월29일 (수) 오후 03:38:37
		//나중에 웹가면 이걸로 표기
		//24시로 하려면 "yyyy년MM월dd일 (E) HH:mm:ss" 요걸로
		
	}//end of main
	
}//end of public class
//원하는 대로 만들기 어렵다(확장성 결여) SimpleDateFormat-원하는 방식으로 표현 가능