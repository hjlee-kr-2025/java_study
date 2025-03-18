package com.report.vo;

import lombok.Data;

@Data
public class SubjectScoreVO {
	private Integer scoreId;
	private Integer score;
	private Integer studentId;// Student table
	private Integer subjectId;// Subject table
	// SubjectScroe 테이블에는
	// 등록된 학생과 등록된 과목을 가지고 테이블에 데이터를 넣을 수 있습니다.
	
	// join할 데이터 추가
	private String subjectName;// subject table
}
