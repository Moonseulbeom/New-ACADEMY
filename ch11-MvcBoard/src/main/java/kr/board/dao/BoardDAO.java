package kr.board.dao;

import kr.board.vo.BoardVO;

//DAO : Data Access Object
public class BoardDAO {
	//싱글턴 패턴
	private static BoardDAO instance = new BoardDAO();
	public static BoardDAO getInstance() {
		return instance;
	}
	private BoardDAO() {}
	
	//글 저장
	public void insert(BoardVO boardVO) throws Exception{
		
		
	}
	//글의 총 갯수
	//글 목록
	//글 상세
	//글 수정
	//글 삭제
	
	
	
}
