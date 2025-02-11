package chapter08.customerarray;

public class GoldCustomer extends Customer {
	public double saleRatio;
	
	public GoldCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.05;
	}

	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	
}
