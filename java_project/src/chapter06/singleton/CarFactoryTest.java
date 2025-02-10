package chapter06.singleton;

public class CarFactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 싱글톤 패턴으로 CarFactory 클래스 개발
		CarFactory factory = CarFactory.getInstance();
		// 메서드에서 Car 클래스를 생성 carNum을 자동으로 부여
		Car mySonata = factory.createCar();
		Car yourSonata = factory.createCar();
		System.out.println(mySonata.getCarNum());
		System.out.println(yourSonata.getCarNum());
	}

}
