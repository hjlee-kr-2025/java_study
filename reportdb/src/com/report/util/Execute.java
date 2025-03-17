package com.report.util;

import java.util.Arrays;

import com.report.service.Service;

// 1. 실행되는 service종류
// 2. service 처리시간
// 3. service 실행시 들어가는 데이터
// 4. service 실행후 나오는 데이터
// 위의 값을 개발자가 확인할 수 있도록 구성합니다.
public class Execute {

	public static Object execute(Service service, Object obj)
		throws Exception {
		// 처리된 결과를 저장하는 변수
		Object result = null;
		
		System.out.println("----------------------------------------");
		System.out.println("<<<<       실행    로그    출력        >>>>");
		System.out.println("----------------------------------------");
		
		// 시작 시간 저장 : 단위 ns
		Long start = System.nanoTime();
		// System.nanoTime()
		// ===> 1970년 1월 1일 0시 0분 0초를 기준으로 현재시간까지를 nano second
		// 단위로 만든 결과를 리턴하는 메서드 입니다.
		
		// 실행객체를 출력합니다. (어떠한 서비스가 실행되는지)
		// 1. service 인터페이스객체를 클래스객체로 변경합니다.
		// service.getClass() 를 사용 -> Class 클래스 타입으로 리턴됩니다.
		// => service 가 어떤 클래스로 생성되었는지 알려줍니다.
		// 2. 클래스이름을 패키지와 함께 리턴합니다.
		// Class class 내의 getName() 메서드 이용
		System.out.println("실행 객체 이름 : " + service.getClass().getName());
		// SubjectListService를 실행했다면
		// 실행 객체 이름 : com.report.service.SubjectListService
		
		// 서비스로 전달되는 데이터를 출력
		// 배열인지 아닌지
		String putSeriveData = null;
		if (obj instanceof Object[]) {
			putSeriveData = Arrays.toString((Object[])obj);
			// Arrays.toString(); 은 배열자료형의 모든데이터를 문자열로 변환해줍니다.
		}
		else if (obj != null){
			putSeriveData = obj.toString();
		}
		System.out.println("서비스로 넘어가는 데이터 : " + putSeriveData);
		// 위 구현 내용을 3항연산자를 사용해서 표현해 봤습니다.
		System.out.println("서비스로 넘어가는 데이터 : " + 
			(
				(obj instanceof Object[])?Arrays.toString((Object[])obj):obj
			)
		);
		// 위의 서버스로 넘어가는 데이터는 둘 중 하나 자신이 편한것을
		// 사용하시면 됩니다.
		
		
		// 서비스 실행
		result = service.service(obj);
		// ==> Service 인터페이스를 만든이유 service.service(obj) 메서드로
		// 모든 서비스가 실행될 수 있도록 하기 위해서
		
		// 결과데이터 출력
		System.out.println("결과 데이터 : " + result);
		
		// 끝나는 시간 저장
		Long end = System.nanoTime();
		// 실행 시간 출력
		System.out.println("실행 시간 : " + (end - start));
		System.out.println("----------------------------------------");
		
		// 결과를 리턴합니다.
		return result;
	} // end of execute(Service service, Object obj)
	
	// Controller -> Execute.execute() -> Service
	// 결과값(return) Service -> Execute.execute() -> Controller
	
	
	
}
