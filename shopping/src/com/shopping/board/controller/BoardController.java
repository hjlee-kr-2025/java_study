package com.shopping.board.controller;

import java.util.List;

import com.shopping.board.service.BoardDeleteService;
import com.shopping.board.service.BoardListService;
import com.shopping.board.service.BoardUpdateService;
import com.shopping.board.service.BoardViewService;
import com.shopping.board.service.BoardWriteService;
import com.shopping.board.vo.BoardVO;
import com.shopping.util.BoardPrint;
import com.shopping.util.Execute;
import com.shopping.util.In;

// 메뉴를 선택하는데 많이 사용하는 클래스이름입니다.
public class BoardController {

	public static void main(String[] args) {
		// 프로그램중단 전까지 무한반복
		// 프로그램을 중단하는 방법은?
		// 1. while(true)를 빠져나오는 break;
		// 2. main()메서드를 끝내는 return;
		while(true) {
			// 메뉴구성
			System.out.println();// 한줄띄기
			System.out.println("------ << 일반게시판 >> ------");
			System.out.println("1.글등록, 2.리스트, 3.글보기");
			System.out.println("4.글수정, 5.글삭제, 0.종료");
			System.out.println("---------------------------");
			
			String menu = In.getStr("메뉴");
			
			Object result = null;
			
			try {
				// 프로그램 실행부분
				// 실제메뉴처리 : CRUD (Create, Read, Update, Delete)
				// controller(여기)-> service -> dao: 실행
				// ===> 파라메터로 데이터가 전달됩니다.  
				// dao -> service -> controller
				// ===> 리턴으로 데이터가 전달됩니다.
				switch (menu) {
				case "1":// 글등록
					System.out.println("1.글등록");
					// 4가지 데이터를 키보드를 통해 입력받습니다.
					String title = In.getStr("제목");
					String content = In.getStr("내용");
					String writer = In.getStr("작성자");
					String pw = In.getStr("비밀번호");
					// 서비스로 넘길 데이터를 하나로 만들어줍니다.
					BoardVO vo = new BoardVO();
					vo.setTitle(title);
					vo.setContent(content);
					vo.setWriter(writer);
					vo.setPw(pw);
					
					// 서비스 실행 (로그클래스를 통해서)
					result = Execute.execute(new BoardWriteService(), vo);
					
					// 결과 표시
					if ((Integer)result == 1) {
						System.out.println("** 새로운 글이 등록되었습니다. **");
					}
					break;
				case "2":// 리스트
					System.out.println("2.리스트");
					// 리스트는 서비스 실행시 전달할 데이터가 없습니다.
					// 서비스 실행
					result = Execute.execute(new BoardListService(), null);
					
					// 받은 결과 표시
					new BoardPrint().print((List<BoardVO>)result);
					break;
				case "3":// 글보기 - 상세보기
					System.out.println("3.글보기");
					// 글보기위해서 필요한 것? - 데이터 중 유일한 값인 글번호를
					// 가지고 상세내용을 가져옵니다.
					// 키보드로 받을 데이터는 글번호
					// 전달할때 글번호와 조회수증가에 관련된 값을 넘겨줍니다.
					Long no = In.getLong("글번호");
					//1. long[] data1 = {no, 1L}; 
					//2. Long[] data = new Long[] {no, 1L};
					// 서비스 실행
					result = Execute.execute(new BoardViewService(), new Long[] {no, 1L});
					
					// 결과 출력 - 자료1개 출력
					new BoardPrint().print((BoardVO)result);
					break;
				case "4": // 글수정
					System.out.println("4.글수정");
					// 글수정을 위해서 글번호가 필요합니다.
					// 수정할 글 데이터를 가져옵니다.
					no = In.getLong("글번호");
					result = Execute.execute(new BoardViewService(), new Long[] {no, 0L});
					// 글수정부분은 이곳에..
					// result가 Object이기 때문에
					// BoardVO 로 다운캐스팅해서 넘겨줍니다.
					update((BoardVO)result);
					break;
				case "5": // 글삭제
					System.out.println("5.글삭제");
					// 글삭제를 위해 필요한 데이터?
					// 1. 글번호, 2. 비밀번호
					no = In.getLong("글번호");
					pw = In.getStr("비밀번호");
					// 위의 두 데이터는 자료형이 같지 않기 때문에 배열로 전달할 수 없습니다.
					// BoardVO에 담아서 전달하도록 합니다.
					vo = new BoardVO();
					vo.setNo(no);
					vo.setPw(pw);
					
					result = Execute.execute(new BoardDeleteService(), vo);
					
					// 처리결과
					if ((Integer)result == 1) {
						System.out.println("글이 삭제되었습니다.");
					}
					else {
						System.out.println("글번호 또는 비밀번호가 다릅니다.");
						System.out.println("다시 확인하시고 시도해 주세요.");
					}
					break;
				case "0":
					System.out.println("프로그램이 종료됩니다.");
					System.out.println("이용해주셔서 감사합니다.");
					return;// main() 메서드 종료: 프로그램종료
				default:
					System.out.println("잘못된 메뉴를 선택하셨습니다.");
					System.out.println("[1~5, 0] 번호를 선택하셔야 합니다.");
				}// end of switch (menu)
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			} // end of try~catch
		} // end of while(true)
	} // end of main
	
	public static void update(BoardVO vo) throws Exception {
		while (true) {
			// 확인용 데이터 출력
			
			// 수정할 항목을 선택 메뉴구성
			System.out.println();
			System.out.println("1.제목, 2.내용, 3.작성자, 9.취소, 0.수정완료");
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
				Integer result = (Integer)Execute.execute(new BoardUpdateService(), vo);
				if (result == 1) {
					System.out.println("글 수정이 완료되었습니다.");
				}
				else {
					System.out.println("글번호 또는 비밀번호가 다릅니다.");
					System.out.println("확인하시고 다시 시도해 주세요.");
				}
				return;// update() 메서드가 종료되도록
			default:
				System.out.println("잘못 입력하셨습니다.");
				System.out.println("[1-3,9,0] 중 하나를 선택하세요");
			} // end of switch (menu)
		} // end of while (true)
	} // end of update()
	
} // end of class





