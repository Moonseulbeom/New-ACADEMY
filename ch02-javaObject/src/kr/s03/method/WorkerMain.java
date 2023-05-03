package kr.s03.method;

class Worker{
	String name;
	int money;//기본값 0
	int balance;//기본값 0
	
	public void work() {
		money += 1000;
	}
	public void deposite() {
		balance += money;
		money = 0;
	}
}
public class WorkerMain {
	/*
	 * [실습]
	 * Worker(회사원)
	 * 1)멤버변수: 직원 이름(name_String),급여(money_int),계좌 잔고(balance_int)
	 * 2)멤버메서드: work(실행하면 money에 1000원 누적_return없으니 void형 메서드 사용)
	 * deposite(실행하면 money의 돈을 balance에 누적시키고 money는 0으로 처리)
	 * 
	 * WorkerMain의 main
	 * 1)Worker 객체 생성
	 * 2)직원의 이름 지정
	 * 3)10번 일하는데(반복문 10번 돌리기) 번 돈이 3000원일 때마다(조건체크) 계좌에 저축(deposite호출)
	 * 4)직원이름, 현재 계좌에 입금되지 않고 남아 있는 급여(money), 계좌 잔고(balance)를 출력하시오.
	 * 
	 */
	public static void main(String[] args) {
		//객체 선언 및 생성
		Worker worker = new Worker();
		worker.name = "홍길동";
		
		//10번 일하는데 번 돈이 3000원일떄마다 저축
		for(int i=1;i<=10;i++) {
			worker.work();
			if(worker.money>=3000) {//3000원 일때마다 저축
				worker.deposite();
			}
		}
		
		System.out.println("직원이름 : " + worker.name);
		System.out.printf("현재 입금되지 않고 남아 있는 급여 : %d%n", worker.money);
		System.out.printf("계좌 잔고 : %d%n", worker.balance);
	}
}
