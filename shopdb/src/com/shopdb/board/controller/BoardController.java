package com.shopdb.board.controller;

import java.util.List;

import com.shopdb.board.service.BoardDeleteService;
import com.shopdb.board.service.BoardListService;
import com.shopdb.board.service.BoardUpdateService;
import com.shopdb.board.service.BoardViewService;
import com.shopdb.board.service.BoardWriteService;
import com.shopdb.board.vo.BoardVO;
import com.shopdb.util.BoardPrint;
import com.shopdb.util.Execute;
import com.shopdb.util.In;

public class BoardController {

	public static void main(String[] args) {
		System.out.println("== 프로그램을 시작합니다. ==");
		while (true) {
			System.out.println();
			System.out.println("-------- <일반게시판> --------");
			System.out.println("1. 리스트, 2. 글보기, 3. 글쓰기");
			System.out.println("4. 글수정, 5. 글삭제, 0. 종료");
			System.out.println("---------------------------");
			
			String menu = In.getStr("메뉴");
			// 결과 저장 변수
			Object result = null;
			try {
				// 메뉴처리 - controller(이곳)
				// -> Execute() -> Sevice실행
				// -> DAO에서 DB 처리
				// -> 결과값이 service -> Execute
				// -> controller
				switch (menu) {
				case "1":
					System.out.println("1.리스트");
					// service 실행
					result = Execute.execute(new BoardListService(), null);
					// 받은 리스트 출력
					new BoardPrint().print((List<BoardVO>)result);
					break;
				case "2":
					System.out.println("2.글보기");
					// 상세보기할 글번호를 입력받습니다.
					Integer no = In.getInt("글번호");
					// 서비스를 실행
					// 넘길데이터 글번호, 조회수증가
					result = Execute.execute
						(new BoardViewService(),
						new Integer[] {no, 1});
					// 받은 결과 출력
					new BoardPrint().print((BoardVO)result);
					break;
				case "3":
					System.out.println("3.글쓰기");
					// 글쓰기에 사용할 데이터를 입력 받습니다.
					String title = In.getStr("제목");
					String content = In.getStr("내용");
					String writer = In.getStr("작성자");
					String pw = In.getStr("패스워드");
					BoardVO vo = new BoardVO();
					vo.setTitle(title);
					vo.setContent(content);
					vo.setWriter(writer);
					vo.setPw(pw);
					
					// 서비스 실행
					result = Execute.execute
						(new BoardWriteService(), vo);
					
					break;
				case "4":
					System.out.println("4.글수정");
					// 수정할 글번호 입력받습니다.
					no = In.getInt("글번호");
					// 수정할 글에대한 정보를 가져옵니다.
					result = Execute.execute(new BoardViewService()
						, new Integer[] {no, 0});
					// 글수정을 위해 view 서비스 이용시 조회수는 증가되지 않습니다.
					
					// 수정하는 메서드를 호출합니다.
					update((BoardVO)result);
					break;
				case "5":
					System.out.println("5.글삭제");
					// 글삭제를 위한 데이터 입력
					no = In.getInt("글번호");
					pw = In.getStr("패스워드");
					vo = new BoardVO();
					vo.setNo(no);
					vo.setPw(pw);
					// 서비스 실행
					result = Execute.execute(new BoardDeleteService(), vo);
					break;
				case "0":
					System.out.println("프로그램을 종료합니다.");
					System.out.println("안녕히가세요.");
					return;// main함수가 리턴타입이
							//void이므로 return;만 작성
				default:
					System.out.println("** 메뉴를 잘못 선택하셨습니다 **");
					System.out.println("[1~5,0] 을 선택해주세요.");
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		} // end of while (true)
	} // end of main
	
	// 글수정을 위한 메서드
	private static void update(BoardVO vo) throws Exception {
		while (true) {
			// 확인용 데이터 출력
			new BoardPrint().print(vo);
			// 수정항목 선택메뉴
			System.out.println();
			System.out.println("1.제목, 2:내용, 3:작성자, 9:수정취소, 0:수정완료");
			String menu = In.getStr("수정항목");
			switch (menu) {
			case "1":
				vo.setTitle(In.getStr("제목"));
				break;
			case "2":
				vo.setContent(In.getStr("내용"));
				break;
			case "3":
				vo.setWriter(In.getStr("작성자"));
				break;
			case "9":
				System.out.println("수정을 취소하였습니다.");
				return;
			case "0":
				vo.setPw(In.getStr("본인확인용 비밀번호"));
				// 서비스 실행(update)
				Execute.execute(new BoardUpdateService(), vo);
				return;
			default:
				System.out.println("잘못입력하셨습니다.");
				System.out.println("[1-3,9,0]번 중 하나를 입력하세요");
			} // end of switch
		} // end of while (true)
	}
	
	
} // end of class
