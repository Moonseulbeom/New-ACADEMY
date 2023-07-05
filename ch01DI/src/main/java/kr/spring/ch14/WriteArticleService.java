package kr.spring.ch14;

public class WriteArticleService {
	//프로퍼티(이거랑 applicationContext3의 bean이랑 이름이 같아야함)
	private WriteArticleDAO writeArticleDAO;

	public void setWriteArticleDAO(WriteArticleDAO writeArticleDAO) {
		this.writeArticleDAO = writeArticleDAO;
	}

	public void write() {
		System.out.println("WriteArticleService의 write()메서드 호출");
		writeArticleDAO.insert();
	}
	
}
