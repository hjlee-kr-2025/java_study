package com.report.service;

import com.report.dao.SubjectDAO;
import com.report.dao.SubjectScoreDAO;

public class SubjectDeleteService implements Service {

	@Override
	public Object service(Object obj) throws Exception {
		// TODO Auto-generated method stub
		// subjectScore 테이블에서 subjectId를 사용한 자료 삭제 처리
		new SubjectScoreDAO().deleteSubjectId((Integer)obj);
		
		return new SubjectDAO().delete((Integer)obj);
	}

}
