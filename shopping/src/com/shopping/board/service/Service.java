package com.shopping.board.service;

/*
 * 인터페이스 : interface
 * - 추상메서드만 가진 클래스 ==> 인터페이스로 만들자고 약속
 * - 추상메서드는 abstract 예약어와 함께 선언만 되어있습니다.
 * - 인터페이스에는 메서드 선언시 abstract 예약어 생략이 가능합니다.
 * - 단독으로 사용할 수 없고, 상속을 주어서 사용해야 합니다.
 * - 상속받은 클래스는 추상메서드를 구현(구성) 해서 사용합니다.
 */

public interface Service {

	// 서비스시 실행해야 할 메서드 선언
	public Object service(Object obj) throws Exception;
}
