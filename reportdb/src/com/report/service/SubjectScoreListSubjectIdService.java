package com.report.service;

import com.report.dao.SubjectScoreDAO;

public class SubjectScoreListSubjectIdService implements Service {

	@Override
	public Object service(Object obj) throws Exception {
		// TODO Auto-generated method stub
		return new SubjectScoreDAO().listSubjectId((Integer)obj);
	}

}
