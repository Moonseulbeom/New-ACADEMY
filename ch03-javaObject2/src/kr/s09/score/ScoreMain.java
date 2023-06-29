package kr.s09.score;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ScoreMain {
	/*
	 * [실습]
	 * ArrayList에 Score 저장하는 프로그램
	 * 메뉴 : 1.성적입력,2.성적출력,3.종료
	 * 조건체크 : 성적 유효 범위 체크
	 * 			0~100의 값만 인정!!
	 * 
	 */
	
	BufferedReader br;//private 생략한거
	ArrayList<Score> list;//제네릭 표현,private 생략
	//2차배열효과
	
	//생성자
	public ScoreMain() {
		list = new ArrayList<Score>();//ArrayList 객체생성
		try {
			br = new BufferedReader(new InputStreamReader(System.in));//생성자 안에서 BufferedReader 생성
			callMenu();
		}catch(IOException e) {
			e.printStackTrace();//예외문구 출력
		}catch(Exception e) {
			e.printStackTrace();//예외문구를 출력
		}finally {
			//자원정리(반복적으로 쓴다)
			if(br!=null)try {br.close();}catch(IOException e) {}
		}//try catch finally 구조
		
	}//end of public ScoreMain()
	
	//메뉴(메뉴 중심의 프로그램 제작)
	public void callMenu() throws IOException{
		
			try {
				while(true) {
					System.out.print("1.성적입력,2.성적출력,3.종료>");
					int num = Integer.parseInt(br.readLine());
					if(num == 1) {
						inputScore();
					}else if(num == 2) {
						printScore();
					}else if(num == 3) {
						System.out.println("프로그램 종료");
						break;
					}else {
						System.out.println("잘못 입력했습니다.");
					}
				}
			}catch(NumberFormatException e) {//Integer.parseInt에서 오류날지도
			System.out.println("숫자만 입력하세요!");
			}
		}//end of while
	//end of public void callMenu()throws IOException
	
	
	
	//성적입력
	public void inputScore ()throws IOException{
		Score s = new Score();
		
		System.out.println("이름:");
		s.setName(br.readLine());
		s.setKorean(parseInputData("국어:"));
		s.setEnglish(parseInputData("영어:"));
		s.setMath(parseInputData("수학:"));

		//ArrayList에 Score를 저장
		list.add(s);
	}
	
	//성적 출력
	public void printScore() {
		System.out.println("--------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t등급");
		System.out.println("--------------------------------");
		
		for(Score s : list) {
			System.out.print(s.getName()+"\t");
			System.out.print(s.getKorean()+"\t");
			System.out.print(s.getEnglish()+"\t");
			System.out.print(s.getMath()+"\t");
			System.out.print(s.makeSum()+"\t");
			System.out.printf("%.2f\t", s.makeAvg());
			System.out.print(s.makeGrade()+"\n");
			}
		}
	
	//성적 입력 조건 체크
	public int parseInputData(String course) throws IOException {
		while(true) {
			System.out.println(course);//과목 표시
			try {
				int num = Integer.parseInt(br.readLine());
				
				//성적 유효 범위(0~100) 체크
				if(num<0 || num>100) {
					throw new ScoreValueException("0~100의 값만 인정!!");
				}
				return num;
			}catch(NumberFormatException e) {
				System.out.println("숫자만 입력 가능");
			}catch(ScoreValueException e) {
				System.out.println(e.getMessage());//"0~100의 값만 인정!!" 얘가 나옴
			}
		}//end of while
	}//end of public int parseInputData(String course) throws IOException
		
	public static void main(String[] args) {
		new ScoreMain();
	}//end of main
}//end of p.c
