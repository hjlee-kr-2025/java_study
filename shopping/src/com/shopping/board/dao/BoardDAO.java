package com.shopping.board.dao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;

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
	
	// 리스트
	public ArrayList<BoardVO> list() throws Exception {
		// 결과 담을 변수
		ArrayList<BoardVO> list = null;
		// 리스트에서 표시할 데이터
		// 1. 글번호, 2. 제목, 3. 작성자, 4. 작성일, 5. 조회수
		Iterator<BoardVO> ir = boardList.iterator();
		// Iterator hasNext() 다음에 꺼낼 자료가 있나요?
		while (ir.hasNext()) {
			// next() : 자료를 꺼내서 리턴 + 위치이동
			BoardVO tempVo = ir.next();
			BoardVO vo = new BoardVO();
			vo.setNo(tempVo.getNo());
			vo.setTitle(tempVo.getTitle());
			vo.setWriter(tempVo.getWriter());
			vo.setWriteDate(tempVo.getWriteDate());
			vo.setHit(tempVo.getHit());
			
			if (list == null) list = new ArrayList<BoardVO>();
			list.add(vo);
		}
		
		return list;
	}
	
	public Integer increase(Long no) throws Exception {
		// 결과저장변수
		Integer result = 0;
		
		return result;
	}
	
	// 글보기 (상세보기), 수정을 위해 글을 가져올 때 
	public BoardVO view(Long no, Long hit) throws Exception {
		// 결과값 저장할 변수
		BoardVO vo = null;
		
		for (int i = 0 ; i < boardList.size() ; ++i) {
			BoardVO tempVo = boardList.get(i);
			if (no == tempVo.getNo()) {
				vo = new BoardVO();
				vo.setNo(tempVo.getNo());
				vo.setTitle(tempVo.getTitle());
				vo.setContent(tempVo.getContent());
				vo.setWriteDate(tempVo.getWriteDate());
				vo.setWriter(tempVo.getWriter());
				vo.setPw(tempVo.getPw());
				vo.setHit(tempVo.getHit() + hit);
				if (hit == 1L) {
					// 조회수가 증가되었을때 리스트값 변경
					boardList.set(i, vo);
				}
				break;// for () 블럭을 빠져나옵니다.
			}
		}
		
		return vo;
	}
	
	
	// 글수정
	public Integer update(BoardVO vo) throws Exception {
		// 결과값을 저장할 변수
		Integer result = 0;
		for (int i = 0 ; i < boardList.size() ; ++i) {
			BoardVO tempVo = boardList.get(i);
			
			if (tempVo.getNo() == vo.getNo()
				&& tempVo.getPw().equals(vo.getPw())) {
				BoardVO saveVO = new BoardVO();
				saveVO.setNo(vo.getNo());
				saveVO.setPw(vo.getPw());
				saveVO.setTitle(vo.getTitle());
				saveVO.setContent(vo.getContent());
				saveVO.setWriter(vo.getWriter());
				saveVO.setHit(tempVo.getHit());
				saveVO.setWriteDate(tempVo.getWriteDate());
				boardList.set(i, saveVO);
				result = 1;
				break; // for() 블럭을 빠져나옵니다.
			}
		}
		
		return result;
	}
	
	// 글삭제
	public Integer delete(BoardVO vo) throws Exception {
		// 결과담을 변수선언
		Integer result = 0;
		
		Iterator<BoardVO> ir = boardList.iterator();
		while (ir.hasNext()) {
			BoardVO tempVo = ir.next();
			if (tempVo.getNo() == vo.getNo()
				&& tempVo.getPw().equals(vo.getPw())) {
				boardList.remove(tempVo);
				result = 1;
				break;
			}
		}
		
		return result;
	}
}







