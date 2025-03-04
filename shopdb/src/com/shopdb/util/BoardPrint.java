package com.shopdb.util;

import java.util.List;

import com.shopdb.board.vo.BoardVO;

public class BoardPrint {

	// 리스트 출력
	public void print(List<BoardVO> list) {
		System.out.println();
		System.out.println("**************************");
		System.out.println("*     일반 게시판 리스트     *");
		System.out.println("**************************");
		System.out.println("번호 / 제목 / 작성자 / 작성일 / 조회수");
		System.out.println("**************************");
		for (BoardVO vo : list) {
			System.out.println(vo.getNo() + " / "
				+ vo.getTitle() + " / "
				+ vo.getWriter() + " / "
				+ vo.getWriteDate() + " / "
				+ vo.getHit());
		}
		System.out.println("**************************");
	}
	
	// 글 상세보기
	public void print(BoardVO vo) {
		System.out.println();
		System.out.println("**************************");
		System.out.println("*     일반 게시판 글보기      *");
		System.out.println("**************************");
		System.out.println("글번호 : " + vo.getNo());
		System.out.println("제목 : " + vo.getTitle());
		System.out.println("내용 : " + vo.getContent());
		System.out.println("작성자 : " + vo.getWriter());
		System.out.println("작성일 : " + vo.getWriteDate());
		System.out.println("조회수 : " + vo.getHit());
		System.out.println("**************************");
		
	}
}
