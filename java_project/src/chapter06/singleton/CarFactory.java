package chapter06.singleton;

// 싱글톤패턴으로 클래스를 구현합니다.
public class CarFactory {
	
	private CarFactory() {}
	
	private static CarFactory instance = new CarFactory();
	
	public static CarFactory getInstance() {
		if (instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
	
	public Car createCar() {
		return new Car();
	}
}
