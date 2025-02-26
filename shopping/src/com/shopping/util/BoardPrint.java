package com.shopping.util;

import java.util.List;

import com.shopping.board.vo.BoardVO;

// R (list, view) 서비스를 통해 받은 데이터를
// 화면에 출력하도록 하는 클래스로 만들예정입니다.
public class BoardPrint {

	// 리스트 데이터를 넘겨받았을때
	public void print(List<BoardVO> list) {
		System.out.println();
		System.out.println("****************************************");
		System.out.println("*             게시판 리스트               *");
		System.out.println("****************************************");
		System.out.println(" 번호  /  제목  /  작성자  /  작성일  / 조회수");
		System.out.println("****************************************");
		for (BoardVO vo : list) {
			System.out.println(
				vo.getNo() + " / " +
				vo.getTitle() + " / " +
				vo.getWriter() + " / " +
				vo.getWriteDate() + " / " +
				vo.getHit()
			);
		}
		System.out.println("****************************************");
	}
}
