package kr.spring.ch01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {//요청에 의해 동작되는 클래스다
	
	//요청URL과 실행 메서드 연결
	@RequestMapping("/hello.do")
	public ModelAndView hello(){
		ModelAndView mav = new ModelAndView();
		//뷰 이름 지정
		mav.setViewName("hello"); // /WEB-INF/views/hello.jsp 뷰리솔버에 다 적혀 있어서 파일명만 입력하면 된다.
		//뷰에서 사용할 데이터 셋팅
		mav.addObject("greeting","안녕하세요");
		return mav;
	}
}
