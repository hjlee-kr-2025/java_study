package com.report.service;

import com.report.dao.StudentDAO;

public class StudentViewService implements Service {

	@Override
	public Object service(Object obj) throws Exception {
		// TODO Auto-generated method stub
		return new StudentDAO().view((Integer)obj);
	}

}
