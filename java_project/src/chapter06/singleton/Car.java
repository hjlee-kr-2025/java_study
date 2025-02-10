package chapter06.singleton;

public class Car {
	private static int serialNum = 10000;
	private int carNum;
	
	// 생성자
	public Car() {
		// static변수 serialNum을 1증가
		serialNum++;
		// carNum 에 serialNum을 대입
		carNum = serialNum;
		
		// 생성할 때마다 1증가한 serialNum를
		// 자동으로 carNum에 대입합니다.
	}
	
	// getter (carNum)
	public int getCarNum() {
		return carNum;
	}
}
