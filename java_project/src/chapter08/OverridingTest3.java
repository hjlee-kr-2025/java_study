package chapter08;

public class OverridingTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price = 10000;
		
		Customer customerLee = new Customer(10010, "이순신");
		System.out.println(
			customerLee.getCustomerName()
			+ " 님이 지불해야 하는 금액은 "
			+ customerLee.calcPrice(price)
			+ " 원 입니다.");
		
		VIPCustomer customerKim =
			new VIPCustomer(10020, "김유신", 1000);
		System.out.println(
				customerKim.getCustomerName()
				+ " 님이 지불해야 하는 금액은 "
				+ customerKim.calcPrice(price)
				+ " 원 입니다.");
		
		Customer vc = new VIPCustomer(10030, "나몰라", 1001);
		System.out.println(
				vc.getCustomerName()
				+ " 님이 지불해야 하는 금액은 "
				+ vc.calcPrice(price)
				+ " 원 입니다.");
	}

}
