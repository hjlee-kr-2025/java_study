package chapter12.question;

public class CarTest {
	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		Car sonata1 = factory.CreateCar("연수 차");
		Car sonata2 = factory.CreateCar("연수 차");
		System.out.println(sonata1 == sonata2);
		// true
		
		Car avante1 = factory.CreateCar("승연 차");
		Car avante2 = factory.CreateCar("승연 차");
		System.out.println(avante1 == avante2);
		// true
		System.out.println(sonata1 == avante1);
		// false
	}
	// ArrayList, HashMap 을 위주로 설명을 진행합니다.
}
