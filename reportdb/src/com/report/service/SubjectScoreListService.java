package com.report.service;

import com.report.dao.SubjectScoreDAO;

public class SubjectScoreListService implements Service {

	@Override
	public Object service(Object obj) throws Exception {
		// TODO Auto-generated method stub
		// SubjectScoreListService 실행시 studentId가 매개변수로
		// 전달받습니다. 중간에 Object 자료형으로 형변환되어서
		// list 메서드로 넘길때 Integer로 다운캐스팅하여 전달합니다.
		return new SubjectScoreDAO().list((Integer)obj);
	}

}
