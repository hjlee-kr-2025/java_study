package com.report.controller;

import java.util.List;

import com.report.service.StudentListService;
import com.report.service.StudentViewService;
import com.report.service.SubjectListService;
import com.report.service.SubjectScoreWriteService;
import com.report.util.Execute;
import com.report.util.In;
import com.report.util.StudentPrint;
import com.report.util.SubjectPrint;
import com.report.vo.StudentVO;
import com.report.vo.SubjectScoreVO;
import com.report.vo.SubjectVO;

public class SubjectScoreController {

	public void execute() {
		while (true) {
			System.out.println();
			System.out.println("<<< ---- 수강신청 및 성적입력 ---- >>>");
			System.out.println("1. 수강신청");
			System.out.println("0. 이전메뉴");
			
			// 메뉴입력
			String menu = In.getStr("메뉴");
			// 결과저장변수
			Object result = null;
			
			try {
				switch (menu) {
				case "1":
					selectStudentId();
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
				selectSubjectId(studentId);
				return;// 메서드 종료
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
	} // end of selectStudentId()
	
	private void selectSubjectId(Integer studentId) {
		while(true) {
			System.out.println("=== 수강과목선택 ===");
			System.out.println("1. 과목리스트, 2. 과목선택");
			System.out.println("3. 과목취소, 0. 수강완료");
			
			String menu = In.getStr("메뉴");
			// 결과담을 변수
			Object result = null;
			try {
				switch(menu) {
				case "1":
					// 넘어가는 데이터는 없습니다.
					// 서비스 실행
					result = Execute.execute(new SubjectListService(), null);
					// 결과 확인
					new SubjectPrint().print((List<SubjectVO>)result);
					break;
				case "2":// 수강신청 : insert(write)
					// 과목 선택 번호 입력
					Integer subjectId = In.getInt("과목번호");
					// 데이터 세팅(서비스로 넘어가는 데이터)
					SubjectScoreVO vo = new SubjectScoreVO();
					vo.setSubjectId(subjectId);
					vo.setStudentId(studentId);
					// 서비스 실행
					result = Execute.execute(new SubjectScoreWriteService(), vo);
					// 과목이 중복수강된 부분은 생략하였습니다.
					
					// 결과 확인
					if (result != null && (Integer)result != 0) {
						System.out.println("과목이 등록되었습니다.");
					}
					else {
						System.out.println("과목번호가 잘못되었습니다.");
						System.out.println("다시 확인후 등록바랍니다.");
					}
					break;
				case "3":
					break;
				case "0":
					System.out.println("수강신청을 완료했습니다.");
					return;
				default:
					System.out.println("잘못 입력하셨습니다.");
					System.out.println("1,2,3,0 번 중 하나를 선택하세요.");
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
