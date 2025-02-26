package com.shopping.board.service;

import com.shopping.board.dao.BoardDAO;

// R: 일반게시판 글보기 서비스
public class BoardViewService implements Service {

	@Override
	public Object service(Object obj) throws Exception {
		// TODO Auto-generated method stub
		// BoardController "3" => Execute.execute()
		// obj => Long[]
		Long[] no = (Long[])obj;
		
		BoardDAO dao = new BoardDAO();
		Object result = dao.view(no[0], no[1]);
		// BoardVO vo = dao.view(no[0], no[1]);
		return result;
		/*	3줄을 한줄로
		 * return new BoardDAO().view(no[0],no[1]); 
		 */
	}

}
