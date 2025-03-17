package com.report.service;

import com.report.dao.StudentDAO;
import com.report.vo.StudentVO;

public class StudentWriteService implements Service {

	@Override
	public Object service(Object obj) throws Exception {
		// TODO Auto-generated method stub
		return new StudentDAO().write((StudentVO)obj);
	}

}
