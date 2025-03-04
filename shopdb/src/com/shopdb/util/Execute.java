package com.shopdb.util;

import java.util.Arrays;

import com.shopdb.board.service.Service;

public class Execute {

	// 서비스를 실행시키고, 로그를 출력하는 메서드
	public static Object
		execute(Service service, Object obj) throws Exception {
		// 결과를 담아 리턴시킬 변수
		Object result = null;
		
		// 시작시간 저장
		Long start = System.nanoTime();
		// => 1970년 1월 1일 0시 부터 현재까지 시간은
		// ns 단위로 만들어 리턴하는 메서드 (ns = 10(-9승))
		
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("-     <실행 로그 출력>      -");
		System.out.println("--------------------------");
		// 실행객체 정보출력
		System.out.println("- 실행객체이름 : "
			+ service.getClass().getName());
		// => 패키지이름+클래스이름
		
		// 넘어가는 데이터 출력
		System.out.println("- 넘어가는 데이터 출력 : "
			+ ((obj instanceof Object[])
				?Arrays.toString((Object[])obj):obj));
		
		// 서비스 실행
		result = service.service(obj);
		
		// 끝나는 시간 저장
		Long end = System.nanoTime();
		
		// 결과 출력
		System.out.println("- 실행결과 : " + result);
		System.out.println("- 실행시간(ns) : " + (end - start));
		
		
		
		return result;
	}
}
