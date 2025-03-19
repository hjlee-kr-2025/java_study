package com.report.dao;

import java.util.ArrayList;
import java.util.List;
import com.report.util.DB;
import com.report.util.Execute;
import com.report.util.StudentPrint;
import com.report.vo.StudentVO;

/* DAO 상속받은 이유는 DB 상호작용을 하기위한 변수 3가지를 사용하기 위해서입니다.
 * */
public class StudentDAO extends DAO {

	// 1. list - 학생리스트 : 학번 / 학과 / 이름
	public List<StudentVO> list() throws Exception {
		// 결과를 저장할 변수 선언
		List<StudentVO> list = null;
		
		try {
			// 1. 드라이버확인(Mysql의 JDBC드라이버) - DB클래스 static메서드에 구현
			// ===> main() 메서드가 실행할때 DB클래스를 로딩하였습니다.
			// 2. DB 연결
			con = DB.getConnenction();
			// 3. SQL 작성 - 클래스하단 LIST 상수에 구현합니다. 
			System.out.println(LIST);
			// 4. 실행객체에 SQL+데이터 세팅
			pstmt = con.prepareStatement(LIST);
			// 쿼리문에 ?가 없어서 세팅할 데이터는 없습니다.
			// 5. 실행 + 결과리턴
			rs = pstmt.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					if (list == null) list = new ArrayList<StudentVO>();
					StudentVO vo = new StudentVO();
					vo.setStudentId(rs.getInt("studentId"));
					vo.setDepartment(rs.getString("department"));
					vo.setStudentName(rs.getString("studentName"));
					
					list.add(vo);
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			// 7. DB 닫기
			DB.close(con, pstmt, rs);
		}
		
		// 결과를 리턴합니다.
		return list;
	} // end of list()
	
	// 2. 학생 상세보기 - 상세보기, 학번으로 학생이 있는지 체크
	public StudentVO view(Integer studentId) throws Exception {
		// 결과받을 변수 선언
		StudentVO vo = null;
		
		try {
			// 1. 드라이버확인
			// 2. DB연결
			con = DB.getConnenction();
			if (con != null) System.out.println("DB연결완료 ---");
			// 3. SQL 작성 - VIEW (클래스 하단)
			System.out.println(VIEW);
			// 4. 실행객체에 SQL + 데이터세팅
			pstmt = con.prepareStatement(VIEW);
			pstmt.setInt(1, studentId);
			// 5. 실행, 결과 리턴
			rs = pstmt.executeQuery();
			// 6. 결과 담기
			if (rs != null & rs.next()) {
				vo = new StudentVO();
				vo.setStudentId(rs.getInt("studentId"));
				vo.setDepartment(rs.getString("department"));
				vo.setStudentName(rs.getString("studentName"));
				vo.setTotalScore(rs.getInt("totalScore"));
				vo.setAvrScore(rs.getDouble("avrScore"));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			// 7. DB 닫기
			DB.close(con, pstmt, rs);
		}
		
		// 결과 리턴
		return vo;
	}
	
	// 3. 학생 정보 등록 - insert
	public Integer write(StudentVO vo) throws Exception {
		// 결과 저장 변수 선언
		Integer result = null;
		
		try {
			// 1. 드라이버확인 - DB클래스의 static 메서드에 있습니다.
			// 2. DB 연결
			con = DB.getConnenction();
			// 3. SQL작성 - WRITE 상수 (클래스하단)
			System.out.println(WRITE);
			// 4. 실행객체에 SQL + 데이터 세팅
			pstmt = con.prepareStatement(WRITE);
			// ? 개수만큼 set 사용, 첫번째? 가 1번
			pstmt.setString(1, vo.getDepartment());
			pstmt.setString(2, vo.getStudentName());
			// 5. 실행 및 결과 리턴
			result = pstmt.executeUpdate();
			// 6. 결과확인 - 리턴후 처리
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			//7. DB닫기
			DB.close(con, pstmt);
		}
		
		// 결과 리턴
		return result;
	} // end of write(StudentVO vo)
	
	private static final String LIST = ""
			+ "select studentId, department, studentName "
			+ " from student order by studentName";// 학생이름 가나다순 정렬
	private static final String VIEW = ""
			+ "select studentId, department, studentName, totalScore, "
			+ " avrScore from student where studentId = ?";
	private static final String WRITE = ""
			+ "insert into student (department, studentName) "
			+ " values (?, ?)";
}





