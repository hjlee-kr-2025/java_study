package chapter09.step1;

public class AutoCar extends Car {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("자동차가 달립니다.");
	}

	@Override
	public void refuel() {
		// TODO Auto-generated method stub
		System.out.println("휘발류를 주유합니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("자동차가 멈춥니다.");
	}
	
	public void load() {
		System.out.println("짐을 싣습니다.");
	}

}
