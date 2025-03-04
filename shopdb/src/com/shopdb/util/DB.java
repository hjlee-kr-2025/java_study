package com.shopdb.util;

// 데이터 베이스에 연결하고 종료하는 것을 담당하는 클래스
public class DB {
	// DB에 접속하기 위해 필요한 상수를 선언합니다.
	private static final String DRIVER
		= "com.mysql.cj.jdbc.Driver";
	// ==> project -> Referenced Libraries
	// -> mysql-connector-j-8.4.0.jar
	// -> com.mysql.cj.jdbc 패키지 안에
	// -> Driver.class 위에 마우스 오른쪽 클릭
	// -> Copy Qualified Name 클릭
	// -> "" 안에 붙여넣기 후 .class 부분은 삭제
	// 접속에 사용되는 상수 선언 : URL, ID, PW
	// ===다른방법
	// Driver 치신후 [Ctrl]+[Space]로 com.mysql.cj.jdbc를 선택
	// import 에 적힌 com.mysql.cj.jdbc.Drive 를 카피후
	// "" 에 붙여넣기한다음 Driver클래스와 import부분을 삭제
	private static final String URL
		= "jdbc:mysql://localhost:3306/shopdb";


}
