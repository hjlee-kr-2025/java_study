package com.report.util;

import java.util.List;

import com.report.vo.StudentVO;
import com.report.vo.SubjectScoreVO;

public class StudentPrint {

	public void print(List<StudentVO> list) {
		System.out.println();
		System.out.println("----- 학생 리스트 -----");
		System.out.println("학번  /   학과    /  이름");
		System.out.println("---------------------");
		for (StudentVO vo : list) {
			System.out.println(" " + vo.getStudentId() +
					" / " + vo.getDepartment() + 
					" / " + vo.getStudentName());
		}
	} // end of print(List<StudentVO> list)
	
	public void print(StudentVO vo, List<SubjectScoreVO> list) {
		System.out.println();
		System.out.println("==== 학생 정보 ====");
		System.out.println("학번 : " + vo.getStudentId());
		System.out.println("학과 : " + );
	}
}




