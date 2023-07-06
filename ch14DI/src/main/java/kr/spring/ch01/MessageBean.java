package kr.spring.ch01;

public class MessageBean {
	public void sayHello(String name) {
		System.out.println("Hello, " + name + "!");
	}
}

//원래 java 문법
//MessageBean bean = new MessageBean();
//bean.sayHello("홍길동");

//컨테이너 안에 객체를 넣으면 스프링 프레임워크의 여러 기능들을 가질수 있게됨
//src/main/java -> 원본소스 , src/main/resources -> 설정 파일