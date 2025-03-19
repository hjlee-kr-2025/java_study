package com.report.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

import com.report.util.DB;
import com.report.vo.SubjectVO;

public class SubjectDAO extends DAO {
	/* DAO 클래스에 있는
	 * Connection con;
	 * PreparedStatement pstmt;
	 * ReseltSet rs;
	 * 변수는 상속받아서 SubjectDAO에서 자유롭게 사용할 수 있습니다.
	 * Class에서 상속이란?
	 * 상속받은 클래스가 부모클래스의 멤버변수, 메서드를 자유롭게 사용할 수 있도록 하는것.
	*/
	/* 데이터베이스를 접근해서 처리하는 7단계
	 * 1. 드라이버확인 - 한번만 확인하면 끝
	 * 2. DB연결 - DB클래스 (URL, ID, PW)
	 * 3. SQL문작성 - 문자열, 넘길데이터 ?로 표시합니다.
	 * 4. 실행객체에 데이터(SQL+넘길데이터) 세팅 - ?는 1번부터 순서대로 세팅
	 * 5. 실행 + 결과받기 (ReseltSet or Integer)
	 * 6. 결과 처리
	 * 7. DB닫기 - DB클래스를 호출하여 처리
	 * 
	 */
	// 과목 만들기
	// 과목 리스트 보기
	
