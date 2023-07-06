package kr.spring.ch13;

import java.util.Properties;

public class BookClient {
	//프로퍼티(map과 유사함)-타입이 문자열로 지정되어있음
	private Properties prop;

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	@Override
	public String toString() {
		return "BookClient [prop=" + prop + "]";
	}
	
	
}
