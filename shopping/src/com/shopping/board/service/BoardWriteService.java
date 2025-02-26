package com.shopping.board.service;

import com.shopping.board.dao.BoardDAO;
import com.shopping.board.vo.BoardVO;

// C: 글쓰기(글작성)
public class BoardWriteService implements Service{

	@Override
	public Object service(Object obj) throws Exception {
		// TODO Auto-generated method stub
		// BoardController ("1") -> Execute.execute()
		// -> BoardWriteService.service() vo 변수값을 넘겨받았습니다.
		BoardDAO dao = new BoardDAO();
		Integer result = dao.write((BoardVO)obj);
		return result;
		/* 위의 3줄을 한줄로 바꾸면?
		 * return new BoardDAO().write((BoardVO)obj);
		 */
		
	}

}
