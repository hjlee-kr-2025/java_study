package com.shopdb.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.shopdb.board.vo.BoardVO;
import com.shopdb.util.DB;

public class BoardDAO {
	// DB 연결에 필요한 변수 선언
	// Connection -> DB 연결을 위해 필요
	public Connection con = null;
	// PreparedStatement -> DB 사용을 위해 DML문 작성시 필요
	public PreparedStatement pstmt = null;
	// select 를 사용하여 DB에서 넘어오는 데이터 확인(담긴다)
	public ResultSet rs = null;
	
	// 1. 리스트 처리
	public List<BoardVO> list() throws Exception {
		// 결과를 저장할 변수
		List<BoardVO> list = null;
		
		try {
			// 1. 드라이버 확인
			// DB Class 에서 static 메서드로 구현
			// 2. DB 연결
			con = DB.getConnection();
			// 3. LIST SQL쿼리 작성
			// --> DAO 클래스 하단 final 변수로 작성
			// 4. 실행객체 & 데이터세팅
			// 리스트는 쿼리문만 있으면 됩니다.
			pstmt = con.prepareStatement(LIST);
			// 5. 쿼리문실행 & 결과데이터 리턴
			rs = pstmt.executeQuery();
			// 6. 결과데이터 표시 또는 담기
			if (rs != null) {
				while (rs.next()) {
					if (list == null) list = new ArrayList<BoardVO>();
					//rs에 담긴 데이터 -> vo로 담은후 list에 추가
					BoardVO vo = new BoardVO();
					vo.setNo(rs.getInt("no"));
					vo.setTitle(rs.getString("title"));
					vo.setWriter(rs.getString("writer"));
					vo.setWriteDate(rs.getString("writeDate"));
					vo.setHit(rs.getInt("hit"));
					
					list.add(vo);
				}
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			// 7. DB 연결닫기 (select)
			DB.close(con, pstmt, rs);
		}
		
		return list;
	}
	
	// 2-1. 글보기 - 조회수 증가
	public Integer increse(Integer no) throws Exception {
		// 결과 저장 변수 선언
		Integer result = 0;
		
		try {
			// 1. 드라이버 확인
			// 처음에 해줬습니다 DB의 static 메서드로 구현
			// 2. DB 연결
			con = DB.getConnection();
			// 3. SQL 작성 - INCREASE (클래스 하단에 작성)
			// 4. 실행객체에 SQL + 데이터세팅
			pstmt = con.prepareStatement(INCREASE);
			// 쿼리문의 ? 에 담을 값을 세팅
			// 처음나오는 ? 가 1번입니다.
			pstmt.setInt(1, no);
			// 5. 실행, 실행결과 리턴
			result = pstmt.executeUpdate();
			/* select : pstmt.executeQuery()
			 * insert, update, delete : pstmt.executeUpdate()
			 */
			// 6. 데이터 표시 또는 담기
			if (result == 0) {
				throw new Exception("예외 발생 : 글 번호가 존재하지 않습니다."
						+ " 정보를 확인해 주세요.");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			if (e.getMessage().indexOf("예외 발생") >= 0) throw e;
			else throw new Exception("예외 발생 : 조회수 1증가 DB처리중 오류 발생");
		} finally {
			// 7. DB 닫기 (update)
			DB.close(con, pstmt);
		}
		
		return result;
	}
	
	// 2-2 글보기 - 상세보기
	public BoardVO view(Integer no) throws Exception {
		// 결과저장할 변수
		BoardVO vo = null;
		
		try {
			// 1. 드라이버확인 (mysql)
			// - DB 클래스의 static 메서드로 구현
			// 2. DB 연결
			con = DB.getConnection();
			// 3. SQL작성 - VIEW (클래스 하단)
			// 4. 실행객체에 SQL + 데이터 세팅
			pstmt = con.prepareStatement(VIEW);
			pstmt.setInt(1, no);
			// 5. 실행 : select -> rs -> executeQuery()
			rs = pstmt.executeQuery();
			// 6. 데이터 담습니다.
			if (rs != null && rs.next()) {
				// rs -> vo
				vo = new BoardVO();
				vo.setNo(rs.getInt("no"));
				vo.setTitle(rs.getString("title"));
				vo.setContent(rs.getString("content"));
				vo.setWriter(rs.getString("writer"));
				vo.setWriteDate(rs.getString("writeDate"));
				vo.setHit(rs.getInt("hit"));
				vo.setPw(rs.getString("pw"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			// 7. DB닫기 (select)
			DB.close(con, pstmt, rs);
		}
		
		return vo;
	}
	
	// 3. 글쓰기
	public Integer write(BoardVO vo) throws Exception {
		// 결과 저장 변수 선언
		Integer result = 0;
		
		try {
			// 1. 드라이버확인 (mysql)
			// DB클래스의 static 메서드로 구현
			// 2. DB 연결
			con = DB.getConnection();
			// 3. SQL 작성 : WRITE (클래스 하단) ? : 4개
			// 4. 실행객체에 SQL + 데이터 세팅
			pstmt = con.prepareStatement(WRITE);
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getContent());
			pstmt.setString(3, vo.getWriter());
			pstmt.setString(4, vo.getPw());
			// 5. 실행
			result = pstmt.executeUpdate();
			// 6. 데이터 표시 & 실행결과 확인
			if (result != 0) {
				System.out.println("글이 등록되었습니다.");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new Exception("예외 발생 : 게시판 글등록 DB 처리중 오류발생");
		} finally {
			// 7. DB 닫기 (insert)
			DB.close(con, pstmt);
		}
		
		return result;
	}
	
	// 4. 글수정
	public Integer update(BoardVO vo) throws Exception {
		// 결과 저장 변수 선언
		Integer result = 0;
		
		try {
			// 1. 드라이버 확인
			// DB 클래스 static 메서드로 구현
			// 2. DB연결
			con = DB.getConnection();
			// 3. SQL 작성 - UPDATE (클래스하단) : ?(5개)
			// 4. 실행객체에 SQL + 데이터 세팅
			pstmt = con.prepareStatement(UPDATE);
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getContent());
			pstmt.setString(3, vo.getWriter());
			pstmt.setInt(4, vo.getNo());
			pstmt.setString(5, vo.getPw());
			// 5. 실행
			result = pstmt.executeUpdate();
			// 6. 결과확인
			if (result == 0) {
				throw new Exception("예외 발생 : 글번호나"
					+ " 비밀번호가 맞지 않습니다."
					+ " 정보를 확인해 주세요.");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			if (e.getMessage().indexOf("예외 발생") >= 0) throw e;
			else throw new Exception("예외 발생 : 글수정 DB"
					+ "처리중 오류 발생");
		} finally {
			// 7. DB닫기 (update)
			DB.close(con, pstmt);
		}
		
		return result;
	}
	
	// 5. 글삭제
	public Integer delete(BoardVO vo) throws Exception {
		// 결과 저장 변수 선언
		Integer result = 0;
		
		try {
			// 1. 드라이버 확인
			// DB 클래스 - static 메서드로 구현
			// 2. DB 연결
			con = DB.getConnection();
			// 3. SQL 작성 - DELETE (클래스 하단) : ?(2개)
			// 4. 실행객체에 SQL + 데이터 세팅
			pstmt = con.prepareStatement(DELETE);
			pstmt.setInt(1, vo.getNo());
			pstmt.setString(2, vo.getPw());
			// 5. 실행
			result = pstmt.executeUpdate();
			// 6. 결과 확인
			if (result == 0) {
				throw new Exception("예외 발생 : 글번호나 비밀번호가"
						+ " 맞지 않습니다."
						+ " 정보를 확인해 주세요.");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			if (e.getMessage().indexOf("예외 발생") >= 0) throw e;
			else throw new Exception("예외 발생 : 글삭제 DB 처리중"
					+ " 오류 발생");
		} finally {
			// 7. DB닫기 (delete)
			DB.close(con, pstmt);
		}
		
		return result;
	}
	
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
