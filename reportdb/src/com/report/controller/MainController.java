package com.report.controller;

import com.report.util.In;

// 메인메뉴로 사용할 클래스
public class MainController {
	// 과목클래스 선언
	private static SubjectController subjectController = new SubjectController();
	// 학생클래스 선언
	private static StudentController studentController = new StudentController();
	
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("학생성적관리 프로그램입니다.");
		
		// 드라이버확인 (MySQL)
		Class.forName("com.report.util.DB");
		//=> 처음 한번만 실행 - DAO 메서드의 1번항목
		
		while (true) {
			System.out.println();
			System.out.println("<--- MAIN MENU --->");
			System.out.println("1.과목, 2,학생, 3.성적");
			System.out.println("0.종료");
			
			// 메뉴입력
			String menu = In.getStr("메뉴");
			// 메뉴처리
			switch(menu) {
			case "1":
				subjectController.execute();
				break;
			case "2":
				studentController.execute();
				break;
			case "3":
				break;
			case "0":
				System.out.println("프로그램을 종료합니다.");
				return ;
				// System.exit(0); // return 대신에 사용가능
			default:
				System.out.println("잘못입력하셨습니다.");
				System.out.println("1,2,3,0 중 하나를 입력하세요.");
			}
		}
		
		
	}
}
