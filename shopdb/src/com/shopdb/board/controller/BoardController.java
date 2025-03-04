package com.shopdb.board.controller;

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
					break;
				case "2":
					System.out.println("2.글보기");
					break;
				case "3":
					System.out.println("3.글쓰기");
					break;
				case "4":
					System.out.println("4.글수정");
					break;
				case "5":
					System.out.println("5.글삭제");
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
} // end of class
