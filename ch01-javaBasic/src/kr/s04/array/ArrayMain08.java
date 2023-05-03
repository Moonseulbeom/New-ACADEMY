package kr.s04.array;

public class ArrayMain08 {
	//run Configuration_arguments
	//단어끼리 공백으로 구분 ex) 봄 여름 가을 겨울
	//공백까지 하려면 ex)"대한민국 서울" "미국 워싱턴"
	public static void main(String[] args) {
						//문자열,배열	배열명
		if(args.length>0) {
			for(int i=0;i<args.length;i++) {
				System.out.println(i + ":" + args[i]);
			
			}
		}else {//ars.length==0 의미 전달된 데이터가 없음
			System.out.println("입력한 내용이 없습니다.");
			}
		}
	
	
	}
	
