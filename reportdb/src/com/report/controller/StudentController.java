package com.report.controller;

import java.util.List;

import com.report.service.StudentDeleteService;
import com.report.service.StudentListService;
import com.report.service.StudentUpdateService;
import com.report.service.StudentViewService;
import com.report.service.StudentWriteService;
import com.report.service.SubjectScoreListService;
import com.report.util.Execute;
import com.report.util.In;
import com.report.util.StudentPrint;
import com.report.vo.StudentVO;
import com.report.vo.SubjectScoreVO;

public class StudentController {

	public void execute() {
		while (true) {
			System.out.println();
			System.out.println("<<< ---- 학생 정보 ---- >>>");
			System.out.println("1. 학생 리스트, 2. 학생 세부 정보");
			System.out.println("3. 학생 등록, 4. 학생 정보 수정");
			System.out.println("5. 학생 정보 삭제 ");
			System.out.println("0. 이전메뉴");
			
			// 메뉴입력
			String menu = In.getStr("메뉴");
			// 결과 담을 변수선언
			Object result = null;
			
			try {
				// 메뉴처리
				switch (menu) {
				case "1":
					System.out.println("1. 학생리스트----");
					// 넘어가는 데이터가 null(없다)
					// 서비스 실행
					result = Execute.execute(new StudentListService(), null);
					// 결과 출력
					new StudentPrint().print((List<StudentVO>)result);
					break;
				case "2":
					/* 학생세부정보, 학번, 학과, 이름
					 * 수강신청과목 및 점수를 확인하도록 구성하겠습니다.
					 * 총점과 평균을 알려줍니다.
					 * (단, 과목점수가 0점인것은 총점과 평균에서 제외)
					 * 
					 */
					System.out.println("2. 학생 세부 정보");
					// 전달되는 데이터를 수집
					// StudentId 가 필요합니다.
					Integer studentId = In.getInt("학생ID");
					StudentVO vo = new StudentVO();
					vo = (StudentVO) Execute.execute(new StudentViewService(), studentId);
					// 수강한 과목 및 성적 - 넘어가는데이터 studentId
					result = Execute.execute(new SubjectScoreListService(), studentId);
					// 화면에 보여준다.
					new StudentPrint().print(vo, (List<SubjectScoreVO>) result);
					break;
				case "3":
					System.out.println("3. 학생 등록 ---");
					// 데이터 받기
					String studentName = In.getStr("이름");
					String department = In.getStr("학과");
					// 넘어갈 데이터 만들기
					vo = new StudentVO();
					vo.setStudentName(studentName);
					vo.setDepartment(department);
					/*
					 * StudentVO vo = new StudentVO();
					 * vo.setStudentName(In.getStr("이름"));
					 * vo.setDepartment(In.getStr("학과"));
					 * 
					 */
					
					// 서비스 실행
					result = Execute.execute(new StudentWriteService(), vo);
					
					if ((Integer)result == 1) {
						System.out.println("학생이 등록되었습니다.");
					}
					
					break;
				case "4":
					System.out.println("4. 학생정보수정");
					// 1. 누구를 수정할 것인가?
					// 2. 현재 어떻게 데이터가 저장되어있나?
					// 3. 어떤데이터를 수정할 것인가?
					// 4. 수정
					// 5. 완료
					studentId = In.getInt("학생Id");
					// 학생id에 대한 학생정보
					vo = new StudentVO();
					vo = (StudentVO) Execute.execute(new StudentViewService(), studentId);
					// 수정하는 메서드 - 매개변수 vo
					update(vo);
					break;
				case "5":
					System.out.println("5. 학생정보삭제");
					// 넘어가는 데이터 수집 (studentId)
					studentId = In.getInt("학생Id");
					// 서비스 실행
					result = Execute.execute(new StudentDeleteService(), studentId);
					// 결과 확인
					if (result != null && (Integer)result != 0) {
						System.out.println("학생정보가 삭제되었습니다.");
					}
					break;
				case "0":// 이전메뉴
					return;// 메서드 종료
				default:
					System.out.println("잘못 선택 하셨습니다.");
					System.out.println("[0-5] 번 중 하나를 입력하세요.");
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			
			
		} // end of while (true)
	} // end of execute()
	
	// 수정을 위한 메서드
	private void update(StudentVO vo) throws Exception {
		while(true) {
			System.out.println("이름 : " + vo.getStudentName());
			System.out.println("학과 : " + vo.getDepartment());
			System.out.println("---- 수정 메뉴 ----");
			System.out.println("1.이름, 2.학과, 9.취소, 0.완료");
			
			String menu = In.getStr("메뉴선택");
			// 결과저장을 위한 변수
			Integer result = null;
			
			switch (menu) {
			case "1":
				vo.setStudentName(In.getStr("이름"));
				break;
			case "2":
				vo.setDepartment(In.getStr("학과"));
				break;
			case "9":
				System.out.println("수정이 취소되었습니다.");
				return;
			case "0":
				// 서비스를 실행합니다.
				result = (Integer) Execute.execute(new StudentUpdateService(), vo);
				// 결과 확인
				if (result != null && result != 0) {
					System.out.println("학생정보가 수정되었습니다.");
				}
				return;
			default:
				System.out.println("메뉴를 잘못 입력하셨습니다.");
				System.out.println("[0-2, 9] 번을 입력하세요.");
			}
		} // end of while(true)
	} // end of update(StudentVO vo)
	
	
}
