package com.report.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * 1. DB 드라이버가 있는지 확인
 * 2. DB 연결
 * 3. DB 해제
 */
public class DB {
	// DB 드라이버확인에 필요한 상수
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	/* DRIVER 파일을 찾는 방법
	 * Referenced Libraries에서
	 * mysql~~.jar파일을 열어서
	 * 끝에 jdbc 패키지를 찾습니다.
	 * 패키지를 열고 Driver.class 파일을 클릭
	 * 오른쪽마우스클릭 후 copy qualified name 선택
	 * ""안에 붙여넣기후 
	 * "패키지이름.Driver" 확장자인 .class는 삭제합니다.
	 */
	// DB 드라이버 연결에 필요한 상수 (URL, ID, PW)
	private static final String URL = "jdbc:mysql://localhost:3306/reportdb";
	// ==> mysql DB가 자신의 pc가 아닌 다른곳에 만들었다면
	//    '//localhost:3306/reportdb' 대신 ip주소또는 url을 적고 포트번호, DB이름을
	//    같이 적어주면 됩니다.
	private static final String ID = "java";
	private static final String PW = "java";

	// static 메서드 : 클래스이름이 언급될때 자동으로 실행을 합니다. (1번만)
	// 클래스에서 한번만 실행해도 되는 내용을 프로그램합니다.
	// DB클래스에서는 DB 드라이버가 있는지를 체크할 때 사용합니다.
	// static 메서드는 new 로 생성하지 않아도 실행이 되는 메서드 입니다.
	// static 메스드안에는 자신의 클래스의
	// static 메서드 와 static 변수만 사용할 수 있습니다.
	static {
		try {
			Class.forName(DRIVER);
			System.out.println("1. 드라이버 확인");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("<< mysql 드라이버가 없습니다. >>");
			System.out.println("<< 프로그램을 종료합니다. >>");
			System.exit(1);
			//=> 프로그램을 강제로 종료하는 메서드 System.exit(1);
			// 숫자 : 0 은 정상종료시, 다른값을 넣으면 비정상종료일때 사용
			// 숫자는 개발자가 보고 어떻게 종료되었는지 판단하기 위해 사용하는 것입니다.
		}
	}
	
	// DB 연결을 위한 메서드
	// java.sql.Connection
	// java.sql.Drivermanager
	public static final Connection getConnenction() throws Exception {
		return DriverManager.getConnection(URL, ID, PW);
	}
	
	// DB 닫는 메서드 (insert, update, delete 에 사용)
	// ReseltSet 사용 안한다.
	// java.sql.PreparedStatement
	public static final void close(Connection con, PreparedStatement pstmt)
		throws Exception {
		if (con != null) con.close();
		if (pstmt != null) pstmt.close();
	}
	/* 위 메서드를 다른 곳에서 사용한다면
	 * Connection con;
	 * PreparedStatement pstmt;
	 * ~~~~~~ 위 두변수를 사용해서 처리 ~~~~
	 * DB.close(con, pstmt);
	 */
	
	// DB 닫는 메서드 (select)
	// select를 진행하면 결과값이 ReseltSet 자료형 변수에 담깁니다.
	// java.sql.ResultSet
	public static final void close(Connection con,
		PreparedStatement pstmt, ResultSet rs) throws Exception {
		close(con, pstmt);
		if (rs != null) rs.close();
	}
	
	/*
	 * DB를 사용하기 위한 interface 3가지
	 * Connection : 접속을 하기위한 인터페이스입니다.
	 * PreparedStatement : SQL쿼리를 실행하기 위한 인터페이스입니다.
	 * ReseltSet : select 문의 결과값을 저장하는 인터페이스입니다.
	 * 
	 * 
	 */

}









