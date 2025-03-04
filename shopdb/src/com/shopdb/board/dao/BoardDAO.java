package com.shopdb.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BoardDAO {
	// DB 연결에 필요한 변수 선언
	// Connection -> DB 연결을 위해 필요
	public Connection con = null;
	// PreparedStatement -> DB 사용을 위해 DML문 작성시 필요
	public PreparedStatement pstmt = null;
	// select 를 사용하여 DB에서 넘어오는 데이터 확인(담긴다)
	public ResultSet rs = null;
	
	
	
	
	
	// MYSQL DML 을 위한 명령문 작성
	// 리스트를 가져오는 쿼리
	final String LIST = "select no, title, writer, "
		+ " date_format(writeDate, '%Y-%m-%d') as writeDate, "
	    + " hit from board order by no desc";
	//글보기에 사용되는 쿼리
	final String VIEW = "select no, title, content, writer, "
		+ " date_format(writeDate, '%Y-%m-%d') as writeDate, "
	    + " hit, pw from board where no = ?";
	// 조회수 증가
	final String INCREASE = "update board set "
		+ " hit = hit + 1 where no = ?";
	// 글쓰기
	final String WRITE = "insert into board "
		+ " (title, content, writer, pw) " 
		+ " values (?, ?, ?, ?)";
	// 글수정
	final String UPDATE = "update board set "
		+ " title=?, content=?, writer=? "
		+ " where no=? and pw=?";
	// 글삭제
	final String DELETE = "delete from board "
		+ " where no=? and pw=?";


}
