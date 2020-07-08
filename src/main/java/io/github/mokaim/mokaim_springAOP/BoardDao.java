package io.github.mokaim.mokaim_springAOP;

public class BoardDao {
	public Board selectOne(int no) {
		Board board = new Board();
		
		board.setNo(1);
		board.setTitle("제뮥");
		board.setContent("내용");
		return board;
	}
	
}
