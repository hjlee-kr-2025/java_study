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
		System.out.println("학과 : " + vo.getDepartment());
		System.out.println("이름 : " + vo.getStudentName());
		System.out.println("==== 수강과목 및 성적확인 ====");
		if (list == null) {
			System.out.println("수강과목이 없습니다.");
			return;
		}
		Integer total = 0;// 성적 총점 저장
		Integer count = 0;// 성적이 있는 과목 카운트
		System.out.println("과목이름 / 성적");
		for (SubjectScoreVO subjectVO : list) {
			System.out.println(subjectVO.getSubjectName() + " / " +
					subjectVO.getScore());
			if (subjectVO.getScore() != 0) {
				total += subjectVO.getScore();
				count++;
			}
		}
		System.out.println("================");
		if (total != 0) {
			System.out.println("총점 : " + total + " / 평균 : " +
					((double)total / count));
		}
	}
}




