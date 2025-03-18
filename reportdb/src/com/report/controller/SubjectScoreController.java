package com.report.controller;

import java.util.List;

import com.report.service.StudentListService;
import com.report.service.StudentViewService;
import com.report.service.SubjectCheckSubjectIdService;
import com.report.service.SubjectListService;
import com.report.service.SubjectScoreListService;
import com.report.service.SubjectScoreWriteService;
import com.report.util.Execute;
import com.report.util.In;
import com.report.util.StudentPrint;
import com.report.util.SubjectPrint;
import com.report.util.SubjectScorePrint;
import com.report.vo.StudentVO;
import com.report.vo.SubjectScoreVO;
import com.report.vo.SubjectVO;

public class SubjectScoreController {

	public void execute() {
		while (true) {
			System.out.println();
			System.out.println("<<< ---- 수강신청 및 성적입력 ---- >>>");
			System.out.println("1. 수강신청");
			System.out.println("2. 수강신청확인");
			System.out.println("3. 성적입력");
			System.out.println("0. 이전메뉴");
			
			// 메뉴입력
			String menu = In.getStr("메뉴");
			// 결과저장변수
			Object result = null;
			// 학생번호변수
			Integer studentId = null;
			// 과목번호변수
			Integer subjectId = null;
			
			try {
				switch (menu) {
				case "1":
					// 수강학생선택
					studentId = selectStudentId();
					// 수강신청과목
					selectSubjectId(studentId);
					break;
				case "2":
					// 수강신청확인 학생선택
					studentId = selectStudentId();
					// 수강신청 리스트 서비스 실행
					result = Execute.execute(new SubjectScoreListService(), studentId);
					// 결과 확인
					new SubjectScorePrint().print((List<SubjectScoreVO>)result);
					break;
				case "3":// 성적입력 (과목별)
					// 과목 리스트
					subjectId = getSubjectId();
					// SubjectScore 테이블에 등록된 목록의 점수를 입력합니다.
					// 리스트 - subjectScoreId, studentId, studentName, score
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
	
	// selectStudentID() 메서드는 수강신청학생을 선택해서
	// 학생id를 리턴받는 메서드로 만들어 줍니다.
	private Integer selectStudentId() {
		// 입력된 학생번호로 학생이 있는지 확인하는 변수
		Object result = null;
		while (true) {
			try {
				System.out.println("--- 학생선택 ---");
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
				
				return studentId;// 메서드 종료
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
	} // end of selectSubjectId(Integer studentId)
	
	private Integer getSubjectId() {
		while (true) {
			// 결과 저장 변수 선언
			Integer subjectId = null;
			// 과목리스트 저장변수
			Object result = null;
			
			try {
				System.out.println("----- 과목 선택 -----");
				// 과목리스트 (SubjectListService 를 통해서 실행합니다)
				result = Execute.execute(new SubjectListService(), null);
				// 과목리스트 화면에 출력
				new SubjectPrint().print((List<SubjectVO>)result);
				// 과목id를 입력받습니다.
				subjectId = In.getInt("과목ID");
				// 존재하는 과목id인지 확인
				result = Execute.execute(new SubjectCheckSubjectIdService(), subjectId);
				if (result == null) {
					System.out.println("존재하지 않는 과목코드입니다.");
					System.out.println("확인하시고 다시 입력해 주세요");
					continue;// while (true) 처음으로 돌아가는 명령문
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			// 결과 리턴
			return subjectId;
		} // end of while (true)
	} // end of getSubjectId()
}
