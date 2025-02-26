package com.shopping.board.service;

import com.shopping.board.dao.BoardDAO;
import com.shopping.board.vo.BoardVO;

// D: 일반게시판 글삭제
public class BoardDeleteService implements Service {

	@Override
	public Object service(Object obj) throws Exception {
		// TODO Auto-generated method stub
		// BoardController "5" ==> Execute.execute()
		// obj(vo) 값을 넘겨받는데 (no, pw 값만 유효한 데이터입니다)
		BoardDAO dao = new BoardDAO();
		Integer result = dao.delete((BoardVO)obj);
		return result;
	}

}
