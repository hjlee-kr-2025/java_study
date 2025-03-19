package com.report.service;

import com.report.dao.StudentDAO;
import com.report.dao.SubjectScoreDAO;

public class StudentDeleteService implements Service {

	// Controller -> (Execute) - 로그출력 -> Service -> DAO
	// DAO 의 하나의 메서드는 하나의 쿼리를 처리하도록 구성합니다.
	@Override
	public Object service(Object obj) throws Exception {
		// TODO Auto-generated method stub
		// studentId를 FK 로 사용한 데이터를 전부 삭제합니다.
		new SubjectScoreDAO().deleteStudentId((Integer)obj);
		
		return new StudentDAO().delete((Integer)obj);
	}

}
