package kr.s17.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressMain01 {
	public static void main(String[] args) {
		BufferedReader br = null;
		InetAddress iaddr = null;
		String url = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("도메인명 입력:");
			url = br.readLine();
			
			//InetAddress 객체 생성
			iaddr = InetAddress.getByName(url);//입력한 도메인에 대한 IP주소 구할수 있다
			
			System.out.println("호스트 이름 : " + iaddr.getHostName());//도메인명으로 보여줌
			System.out.println("호스트 IP주소 : " + iaddr.getHostAddress());
			//대표 IP주소? 서버 일반적으로 2개 이상의 IP주소가 지정되어있다
			System.out.println("------------------------------");
								
			//로컬 호스트(개인 PC) IP주소 구하기, 원격 리모트
			iaddr = InetAddress.getLocalHost();
			System.out.println("로컬 호스트 이름 : " + iaddr.getHostName());
			System.out.println("로컬 호스트 IP주소 : " + iaddr.getHostAddress());
			
			
			
			
			
		}catch(UnknownHostException e) {//없는 도메인하면 에러난다(호스트가 없다)
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally {
			if(br!=null)try {br.close();}catch(IOException e) {}
		}
		
	}//end of main
	
}//end of p.c
