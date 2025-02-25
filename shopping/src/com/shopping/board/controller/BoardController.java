package com.shopping.board.controller;

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
			
			try {
				// 프로그램 실행부분
				// 실제메뉴처리 : CRUD
				// controller(여기)-> service -> dao: 실행
				// ===> 파라메터로 데이터가 전달됩니다.  
				// dao -> service -> controller
				// ===> 리턴으로 데이터가 전달됩니다.
				switch (menu) {
				case "1":
					System.out.println("1.글등록");
					break;
				case "2":
					System.out.println("2.리스트");
					break;
				case "3":
					System.out.println("3.글보기");
					break;
				case "4":
					System.out.println("4.글수정");
					break;
				case "5":
					System.out.println("5.글삭제");
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
} // end of class