	// 1. 과목 리스트 보기 (select)
	public List<SubjectVO> list() throws Exception {
		// 결과 저장 변수 선언
		List<SubjectVO> list = null;
		
		// DB 프로그램을 본격 구현전 try~catch~finally 블럭을 구성하고
		// 시작합니다.
		try {
			// 1. 드라이버확인 (mysql 드라이버가 존재하는지 확인합니다)
			// --> DB 클래스 static 메서드로 구현.
			// 2. DB연결
			con = DB.getConnenction();
			// 3. SQL문(쿼리) 작성
			// 클래스 하단에 LIST 상수로 작성
			// 4. 실행객체에 SQL + 데이터 세팅
			pstmt = con.prepareStatement(LIST);
			// 5. SQL명령문실행 + 결과받기(ResultSet)
			rs = pstmt.executeQuery();
			/* 쿼리를 실행하는 메서드
			 * executeQuery() - return ==> ResultSet - select, insert, update, delete
			 * executeUpdate() - return ==> Integer - insert, update, delete
			 * 
			 */
			// 6. 결과 처리 (저장 또는 표현)
			if (rs != null) {
				// rs.next() 메서드는 현시점에서 다음값이 있는지를 확인합니다.
				while(rs.next()) {
					// 리스트가 안만들어 졌으면 생성합니다.
					if (list == null) list = new ArrayList<SubjectVO>();
					
					SubjectVO vo = new SubjectVO();
					vo.setSubjectId(rs.getInt("subjectId"));
					vo.setSubjectName(rs.getString("subjectName"));
					// ==> rs.getxxx(칼럼이름) 으로 값을 가져옵니다.
					// xxx 는 vo의 멤버 변수의 자료형에 따라서 사용하시면 됩니다.
					
					// DB에서 받은 데이터중 한 과목의 데이터 추가
					list.add(vo);
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			// 7. DB닫기
			DB.close(con, pstmt, rs);
		}
		/* try~catch~finally 블럭은 예외처리를 위한 블럭입니다.
		 * try 블럭은 정상적으로(예외가 발생할 수 있는) 실행되는 부분입니다.
		 * catch 블럭은 try 블럭을 실행중 예외가 발생했을때 명령문이 중단되고
		 * 실행되는 블럭입니다. (try블럭에서 예외발생 이후부분은 실행되지 않습니다)
		 * finally 블럭은 try블럭 또는 catch블럭이 끝나고 실행되는 블럭입니다.
		 *    try 또는 catch에 return 등으로 메서드가 끝나게 하더라고
		 *    finally는 실행하고 메서드가 끝나게 됩니다.
		 */
		
		// 결과를 리턴
		return list;
	} // end of list()
	
	// 2. 과목가져오기 (subjectId로)
	public SubjectVO view(Integer subjectId) throws Exception {
		// 결과 저장변수 선언
		SubjectVO vo = null;
		
		try {
			// 1. 드라이버확인 - 끝
			// 2. DB연결
			con = DB.getConnenction();
			// 3. SQL 작성 - VIEW - 클래스 하단 상수로 선언
			System.out.println(VIEW);
			// 4. 실행객체에 SQL 담고 ? 데이터 세팅 (?:1개)
			pstmt = con.prepareStatement(VIEW);
			pstmt.setInt(1, subjectId);
			// 5. 실행 및 결과 리턴
			rs = pstmt.executeQuery();
			// 6. 결과 담기
			if (rs != null && rs.next()) {
				vo = new SubjectVO();
				vo.setSubjectId(rs.getInt("subjectId"));
				vo.setSubjectName(rs.getString("subjectName"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			// 7. DB닫기
			DB.close(con, pstmt, rs);
		}
		
		
		// 결과 리턴
		return vo;
	}
	
	// 3. 과목등록 (insert) 
	public Integer write(String subjectName) throws Exception {
		// 결과 저장할 변수 선언
		Integer result = null;
		
		try {
			// 1. 드라이버확인 - 이미확인완료
			// 2. DB연결
			con = DB.getConnenction();
			// 3. SQL작성 - 클래스하단에 WRTIE로 작성.
			// 4. 실행객체 SQL + 데이터 세팅
			pstmt = con.prepareStatement(WRITE);
			pstmt.setString(1, subjectName);
			// => 쿼리문의 첫번째 ?가 1번이고 순서대로 번호를 지정합니다. 
			// 5. 실행 및 결과받기 - insert, update, delete : executeUpdate() return Integer 
			result = pstmt.executeUpdate();
			// 6. 결과 확인 
			// return 이후에 처리
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			// 7. DB닫기
			DB.close(con, pstmt);
		}
		
		// 결과 리턴
		return result;
	}
	
	// 4. 과목명 수정 - subjectId, 수정된 subjectName
	public Integer update(SubjectVO vo) throws Exception {
		// 결과 담을 변수 선언
		Integer result = null;
		
		try {
			// 1. 드라이버 확인
			// 2. DB연결
			con = DB.getConnenction();
			// 3. SQL 작성 - UPDATE - 클래스하단 상수로 선언
			System.out.println(UPDATE);
			// 4. 실행객체(pstmt)에 SQL을 담고 데이터세팅 (?: 2개)
			pstmt = con.prepareStatement(UPDATE);
			pstmt.setString(1, vo.getSubjectName());
			pstmt.setInt(2, vo.getSubjectId());
			// 5. 실행 및 결과 리턴
			result = pstmt.executeUpdate();
			// 6. 결과 확인 - 리턴후 처리
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			// 7. DB닫기
			DB.close(con, pstmt);
		}
		
		// 결과 리턴
		return result;
	} // end of update(SubjectVO vo)
	
	// 5. 과목삭제
	public Integer delete(Integer subjectId) throws Exception {
		// 결과 저장 변수 선언
		Integer result = null;
		
		try {
			// 1. 드라이버확인
			// 2. DB연결
			con = DB.getConnenction();
			// 3. SQL작성 - DELETE - 클래스 하단 상수선언
			System.out.println(DELETE);
			// 4. 실행객체(pstmt)에 SQL을 담고 데이터를 세팅 (?: 1개)
			pstmt = con.prepareStatement(DELETE);
			pstmt.setInt(1, subjectId);
			// 5. 실행 및 결과 리턴
			result = pstmt.executeUpdate();
			// 6. 결과확인 - 리턴후 처리
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			// 7. DB닫기
			DB.close(con, pstmt);
		}
		
		// 결과 리턴
		return result;
	}
	
	// 6. subjectId check
	public Integer checkSubjectId(Integer subjectId) throws Exception {
		// 결과 저장 변수
		Integer result = null;
		
		try {
			// 1. 드라이버확인
			// 2. DB연결
			con = DB.getConnenction();
			// 3. SQL 작성 - 상수 CHECKSUBJECTID
			// 4. 실행객체 - SQL + 데이터 세팅
			pstmt = con.prepareStatement(CHECKSUBJECTID);
			pstmt.setInt(1, subjectId);
			// 5. 실행 및 결과 리턴
			rs = pstmt.executeQuery();
			if (rs != null && rs.next()) {
				result = rs.getInt("subjectId");
			}
			// 6. 결과확인은 return 후에 처리
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			// 7. DB닫기
			DB.close(con, pstmt, rs);
		}
		
		// 결과 리턴
		return result;
	}
	
	
	// SQL문
	private static final String LIST = ""
			+ "select subjectId, subjectName from subject";
	private static final String VIEW = ""
			+ "select subjectId, subjectName from subject "
			+ " where subjectId = ?";
	
	private static final String WRITE = ""
			+ "insert into subject (subjectName) values (?)";
	// ? 은 사용자로 부터 입력받는 데이터 입니다.
	private static final String UPDATE = ""
			+ "update subject set subjectName = ? "
			+ " where subjectId = ?";
	
	private static final String DELETE = ""
			+ "delete from subject where subjectId = ?";
	
	private static final String CHECKSUBJECTID = ""
			+ "select subjectId from subject where subjectId = ?";
	// => subjectId에 맞는 id가 DB에 존재하면 subjectId를 리턴하고
	// 없으면 null 값을 리턴합니다. (리턴받는자료형 ResultSet)
}








