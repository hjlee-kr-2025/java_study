package com.report.controller;

import java.util.List;

import com.report.service.StudentListService;
import com.report.service.StudentViewService;
import com.report.service.StudentWriteService;
import com.report.service.SubjectScoreListService;
import com.report.util.Execute;
import com.report.util.In;
import com.report.util.StudentPrint;
import com.report.vo.StudentVO;

public class StudentController {

	public void execute() {
		while (true) {
			System.out.println();
			System.out.println("<<< ---- 학생 정보 ---- >>>");
			System.out.println("1. 학생 리스트, 2. 학생 세부 정보");
			System.out.println("3. 학생 등록 ");
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
				case "0":// 이전메뉴
					return;// 메서드 종료
				default:
					System.out.println("잘못 선택 하셨습니다.");
					System.out.println("1,3,0 번 중 하나를 입력하세요.");
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			
			
		} // end of while (true)
	} // end of execute()
}
