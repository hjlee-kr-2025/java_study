package chapter12.question;

import java.util.HashMap;
/*
 * HashMap 클래스를 가지고 데이터 저장
 * Map 인터페이스를 상속받아 구현
 * Map 인터페이스의 특징은 <Key, Value> 로 이루어진 쌍(pair)데이터가
 * 하나의 데이터
 * Key는 유일(중복값이 허용안됨)
 * Value를 찾을때 Key값으로 찾습니다.
 */

public class CarFactory {
	private static CarFactory instance
		= new CarFactory();
	HashMap<String, Car> carMap
		= new HashMap<String, Car>();
	// 싱글톤패턴으로 클래스 구성
	private CarFactory() {}
	public static CarFactory getInstance() {
		if (instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
	// Car 로 만들어진 데이터 추가
	public Car CreateCar(String name) {
		// 이미 등록된 이름이 있는지 체크
		if (carMap.containsKey(name)) {
			return carMap.get(name);
		}
		Car car = new Car();
		carMap.put(name, car);
		return car;
	}
}
