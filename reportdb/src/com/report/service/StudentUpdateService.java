package com.report.service;

import com.report.dao.StudentDAO;
import com.report.vo.StudentVO;

public class StudentUpdateService implements Service {

	@Override
	public Object service(Object obj) throws Exception {
		// TODO Auto-generated method stub
		return new StudentDAO().update((StudentVO)obj);
	}

}
