package kr.s17.network;
//URL로 서버 접근 HTML정보를 화면에 출력


import java.net.MalformedURLException;//형식에 안맞으면 에러남
import java.net.URL;

public class URLMain {
	public static void main(String[] args) {
		
		try {
			URL url = new URL("http://java.sun.com/index.jsp?name=kim#content");
			System.out.println("프로토콜 : " + url.getProtocol());
			System.out.println("호스트 : " + url.getHost());
			System.out.println("기본포트 : " + url.getDefaultPort());//프로토콜을 보고 알아낸거
			System.out.println("포트 : " + url.getPort());//입력된 포트를 보여주는거,없어서 -1
			System.out.println("패스 : " + url.getPath());//포트없어서 /까지 딸려옴
			System.out.println("쿼리 : " + url.getQuery());
			System.out.println("ref : " + url.getRef());//페이지 내의 특정위치

		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
	}//end of main
	
}//end of p.c
