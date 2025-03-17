package com.report.service;

import com.report.dao.SubjectScoreDAO;
import com.report.vo.SubjectScoreVO;

public class SubjectScoreWriteService implements Service {

	@Override
	public Object service(Object obj) throws Exception {
		// TODO Auto-generated method stub
		return new SubjectScoreDAO().write((SubjectScoreVO)obj);
	}

}
