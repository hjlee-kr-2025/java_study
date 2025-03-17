package com.report.service;

import com.report.dao.StudentDAO;

public class StudentListService implements Service {

	@Override
	public Object service(Object obj) throws Exception {
		// TODO Auto-generated method stub
		return new StudentDAO().list();
		/*
		 * StudentDAO dao = new StudentDAO();
		 * List<StudentVO> list = dao.list();
		 * return list;
		 */
	}

}
