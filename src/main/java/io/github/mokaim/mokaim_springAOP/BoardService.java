package io.github.mokaim.mokaim_springAOP;

public class BoardService {
	private BoardDao dao;

	public Board getBoard(int no) {
		return dao.selectOne(no);
	}

	public void setDao(BoardDao dao) {
		this.dao = dao;
	}
	
	
}
