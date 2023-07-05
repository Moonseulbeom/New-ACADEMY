package kr.spring.ch20;

import org.springframework.beans.factory.annotation.Autowired;

public class Executor {
	//프로퍼티
	@Autowired
	private Worker worker;

	public void setWorker(Worker worker) {
		this.worker = worker;
	}
	
	public void addUnit() {
		worker.work();
	}
	
}
