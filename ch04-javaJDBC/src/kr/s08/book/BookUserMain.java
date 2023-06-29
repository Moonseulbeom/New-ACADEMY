package kr.s08.book;//사용자  프로그램

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BookUserMain {
	private BufferedReader br;
	private BookDAO dao;
	private int me_num;//회원 번호
	private boolean flag;//로그인 여부(로그인 true, 미로그인 false)
	
	public BookUserMain() {
		try {
			dao = new BookDAO();
			br = new BufferedReader(new InputStreamReader(System.in));
			callMenu();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(Exception e){
				
		}finally {
			if(br!=null)try {br.close();}catch(IOException e) {}
		}
	}//end of BookUserMain
	
	public void callMenu()throws IOException{
		while(true) {					//2,3,4 다 목록
			System.out.print("1.로그인,2.회원가입,3.종료>");
			try {
				int no = Integer.parseInt(br.readLine());
				
				if(no==1) {//로그인
					System.out.print("아이디:");
					String me_id = br.readLine();
					
					System.out.print("비밀번호:");
					String me_passwd = br.readLine();
					
					me_num = dao.loginCheck(me_id, me_passwd);//me_num에 회원번호 담겨있음
					
					if(me_num>0) {
						System.out.println(me_id + "님 로그인 되었습니다.");
						flag = true;
						break;
					}//else 필요 x,단일문 진행
					System.out.println("아이디 또는 비밀번호 불일치");
					
				}else if(no==2) {//회원가입
					System.out.print("아이디:");
					String me_id = br.readLine();
					System.out.print("비밀번호:");
					String me_passwd = br.readLine();
					System.out.print("이름:");
					String me_name = br.readLine();
					System.out.print("전화번호:");
					String me_phone = br.readLine();

					//ScoreDAO의 insertInfo()메서드 호출
					dao.insertMemberInfo(me_id, me_passwd, me_name, me_phone);
				}else if(no==3) {//종료
					System.out.println("프로그램 종료");
					break;
				}else {
					System.out.println("잘못 입력했습니다.");
				}
			}catch(NumberFormatException e) {
				System.out.println("숫자만 입력 가능!!");
			}
		}//end of while
		
		//로그인했을 때 메뉴
		while(flag) {
			System.out.print("1.도서대출,2.MY대출목록,3.대출도서 반납,4.종료>");
			try {
				int no = Integer.parseInt(br.readLine());
				if(no==1) {//도서대출
					//도서 목록
					dao.selectBookInfo();
					
					System.out.print("도서번호:");
					int bk_num = Integer.parseInt(br.readLine());
					
					int re_status = dao.checkStatus(bk_num);//여부를 파악
					if (re_status==1) {
						System.out.println("대여불가");
					}else {
						dao.insertReservation(bk_num, me_num);
					}
				}else if(no==2) {//MY대출목록
					dao.UserReservation(me_num);
				}else if(no==3) {//대출도서 반납
					System.out.print("예약번호:");
					int re_num = Integer.parseInt(br.readLine());
					
					int re_status = dao.checkReturn(re_num, me_num);//여부를 파악
					if (re_status==1) {
						System.out.print("도서번호:");
						int bk_num = Integer.parseInt(br.readLine());
						dao.updateReservation(re_num, bk_num, me_num, null, null);
					}else {
						System.out.println("반납불가");
					}
				}else if(no==4) {//종료
					System.out.println("프로그램 종료");
					break;
				}else {
					System.out.println("잘못 입력했습니다.");
				}
			}catch(NumberFormatException e) {
				System.out.println("숫자만 입력 가능!!");
			}
		}//end of while(로그인)
		
	}//end of callMenu
	
	public static void main(String[] args) {
		new BookUserMain();
	}//end of main
	
}//end of p.c BookUserMain
