package chapter08;

public class CustomerTest3 {
	public static void main(String[] args) {
		VIPCustomer customerKim = 
				new VIPCustomer(10020, "김유신", 1000);
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showInfo());
	}
}
