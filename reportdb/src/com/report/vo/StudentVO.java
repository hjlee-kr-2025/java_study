package com.report.vo;

import lombok.Data;

@Data
public class StudentVO {
	private Integer studentId;
	private String studentName;
	private String department;
	private Integer totalScore;
	private Double avrScore;
}
