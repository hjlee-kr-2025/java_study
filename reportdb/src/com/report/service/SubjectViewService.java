package com.report.service;

import com.report.dao.SubjectDAO;

public class SubjectViewService implements Service {

	@Override
	public Object service(Object obj) throws Exception {
		// TODO Auto-generated method stub
		return new SubjectDAO().view((Integer)obj);
	}

}
