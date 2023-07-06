package kr.spring.ch19;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
	public static void main(String[] args) {
		//컨테이너 생성
		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext(
						"applicationContext_scan.xml");
		
		//@Component 어노테이션을 이용한 빈 객체 생성
		HomeController home = 
				(HomeController)context.getBean(
						"homeController");
		System.out.println(home);
		
		//자원 정리
		context.close();
		
		/*
		 * 컨테이너에 객체를 생성하고 관리 
		 * 1.설정파일 xml
		 * 2.어노테이션 
		 * 3.자바 코드 기반 설정
		 * (어노테이션 + 자바 코드)
		 * - 스프링 부트에선 써야됨(설정파일이 없음)
		 */
	}
}
