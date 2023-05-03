package kr.s17.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class URLMain02 {
	public static void main(String[] args) {
		String address = "https://www.naver.com/index.html";//http + 보안강화 -> https
		BufferedReader input = null;
		String line;
		
		try {
			URL url = new URL(address);
			//openStream : URL에 저장된 인터넷 주소를
			//				이용해서 서버에 HTML 데이터를
			//				InputStream 타입으로 반환
			input = new BufferedReader(new InputStreamReader(url.openStream()));//네트워크에서 받아서 url.openStream()

			while((line=input.readLine())!=null) {
				System.out.println(line);
			}
			
			
			
		}catch(MalformedURLException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			//자원정리
			if(input!=null)try {input.close();}catch(IOException e) {}
		}
		
		
	}//end of main
	
}//end of p.c
