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
			// 5. 실행 및 결과받기
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
	
	
	// SQL문
	private static final String LIST = ""
			+ "select subjectId, subjectName from subject";
	private static final String WRITE = ""
			+ "insert into subject (subjectName) values (?)";
	// ? 은 사용자로 부터 입력받는 데이터 입니다.
}








