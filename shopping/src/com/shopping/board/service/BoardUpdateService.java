package com.shopping.board.service;

import com.shopping.board.dao.BoardDAO;
import com.shopping.board.vo.BoardVO;

// U: 일반게시판 글수정 서비스
public class BoardUpdateService implements Service {

	@Override
	public Object service(Object obj) throws Exception {
		// TODO Auto-generated method stub
		// BoardController "4" --> Execute.execute()
		BoardDAO dao = new BoardDAO();
		Integer result = dao.update((BoardVO)obj);
		return result;
		/* 위 3줄을 한줄로
		 * return new BoardDAO().update((BoardVO)obj);
		 */
	}

}
