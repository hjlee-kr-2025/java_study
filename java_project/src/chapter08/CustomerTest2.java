package chapter08;

public class CustomerTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerId(10020);
		customerKim.setCustomerName("김유신");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showInfo());
	}

}
