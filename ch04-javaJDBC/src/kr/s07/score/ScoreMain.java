package kr.s07.score;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScoreMain {
	private BufferedReader br;
	private ScoreDAO dao;
	
	public ScoreMain() {
		try {
			dao = new ScoreDAO();
			br = new BufferedReader(new InputStreamReader(System.in));
			
			callMenu();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원정리
			if(br!=null)try {br.close();}catch(IOException e) {}
		}
		
	}
	//메뉴
	public void callMenu()throws IOException{
		while(true) {
			System.out.print(
					"1.입력,2.목록,3.상세정보,4.수정,5.삭제,6.종료>");
			try {
				int no = Integer.parseInt(br.readLine());
				
				if(no==1) {//입력
					System.out.print("이름:");
					String name = br.readLine();
					int korean = parseInputData("국어:");
					int english = parseInputData("영어:");
					int math = parseInputData("수학:");
					
					int sum = makeSum(korean, english, math);
					int avg = makeAvg(sum);
					String grade = makeGrade(avg);

					//ScoreDAO의 insertInfo()메서드 호출
					dao.insertInfo(name, korean, english, math, sum, avg, grade);
					
				}else if(no==2) {//목록
					dao.selectInfo();
				}else if(no==3) {//상세정보
					//목록
					dao.selectInfo();
					
					System.out.print("성적 번호:");
					int num = Integer.parseInt(br.readLine());
					dao.selectDetailInfo(num);
				}else if(no==4) {//수정
					//목록 보기
					dao.selectInfo();
					
					System.out.print("수정할 성적 번호:");
					int num = Integer.parseInt(br.readLine());
					//글상세 보기
					dao.selectDetailInfo(num);
					System.out.println("---------------------");
					
					System.out.print("이름:");
					String name = br.readLine();
					int korean = parseInputData("국어:");
					int english = parseInputData("영어:");
					int math = parseInputData("수학:");
					
					int sum = makeSum(korean, english, math);
					int avg = makeAvg(sum);
					String grade = makeGrade(avg);

					//수정할 때는 num값이 있어야함
					dao.updateInfo(num, name, korean, english, math, sum, avg, grade);
					
				}else if(no==5) {//삭제
					//목록 보기
					dao.selectInfo();
					
					System.out.print("삭제할 성적 번호:");
					int num = Integer.parseInt(br.readLine());
					
					dao.deleteInfo(num);
				}else if(no==6) {//종료
					System.out.println("프로그램 종료");
					break;
				}else {
					System.out.println("잘못 입력했습니다.");
				}
				
			}catch(NumberFormatException e) {
				System.out.println("숫자만 입력 가능!!");
			}
		}
	}
	
//두번 이상 쓰이니까 공용 메서드를 만들어서 쓰자	
	//총점 구하기
	public int makeSum(int korean,int english,int math) {
		return korean + english + math;
	}
	//평균 구하기
	public int makeAvg(int sum) {
		return sum/3;
	}
	//등급 구하기
	public String makeGrade(int avg) {
		String grade;
		switch(avg/10) {
		case 10:
		case 9: grade = "A";break;
		case 8: grade = "B";break;
		case 7: grade = "C";break;
		case 6: grade = "D";break;
		default: grade = "F";
		}return grade;
	}
	
	//성적 범위 체크(0~100)
	public int parseInputData(String course)throws IOException{
		while(true) {
			System.out.print(course);
			try {
				int num = Integer.parseInt(br.readLine());
				if(num<0 || num>100)//{}생략-단일문장
					throw new ScoreValueException("0부터 100사이의 값만 인정!!");
				return num;
			}catch(NumberFormatException e) {
				System.out.println("숫자만 입력하세요!!");
			}catch(ScoreValueException e) {
				System.out.println(e.getMessage());
			}
		}//end of while
	}
	
	public static void main(String[] args) {
		new ScoreMain();
	}//end of main
}

//테이블을 어떻게 구성할 것인가
//기본틀은 동일 - 내일 오후에 3~6까지 톰캣?