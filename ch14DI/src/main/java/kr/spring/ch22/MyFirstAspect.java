package kr.spring.ch22;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

//공통 기능이 구현되는 클래스
@Aspect
public class MyFirstAspect {
	/*
	 * 구현 가능한 Advice(언제 공통 기능을 핵심 기능에 적용
	 *                 할지 정의) 종류
	 * 종류				      설명
	 * @Before
	 * Before Advice	      대상 객체의 메서드 
	 *                        호출 전에 공통 기능을 
	 *                        실행 
	 * @AfterReturning                       
	 * After Returning Advice 대상 객체의 메서드가
	 *                        예외 없이 실행한 후에
	 *                        공통 기능을 실행 
	 * @AfterThrowing                       
	 * After Throwing Advice  대상 객체의 메서드를
	 *                        실행하는 도중 예외가
	 *                        발생한 경우에 공통 기능
	 *                        을 실행 
	 * @After                       
	 * After Advice			  대상 객체의 메서드를 실행
	 *                        하는 도중 예외가 발생했
	 *                        는지의 여부와 상관없이
	 *                        메서드 실행 후 공통 기능을
	 *                        실행(try~catch~finally
	 *                        의 finally 블럭과 비슷)
	 * @Around                       
	 * Around Advice		  대상 객체의 메서드 실행 전,
	 *                        후 또는 예외 발생 시점에
	 *                        공통 기능을 실행                        
	 *                	                                                                             
	 */
	
	//핵심 기능을 검색해서 지정
	@Pointcut("execution(public String launch())")
	public void getPointcut() {}
	
	//@Before("getPointcut()")
	public void before() {
		//메서드(핵심 기능) 시작 직전에 동작하는 어드바이스
		System.out.println(
			"Hello Before! **메서드가 호출되기 전에 나온다!");
	}
	
	//@AfterReturning(value="getPointcut()",returning="msg")
	public void afterReturning(String msg) {
		//메서드 호출이 예외를 내보내지 않고 종료했을 때
		//동작하는 어드바이스
		System.out.println(
		   "Hello AfterReturning! "
		   + "**메서드가 호출한 후에 나온다! 전달된 객체 :" 
		   + msg);
	}
	
	//@AfterThrowing(value="getPointcut()",throwing="ex")
	public void afterThrowing(Exception ex) {
		//메서드 호출이 예외를 던졌을 때 동작하는 어드바이스
		System.out.println(
		"Hello AfterThrowing! **예외가 생기면 나온다! 예외 : " + ex);
	}
	
	//@After("getPointcut()")
	public void after() {
		//메서드 종료 후에 동작하는 어드바이스
		//(예외가 발생해도 실행됨)
		System.out.println(
			"Hello After! **메서드가 호출된 후에 나온다.");
	}
	
	//반환 타입을 지정하면 이 기능 후에 실행되는 공통 기능에서 반환하는 데이터를
	//전달 받아서 사용할 수 있음
	@Around("getPointcut()")
	public String around(
			ProceedingJoinPoint joinPoint)
	                            throws Throwable{
		//메서드 호출 전후에 동작하는 어드바이스
		System.out.println(
		"Hello Around before! **메서드가 호출되기 전에 나온다!");
		String s = null;
		
		try {
			//핵심 기능이 수행된 후 데이터 반환
			s = (String)joinPoint.proceed();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println(
			"Hello Around after! **메서드가 호출된 후에 나온다! 반환된 객체 : " + s);
		}
		
		return s;
	}
	
	
}


