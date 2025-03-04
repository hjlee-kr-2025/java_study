package com.shopdb.board.service;

import com.shopdb.board.dao.BoardDAO;
import com.shopdb.board.vo.BoardVO;

public class BoardUpdateService implements Service {

	@Override
	public Object service(Service service, Object obj)
		throws Exception {
		// TODO Auto-generated method stub
		BoardDAO dao = new BoardDAO();
		return dao.update((BoardVO)obj);
	}

}
