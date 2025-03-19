package com.report.service;

import com.report.dao.SubjectDAO;
import com.report.vo.SubjectVO;

public class SubjectUpdateService implements Service {

	@Override
	public Object service(Object obj) throws Exception {
		// TODO Auto-generated method stub
		return new SubjectDAO().update((SubjectVO)obj);
	}

}
