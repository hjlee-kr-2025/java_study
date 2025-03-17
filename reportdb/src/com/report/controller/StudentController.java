package com.report.controller;

import java.util.List;

import com.report.service.StudentListService;
import com.report.service.StudentWriteService;
import com.report.util.Execute;
import com.report.util.In;
import com.report.util.StudentPrint;
import com.report.vo.StudentVO;

public class StudentController {

	public void execute() {
		while (true) {
			System.out.println();
			System.out.println("<<< ---- 학생 정보 ---- >>>");
			System.out.println("1. 학생 리스트, 3. 학생 등록 ");
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
				case "3":
					System.out.println("3. 학생 등록 ---");
					// 데이터 받기
					String studentName = In.getStr("이름");
					String department = In.getStr("학과");
					// 넘어갈 데이터 만들기
					StudentVO vo = new StudentVO();
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
