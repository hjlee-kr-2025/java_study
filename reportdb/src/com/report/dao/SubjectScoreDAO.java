package com.report.dao;

import com.report.util.DB;
import com.report.vo.SubjectScoreVO;

public class SubjectScoreDAO extends DAO {

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
	
	
	// SQL
	private static final String WRITE = ""
			+ "inset into subjectScore (studentId, subjectId) "
			+ " values (?, ?)";
}
