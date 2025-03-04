package com.shopdb.board.service;

import com.shopdb.board.dao.BoardDAO;

public class BoardViewService implements Service {

	@Override
	public Object service(Object obj)
		throws Exception {
		// TODO Auto-generated method stub
		BoardDAO dao = new BoardDAO();
		Integer[] objs = (Integer[]) obj;
		Integer no = objs[0];	// 글번호
		Integer inc = objs[1];	// 조회수 증가 옵션
		
		if (inc == 1) {
			dao.increse(no);
		}
		
		return dao.view(no);
	}

}
