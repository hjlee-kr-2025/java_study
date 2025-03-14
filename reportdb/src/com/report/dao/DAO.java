package com.report.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// DAO는 DB처리를 위한 클래스 입니다.
// 공통적으로 사용하는 변수를 선언했습니다.
public class DAO {
	// 연결 객체 - DB연결을 위한 객체
	public Connection con;
	// 실행 객체 - DB의 sql문을 실행해서 결과를 리턴합니다.
	public PreparedStatement pstmt;
	// 데이터 저장 객체
	public ResultSet rs;
}
