package kr.spring.ch20;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//자바 코드 기반 설정
@Configuration
public class SpringConfig {
	
	//@Bean 어노테이션을 명시함으로써 bean 객체 설정
	//@Bean("빈이름")이와 같이 빈이름을 지정할 수 있음
	@Bean
	//메서드명이 빈의 이름이 됨
	public Worker worker() {
		return new Worker();
	}
	
	@Bean
	public Executor executor() {
		return new Executor();
	}
	
}


