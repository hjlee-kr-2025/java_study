package com.shopping.util;

import com.shopping.board.service.Service;

public class Execute {

	// 서비스를 실행시키면서, 로그를 출력하는 메서드 입니다.
	// 1. 서비스 실행시간
	// 2. 서비스를 실행할 때 가지고 갈 데이터(매개변수) 출력
	// 3. 서비스 실행
	// 4. 서비스가 끝나고 리턴받는 데이터 출력
	public static Object 
		execute(Service service, Object obj)
			throws Exception {
		// 리턴값으로 사용할 변수
		// 여기서 return자료형을 Object로 한 이유는
		// 모든 자료형의 데이터를 리턴으로 사용할 수 있도록 만들기 위해서입니다.
		Object result = null;
		
		// 시작시간을 저장 - 서비스 실행시간 측정을 위해서
		Long start = System.nanoTime();// 10의 -9승 초단위
		// 1970년 1월 1일 0시 기준으로 현재까지의 시간
		
		System.out.println();
		System.out.println("-------------------------");
		System.out.println("---- << 실행로그출력 >> ----");
		System.out.println("-------------------------");
		
		// 실행객체 정보를 출력
		// service 객체를 클래스로 변경을 합니다. -> service.getClass();
		// ==> Object 클래스의 메서드 중 하나입니다.
		// 2. 클래스 이름을 패키지와 함께 가져옵니다
		// => getName(); 
		

		return result;
	} // end of execute()
}// end of class
