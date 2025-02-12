package chapter09.step1;

public class Bus extends Car {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("버스가 달립니다.");
	}

	@Override
	public void refuel() {
		// TODO Auto-generated method stub
		System.out.println("천연가스를 충전합니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("버스가 멈춥니다.");
	}
	
	public void takePassenger() {
		System.out.println("승객을 버스에 태웁니다.");
	}

}
