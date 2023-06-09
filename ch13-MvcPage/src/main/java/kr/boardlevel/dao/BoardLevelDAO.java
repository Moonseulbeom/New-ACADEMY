package kr.boardlevel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import kr.boardlevel.vo.BoardLevelVO;
import kr.util.DBUtil;
import kr.util.StringUtil;

public class BoardLevelDAO {
	//싱글턴 패턴
	private static BoardLevelDAO instance = new BoardLevelDAO();
	public static BoardLevelDAO getInstance() {
		return instance;
	}
	private BoardLevelDAO() {}
	
	//글등록
	public void insertBoard(BoardLevelVO board)throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			conn = DBUtil.getConnection();
			sql = "INSERT INTO zboardlevel (boardv_num,subject,"
				+ "content,parent_num,depth,ip,image,mem_num) "
				+ "VALUES (zboardv_seq.nextval,?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			//?에 데이터를 바인딩
			pstmt.setString(1, board.getSubject());
			pstmt.setString(2, board.getContent());
			pstmt.setInt(3, board.getParent_num());
			pstmt.setInt(4, board.getDepth());
			pstmt.setString(5, board.getIp());
			pstmt.setString(6, board.getImage());
			pstmt.setInt(7, board.getMem_num());
			pstmt.executeUpdate();
			
		}catch(Exception e) {
			throw new Exception(e);
		}finally {
			DBUtil.executeClose(null, pstmt, conn);
		}		
	}
	//전체글/검색글 개수
	public int getBoardCount(String keyfield,
			                 String keyword)
	                          throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		String sub_sql = "";
		int count = 0;
		
		try {
			conn = DBUtil.getConnection();
			
			if(keyword != null && !"".equals(keyword)) {
				if(keyfield.equals("1")) sub_sql += "WHERE subject LIKE ?";
				else if(keyfield.equals("2")) sub_sql += "WHERE id LIKE ?";
				else if(keyfield.equals("3")) sub_sql += "WHERE content LIKE ?";
			}
			
			sql = "SELECT COUNT(*) FROM zboardlevel JOIN "
				+ "zmember USING(mem_num) " + sub_sql;
			pstmt = conn.prepareStatement(sql);
			if(keyword != null && !"".equals(keyword)) {
				pstmt.setString(1, "%"+keyword+"%");
			}
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				count = rs.getInt(1);
			}			
		}catch(Exception e) {
			throw new Exception(e);
		}finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}		
		return count;
	}
	//전체글/검색글 목록
	public List<BoardLevelVO> getListBoard(
			      int start, int end,
			      String keyfield,
			 String keyword)throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<BoardLevelVO> list = null;
		String sql = null;
		String sub_sql = "";
		int cnt = 0;
		
		try {
			conn = DBUtil.getConnection();
			
			if(keyword != null && !"".equals(keyword)) {
				if(keyfield.equals("1")) sub_sql += "WHERE subject LIKE ?";
				else if(keyfield.equals("2")) sub_sql += "WHERE id LIKE ?";
				else if(keyfield.equals("3")) sub_sql += "WHERE content LIKE ?";
			}
			
			sql = "SELECT * FROM (SELECT a.*, rownum rnum "
				+ "FROM (SELECT boardv_num,subject,reg_date,readcount,parent_num,depth,id FROM zboardlevel JOIN "
				+ "zmember USING(mem_num) " + sub_sql
				+ " START WITH depth = 0 CONNECT BY PRIOR "
				+ "boardv_num = parent_num ORDER SIBLINGS "
				+ "BY boardv_num DESC)a) "
				+ "WHERE rnum >= ? AND rnum < ?";
			pstmt = conn.prepareStatement(sql);
			if(keyword != null && !"".equals(keyword)) {
				pstmt.setString(++cnt, "%"+keyword+"%");
			}
			pstmt.setInt(++cnt, start);
			pstmt.setInt(++cnt, end);
			
			rs = pstmt.executeQuery();
			list = new ArrayList<BoardLevelVO>();
			while(rs.next()) {
				BoardLevelVO board = 
						new BoardLevelVO();
				board.setBoardv_num(
						rs.getInt("boardv_num"));
				board.setSubject(
						StringUtil.useNoHtml(
								rs.getString("subject")));
				board.setReg_date(rs.getDate("reg_date"));
				board.setParent_num(
						 rs.getInt("parent_num"));
				board.setDepth(rs.getInt("depth"));
				board.setReadcount(rs.getInt("readcount"));
				board.setId(rs.getString("id"));
				
				list.add(board);
				
			}
			
		}catch(Exception e) {
			throw new Exception(e);
		}finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}		
		return list;
	}
	//글상세
	public BoardLevelVO getBoard(int boardv_num)
			                      throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BoardLevelVO board = null;
		String sql = null;
		
		try {
			conn = DBUtil.getConnection();
			sql = "SELECT * FROM zboardlevel JOIN zmember "
				+ "USING(mem_num) WHERE boardv_num=?";
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setInt(1, boardv_num);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				board = new BoardLevelVO();
				board.setBoardv_num(rs.getInt("boardv_num"));
				board.setSubject(rs.getString("subject"));
				board.setReg_date(rs.getDate("reg_date"));
				board.setModify_date(rs.getDate("modify_date"));
				board.setReadcount(rs.getInt("readcount"));
				board.setContent(rs.getString("content"));
				board.setParent_num(rs.getInt("parent_num"));
				board.setDepth(rs.getInt("depth"));
				board.setImage(rs.getString("image"));
				board.setMem_num(rs.getInt("mem_num"));
				board.setId(rs.getString("id"));
			}			
		}catch(Exception e) {
			throw new Exception(e);
		}finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}		
		return board;
	}
	//조회수 증가
	public void updateReadcount(int boardv_num)throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			conn = DBUtil.getConnection();
			sql = "UPDATE zboardlevel SET readcount=readcount+1 "
				+ "WHERE boardv_num=?";
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setInt(1, boardv_num);
			pstmt.executeUpdate();
		}catch(Exception e) {
			throw new Exception(e);
		}finally {
			DBUtil.executeClose(null, pstmt, conn);
		}
		
	}
	//파일삭제
	public void deleteFile(int boardv_num)throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			conn = DBUtil.getConnection();
			sql = "UPDATE zboardlevel SET image='' WHERE boardv_num=?";
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setInt(1, boardv_num);
			pstmt.executeUpdate();
		}catch(Exception e) {
			throw new Exception(e);
		}finally {
			DBUtil.executeClose(null, pstmt, conn);
		}		
	}
	//글수정
	public void updateBoard(BoardLevelVO board)
	                                       throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		String sub_sql = "";
		int cnt = 0;
		
		try {
			conn = DBUtil.getConnection();
		
			if(board.getImage()!=null) {
				sub_sql = ",image=?";
			}
		
			sql = "UPDATE zboardlevel SET subject=?,content=?,"
				+ "ip=?" + sub_sql + ",modify_date=SYSDATE "
				+ "WHERE boardv_num=?";
			pstmt = conn.prepareStatement(sql);
			//?에 데이터를 바인딩
			pstmt.setString(++cnt, board.getSubject());
			pstmt.setString(++cnt, board.getContent());
			pstmt.setString(++cnt, board.getIp());
			if(board.getImage()!=null) {
				pstmt.setString(++cnt, board.getImage());
			}
			pstmt.setInt(++cnt, board.getBoardv_num());
			pstmt.executeUpdate();
		}catch(Exception e) {
			throw new Exception(e);
		}finally {
			DBUtil.executeClose(null, pstmt, conn);
		}
	}
	//글삭제
	public void deleteBoard(int boardv_num)throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			conn = DBUtil.getConnection();

			sql = "DELETE FROM zboardlevel "
					+ "WHERE boardv_num IN ("
					+ "SELECT boardv_num FROM "
					+ "zboardlevel START WITH "
					+ "boardv_num=? CONNECT BY PRIOR "
					+ "boardv_num = parent_num)";
			
			pstmt = conn.prepareStatement(sql);
			
			//?에 데이터 바인딩
			pstmt.setInt(1, boardv_num);
			pstmt.executeUpdate();
			
			
		}catch(Exception e) {
			throw new Exception(e);
		}finally {
			DBUtil.executeClose(null, pstmt, conn);
		}
	}
	
	//삭제할 글의 이미지 파일 구하기
	public List<String> getImageDeleted(int boardv_num)throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<String> list = null;
		String sql = null;
		
		try {
			conn = DBUtil.getConnection();
			
			sql = "SELECT image FROM "
					+ "zboardlevel START WITH "
					+ "boardv_num = ? CONNECT BY PRIOR "
					+ "boardv_num = parent_num";
			
			pstmt = conn.prepareStatement(sql);
			
			//?에 데이터 바인딩
			pstmt.setInt(1, boardv_num);
			
			rs = pstmt.executeQuery();
			
			list = new ArrayList<String>();
			while(rs.next()) {
				String image = rs.getString("image");
				if(image!=null) {
					list.add(image);
				}
			}
			
		}catch(Exception e) {
			throw new Exception(e);
		}finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}
		
		return list;
	}
}




