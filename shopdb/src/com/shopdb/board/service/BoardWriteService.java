package com.shopdb.board.service;

import com.shopdb.board.dao.BoardDAO;
import com.shopdb.board.vo.BoardVO;

public class BoardWriteService implements Service {

	@Override
	public Object service(Object obj)
		throws Exception {
		// TODO Auto-generated method stub
		BoardDAO dao = new BoardDAO();
		// Object -> BoardVO 로 다운캐스팅 해서 전달
		return dao.write((BoardVO)obj);
	}

}
