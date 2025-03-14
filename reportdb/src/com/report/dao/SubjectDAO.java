package com.report.dao;

import java.util.ArrayList;
import java.util.List;

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
	// 과목 만들기
	// 과목 리스트 보기
	
	// 1. 과목 리스트 보기
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
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			// 7. DB닫기
		}
		
		// 결과를 리턴
		return list;
	} // end of list()
	
	
	// SQL문
	private static final String LIST = ""
			+ "select subjectId, subjectName from subject";
}








