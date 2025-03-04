package com.shopdb.board.service;

import com.shopdb.board.dao.BoardDAO;

public class BoardListService implements Service {

	@Override
	public Object service(Object obj)
		throws Exception{
		// TODO Auto-generated method stub
		BoardDAO dao = new BoardDAO();
		return dao.list();
	}

}
