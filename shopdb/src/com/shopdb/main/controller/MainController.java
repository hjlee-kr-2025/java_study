package com.shopdb.main.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MainController {
	private static final String DRIVER
		= "com.mysql.cj.jdbc.Driver";
	private static final String URL
		= "jdbc:mysql://localhost:3306/shopdb";
	private static final String ID
		= "java";
	private static final String PW
		= "java";

	public static void main(String[] args) {
		
		ArrayList<> list = new ArrayList<E>();
		
		// 1. 드라이버 확인
		try {
			Class.forName(DRIVER);
			System.out.println("MySQL 드라이버 확인완료");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			// 2. DB 연결
			Connection con = DriverManager.getConnection(URL, ID, PW);
			// 3. SQL 쿼리를 만들어 줍니다.
			String list = ""
					+ "select no, title, writer, writeDate, "
					+ " hit from board order by no desc "
					+ "";
			// select no, title, writer, writeDate, hit
			// from board order by no desc;
			// 4. 실행객체에 SQL 세팅
			PreparedStatement pstmt = con.prepareStatement(list);
			// 5. 실행, 결과를 담습니다.
			ResultSet rs = pstmt.executeQuery();
			// 6. 데이터 표시 또는 저장(클라이언트)
			if (rs != null) {
				while (rs.next()) {
					
				}
			}
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
