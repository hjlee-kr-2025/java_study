package com.report.controller;

import java.util.List;

import com.report.service.SubjectListService;
import com.report.service.SubjectWriteService;
import com.report.util.Execute;
import com.report.util.In;
import com.report.util.SubjectPrint;
import com.report.vo.SubjectVO;

// 과목에 관련된 메뉴
public class SubjectController {

	// @SuppressWarnings("unchecked") 는
	// Execute의 return 자료형이 Object인데 이 자료형이 List<SubjectVO>
	// 인지 컴파일러가 모르겠다는 의미의 경고가 나오는 것을 무시합니다.
	@SuppressWarnings("unchecked")
	public void execute() {
		while (true) {
			// 모듈이름 출력
			System.out.println();
			System.out.println("<<< ---- 과목 확인 ---- >>>");
			System.out.println("1. 과목리스트, 3. 과목 등록 ");
			System.out.println("0. 이전메뉴");
			
			// 메뉴입력
			String menu = In.getStr("메뉴");
			// 결과값을 받을 변수
			Object result = null;
			
			try {
				switch(menu) {
				case "1":
					System.out.println("1. 과목리스트");
					// SubjectController -> Execute.execute()
					// -> SubjectListService -> SubjectDAO.list()
					result = Execute.execute(new SubjectListService(), null);
					// 가져온 데이터를 출력합니다.
					new SubjectPrint().print((List<SubjectVO>) result);
					break;
				case "3":
					System.out.println("3. 과목등록");
					// 넘어가는 데이터 세팅
					String subjectName = In.getStr("과목이름");
					
					// 서비스 실행
					result = Execute.execute(new SubjectWriteService(), subjectName);
					
					// 결과확인
					if ((Integer)result != 0) {
						System.out.println("과목이 등록되었습니다.");
					}
					break;
				case "0":
					break;
				default:
					System.out.println("잘못입력하셨습니다.");
					System.out.println("1,3,0 중 하나를 입력하세요.");
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
