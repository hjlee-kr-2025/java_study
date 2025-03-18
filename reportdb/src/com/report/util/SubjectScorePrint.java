package com.report.util;

import java.util.List;

import com.report.vo.SubjectScoreVO;

public class SubjectScorePrint {

	public void print(List<SubjectScoreVO> list) {
		System.out.println();
		System.out.println("----- 수강 과목 리스트 -----");
		System.out.println("과목번호 / 과목명");
		System.out.println("---------------------");
		if (list == null) {
			System.out.println("** 수강신청과목이 없습니다. **");
			return;// print() 종료
		}
		for (SubjectScoreVO vo : list) {
			System.out.println(" " + vo.getSubjectId() +
					"  /  " + vo.getSubjectName());
		}
	}	// end of print(List<SubjectScoreVO> list)
	
	public void printSubjectId(List<SubjectScoreVO> list) {
		System.out.println();
		System.out.println("--- 과목 수강 학생 ---");
		System.out.println("신청id / 학생id / 학생이름 / 점수");
		System.out.println("----------------------------");
		if (list == null) {
			System.out.println("** 수강학생이 없습니다 **");
			return;
		}
		for (SubjectScoreVO vo : list) {
			System.out.println(vo.getScoreId() + " / " +
					vo.getStudentId() + " / " +
					vo.getStudentName() + " / " +
					vo.getScore());
		}
	} // end of printSubjectId(List<SubjectScoreVO> list)
}
