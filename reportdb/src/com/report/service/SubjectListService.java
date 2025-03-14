package com.report.service;

import com.report.dao.SubjectDAO;

public class SubjectListService implements Service{

	@Override
	public Object service(Object obj) throws Exception {
		// TODO Auto-generated method stub
		// subject 테이블의 리스트를 가져옵니다.
		return new SubjectDAO().list();
	}

}
