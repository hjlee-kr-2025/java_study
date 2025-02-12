package chapter09.step2;

public abstract class Car {
	public abstract void startCar();
	public abstract void drive();
	public abstract void stop();
	public abstract void turnOff();
	public abstract void wiper();
	
	// 탬플릿 메서드
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
	}
}
