package com.shopping.board.dao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import com.shopping.board.vo.BoardVO;

public class BoardDAO {
	// 글번호 자동생성을 위한 변수
	public static long serialNo = 1;
	public static ArrayList<BoardVO> boardList
		= new ArrayList<BoardVO>();
	
	// 글쓰기
	public Integer write(BoardVO vo) throws Exception {
		// 7개의 데이터중 4개는 키보드로 입력을 받았습니다.
		// 결과를 저장할 변수
		Integer result = 0;
		vo.setNo(serialNo);
		serialNo++;
		vo.setHit(0L);
		//날짜
		// 현재 날짜를 가져오려면
		LocalDate currentDate = LocalDate.now();
		// 날짜 형식 지정 (yyyy-MM-dd)
		DateTimeFormatter formatter
			= DateTimeFormatter.ofPattern("yyyy-MM-dd");
		vo.setWriteDate(currentDate.format(formatter));
		
		boardList.add(vo);
		
		// 저장이 잘 되었다는 의미로 1을 리턴합니다.
		result =1;
		return result;
	}
}
