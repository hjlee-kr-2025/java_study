package com.report.util;

import java.util.List;

import com.report.vo.SubjectVO;

public class SubjectPrint {

	public void print(List<SubjectVO> list) {
		System.out.println();
		System.out.println("----- 과목 리스트 -----");
		System.out.println("과목번호 / 과목명");
		System.out.println("---------------------");
		for (SubjectVO vo : list) {
			System.out.println(" " + vo.getSubjectId() +
					"  /  " + vo.getSubjectName());
		}
	}	// end of print(List<SubjectVO> list)
}
