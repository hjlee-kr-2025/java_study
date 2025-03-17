package com.report.controller;

import java.util.List;

import com.report.service.StudentListService;
import com.report.service.StudentViewService;
import com.report.util.Execute;
import com.report.util.In;
import com.report.util.StudentPrint;
import com.report.vo.StudentVO;

public class SubjectScoreController {

	public void execute() {
		while (true) {
			System.out.println();
			System.out.println("<<< ---- 수강신청 ---- >>>");
			System.out.println("1. 수강신청");
			System.out.println("0. 이전메뉴");
			
			// 메뉴입력
			String menu = In.getStr("메뉴");
			// 결과저장변수
			Object result = null;
			
			try {
				switch (menu) {
				case "1":
					break;
				case "0":
					return;
				default:
					System.out.println("잘못 입력하셨습니다.");
					System.out.println("1,0 중 하나를 입력하세요.");
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		} // end of while (true)
	} // end of execute()
	
	private void selectStudentId() {
		Object result = null;
		while (true) {
			try {
				System.out.println("--- 수강신청 학생선택 ---");
				// 서비스 실행
				result = Execute.execute(new StudentListService(), null);
				// 결과 출력
				new StudentPrint().print((List<StudentVO>)result);
				Integer studentId = In.getInt("학생번호");
				// 학생번호가 DB에 있는 번호인지 체크?
				result = Execute.execute(new StudentViewService(), studentId);
				if (result == null) {
					System.out.println("등록되지않은 학생번호 입니다.");
					continue;// while문의 처음으로 돌아갑니다.
				}
				// 수강신청과목
				
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
	} // end of selectStudentId()
	
	private void selectSubjectId(Integer studentId) {
		
	}
}
