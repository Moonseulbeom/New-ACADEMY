package kr.spring.ch16;

import org.springframework.beans.factory.annotation.Autowired;

public class SystemMonitor {
   //프로퍼티
   private int periodTime;
   private SmsSender sender;
   
   public int getPeriodTime() {
      return periodTime;
   }
   public void setPeriodTime(int periodTime) {
      this.periodTime = periodTime;
   }
   public SmsSender getSender() {
      return sender;
   }
   /*
      autowired는 생성자, 필드, 메서드에 지정가능
      메서드에 지정할 때 setXXX 뿐만 아니라 일반 메서드에도 적용 가능
      
      @Autowired 어노테이션은 타입을 이용해서 자동적으로 프로퍼티 값을 설정하기 때문에,
      해당 타입의 빈 객체가 존재하지 않거나 또는 빈 객체가 두 개 이상 존재할 경우
      스프링은 @Autowired 어노테이션이 적용된 빈 객체를 생성할 때 예외가 발생
      
      @Autowired(required=false)로 지정하면 해당 타입의 빈 객체가
      존재하지 않더라도 스프링은 예외가 발생하지 않음
      기본값은 @Autowired(required=true)
   */
   @Autowired
   public void setSender(SmsSender sender) {
      this.sender = sender;
   }
   
}