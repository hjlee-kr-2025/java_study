package chapter08.customer;

public class CustomerTest {
	public static void main(String[] args) {
		Customer customerLee
			= new Customer(10010, "이순신");
		Customer customerKim
			= new VIPCustomer(10020, "김유신", 1000);
		customerLee.bonusPoint = 1000;
		customerKim.bonusPoint = 1000;
		System.out.println(customerLee.showInfo());
		System.out.println(customerKim.showInfo());
		
		System.out.println("=== 할인율과 보너스포인트 계산 ===");
		int price = 10000;
		int leePrice = customerLee.calcPrice(price);
		int kimPrice = customerKim.calcPrice(price);
		
		System.out.println(
			customerLee.getCustomerName()
			+ "님이 " + leePrice
			+ "원을 지불하였습니다.");
		System.out.println(customerLee.showInfo());
		System.out.println(
			customerKim.getCustomerName()
			+ "님이 " + kimPrice
			+ "원을 지불하였습니다.");
		System.out.println(customerKim.showInfo());
		
	}
}
