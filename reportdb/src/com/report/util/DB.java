package com.report.util;

/*
 * 1. DB 드라이버가 있는지 확인
 * 2. DB 연결
 * 3. DB 해제
 */
public class DB {
	// DB 드라이버확인에 필요한 상수
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver.class";
	/* DRIVER 파일을 찾는 방법
	 * Referenced Libraries에서
	 * mysql~~.jar파일을 열어서
	 * 끝에 jdbc 패키지를 찾습니다.
	 * 패키지를 열고 Driver.class 파일을 클릭
	 * 오른쪽마우스클릭 후 copy qualified name 선택
	 * ""안에 붙여넣기후 
	 */
	// DB 드라이버 연결에 필요한 상수

}
