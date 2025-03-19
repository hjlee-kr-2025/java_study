package com.report.dao;

import java.util.ArrayList;
import java.util.List;

import com.report.util.DB;
import com.report.vo.SubjectScoreVO;

public class SubjectScoreDAO extends DAO {
	
	// 1. 수강신청확인 (학생 id로 리스트 확인) + 학생세부정보 수강과목및성적확인
	public List<SubjectScoreVO> list(Integer studentId) throws Exception {
		// 결과 저장할 변수 선언 - 리턴type과 동일 자료형으로 선언
		List<SubjectScoreVO> list = null;
		// 과목리스트를 가져오면? 
		// => 과목아이디 리스트를 가져옵니다.
		// => 수강과목이름을 알고싶죠? SubjectScoreVO에 subjectName 변수 추가
		try {
			// 1. (MySQL JDBC) 드라이버확인 - DB 클래스 static 메서드 구현
			// - 실행은 MainController-main() 메서드에서 한번만 실행
			// 2. DB 연결
			con = DB.getConnenction();// URL, ID, PW
			// 3. SQL 작성 - 하단 - LIST 상수
			// 4. 실행객체(pstmt) - SQL + 데이터 세팅
			pstmt = con.prepareStatement(LIST);
			pstmt.setInt(1, studentId);// LIST 쿼리문의 첫번째 ?
			// 5. 실행 + 결과리턴
			rs = pstmt.executeQuery();
			// 6. 결과 담기 및 확인
			if (rs != null) {
				while (rs.next()) {
					if (list == null) list = new ArrayList<SubjectScoreVO>();
					SubjectScoreVO vo = new SubjectScoreVO();
					vo.setSubjectId(rs.getInt("subjectId"));
					vo.setSubjectName(rs.getString("subjectName"));
					vo.setScore(rs.getInt("score"));
					list.add(vo);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			//7. DB닫기
			DB.close(con, pstmt, rs);
		}
		
		return list;
	} // end of list(Integer studentId)
	
	// 1-2. subjectId로 리스트 만들기
	public List<SubjectScoreVO> listSubjectId(Integer subjectId) throws Exception {
		// 결과 담을 변수
		List<SubjectScoreVO> list = null;
		
		try {
			// 1. 드라이버확인
			// 2. DB연결
			con = DB.getConnenction();
			// 3. SQL작성 - 상수 - LISTSUBJECTID
			System.out.println(LISTSUBJECTID);
			// 4. 실행객체 - SQL + 데이터 세팅 (?: 1개)
			pstmt = con.prepareStatement(LISTSUBJECTID);
			pstmt.setInt(1, subjectId);
			// 5. 실행 and 결과 리턴
			rs = pstmt.executeQuery();
			// 6. 결과 담기
			if (rs != null) {
				while(rs.next()) {
					if (list == null) list = new ArrayList<SubjectScoreVO>();
					
					SubjectScoreVO vo = new SubjectScoreVO();
					vo.setScoreId(rs.getInt("scoreId"));
					vo.setStudentId(rs.getInt("studentId"));
					vo.setStudentName(rs.getString("studentName"));
					vo.setScore(rs.getInt("score"));
					
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
		
		// 결과 리턴
		return list;
	} // end of listSubjectId(Integer subjectId)

	// 3. 수강신청 - insert - executeUpdate() 메서드로 쿼리실행
	public Integer write(SubjectScoreVO vo) throws Exception {
		// 결과 저장할 변수 선언
		Integer result = null;
		
		try {
			// 1. 드라이버확인
			// 2. DB연결
			con = DB.getConnenction();
			if (con != null) System.out.println("DB가 연결되었습니다.");
			// 3. SQL 작성 - 하단 WRITE
			System.out.println(WRITE);// 작성된 쿼리확인
			// 4. 실행객체에 SQL + 데이터 세팅
			pstmt = con.prepareStatement(WRITE);
			pstmt.setInt(1, vo.getStudentId());
			pstmt.setInt(2, vo.getSubjectId());
			System.out.println("4. 실행객체에 데이터세팅 완료---");
			// 5. 실행 및 결과리턴
			result = pstmt.executeUpdate();
			System.out.println("5. 쿼리 실행 완료---");
			// 6. 결과확인 - write() 리턴후
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			// 7. DB닫기
			DB.close(con, pstmt);
		}
		
		// 결과 리턴
		return result;
	} // end of write(SubjectScoreVO vo)
	
	// 4. 점수 등록
	public Integer updateScore(SubjectScoreVO vo) throws Exception {
		// 결과 받을 변수 선언
		Integer result = null;
		
		try {
			// 1. 드라이버 확인 - DB클래스 static메서드
			// - 로딩은 main메서드의 처음부분에 실행 - Class.forName()
			// 2. DB 연결 - 연결이 되면 Connection 인터페이스로 만든
			// con 변수가 활성화 - DB클래스에서 DriverManager 클래스를 이용해서 구현
			con = DB.getConnenction();
			// 3. SQL작성 - UPDATESCORE - 클래스하단 상수
			System.out.println(UPDATESCORE);
			// 4. 실행객체(pstmt) - SQL + 데이터세팅(? 2개)
			pstmt = con.prepareStatement(UPDATESCORE);
			pstmt.setInt(1, vo.getScore());
			pstmt.setInt(2, vo.getScoreId());
			// 5. 실행 & 결과 리턴
			result = pstmt.executeUpdate();
			// 6. 결과 확인 - return 후에 처리
			
			
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
	
	// SQL
	private static final String LIST = ""
			+ "select ss.subjectId, sj.subjectName, ss.score "
			+ " from subject as sj, subjectScore as ss "
			+ " where studentId = ? "// 일반조건
			+ " and sj.subjectId = ss.subjectId "; // 조인조건 (테이블 2개이상에서 데이터를 가져올때)
	private static final String LISTSUBJECTID = ""
			+ "select ss.scoreId, ss.studentId, st.studentName, ss.score "
			+ " from subjectScore as ss, student as st "
			+ " where subjectId = ? "
			+ " and ss.studentId = st.studentId ";
	
	private static final String WRITE = ""
			+ "insert into subjectScore (studentId, subjectId) "
			+ " values (?, ?)";
	
	private static final String UPDATESCORE = ""
			+ "update subjectScore set score = ? "
			+ " where scoreId = ?";
}








