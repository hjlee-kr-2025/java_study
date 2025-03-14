package com.report.service;

import com.report.dao.SubjectDAO;

public class SubjectWriteService implements Service {

	@Override
	public Object service(Object obj) throws Exception {
		// TODO Auto-generated method stub
		// 과목을 DB에 등록합니다.
		return new SubjectDAO().write((String)obj);
		// ==> write에 전달할 값이 obj로 전달받는다.
		// 이때 write 는 String type을 전달하고 obj는 Object type이기때문에
		// obj값을 String type으로 다운캐스팅합니다.
		// Object 클래스는 모든 클래스 자료형의 부모클래스이기 때문에
		// 모든 클래스자료형을 포용합니다.
		/* return new SubjectDAO().write((String)obj); 설명
		 * -----
		 * SubjectDAO dao = new SubjectDAO();
		 * Integer result = dao.write((String)obj);
		 * return result;
		 * 
		 */
	}

}
