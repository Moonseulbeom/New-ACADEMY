package kr.s08.book;//관리자  프로그램

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BookAdminMain {
	private BufferedReader br;
	private BookDAO dao;
	
	public BookAdminMain() {
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
	}//end of BookAdminMain
	
	public void callMenu()throws IOException{
		while(true) {					//2,3,4 다 목록
			System.out.print("1.도서등록,2.도서목록,3.대출목록,4.회원목록,5.종료>");
			try {
				int no = Integer.parseInt(br.readLine());
				
				if(no==1) {//도서등록
					System.out.print("제목:");
					String bk_name = br.readLine();
					System.out.print("카테고리:");
					String bk_category = br.readLine();
					
					//BookDAO의 insertInfo()메서드 호출
					dao.insertBook(bk_name, bk_category);
				}else if(no==2) {//도서목록
					dao.selectBookInfo();
				}else if(no==3) {//대출목록
					dao.AdminReservation();
				}else if(no==4) {//회원목록
					dao.selectMemberInfo();
				}else if(no==5) {//종료
					System.out.println("프로그램 종료");
					break;
				}else {
					System.out.println("잘못 입력했습니다.");
				}
			}catch(NumberFormatException e) {
				System.out.println("숫자만 입력 가능!!");
			}
		}//end of while
		
	}//end of callMenu
	
	public static void main(String[] args) {
		new BookAdminMain();
	}//end of main
	
}//end of p.c BookAdminMain
