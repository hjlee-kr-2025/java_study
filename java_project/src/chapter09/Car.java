package chapter09;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	final public void run() {
		// 탬플릿메서드 : 프로그램의 진행순서가 정해진 함수
		startCar();
		drive();
		stop();
		turnOff();
	}
}
