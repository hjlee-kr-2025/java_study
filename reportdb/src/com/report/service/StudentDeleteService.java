package com.report.service;

import com.report.dao.StudentDAO;

public class StudentDeleteService implements Service {

	// Controller -> (Execute) - 로그출력 -> Service -> DAO
	// DAO 의 하나의 메서드는 하나의 쿼리를 처리하도록 구성합니다.
	@Override
	public Object service(Object obj) throws Exception {
		// TODO Auto-generated method stub
		return new StudentDAO().delete((Integer)obj);
	}

}
