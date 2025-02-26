package com.shopping.board.service;

import com.shopping.board.dao.BoardDAO;

// R: 일반게시판 리스트 서비스
public class BoardListService implements Service {

	@Override
	public Object service(Object obj) throws Exception {
		// TODO Auto-generated method stub
		// BoardController "2" -> Execute.execute()
		// 서비스를 실행할때 넘겨받는 데이터는 별도로 없습니다.
		BoardDAO dao = new BoardDAO();
		Object result = dao.list();
		// ArrayList<BoardVO> result = dao.list(); 로 하셔도 됩니다.
		return result;
		/*	위 세줄을 한줄로 만들면?
		 * return new BoardDAO().list();
		 */
	}

}
