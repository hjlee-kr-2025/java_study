package chapter08;
// Customer, VIPCustomer
public class CustomerTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customerLee = new Customer();
		customerLee.setCustomerId(10010);
		customerLee.setCustomerName("이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showInfo());
		
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerId(10020);
		customerKim.setCustomerName("김유신");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showInfo());
		
	}

}
