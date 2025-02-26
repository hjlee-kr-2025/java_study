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
		if (list == null) {
			System.out.println("등록된 글이 없습니다.");
		}
		else {
			for (BoardVO vo : list) {
				System.out.println(
					vo.getNo() + " / " +
					vo.getTitle() + " / " +
					vo.getWriter() + " / " +
					vo.getWriteDate() + " / " +
					vo.getHit()
				);
			} // end of for
		}
		System.out.println("****************************************");
	}// end of print(List<BoardVO>)
	
	// 데이터 1개를 출력하는 메서드
	public void print(BoardVO vo) {
		System.out.println();
		System.out.println("********************************");
		System.out.println("    게시판 글보기 ");
		System.out.println("********************************");
		if (vo == null) {
			System.out.println("작성된 내용이 없습니다.");
		}
		else {
			System.out.println("글번호 : " + vo.getNo());
			System.out.println("제목 : " + vo.getTitle());
			System.out.println("내용 : " + vo.getContent());
			System.out.println("작성자 : " + vo.getWriter());
			System.out.println("작성일 : " + vo.getWriteDate());
			System.out.println("조회수 : " + vo.getHit());
		}
		System.out.println("********************************");
	}// end of print(BoardVO)
} // end of class





