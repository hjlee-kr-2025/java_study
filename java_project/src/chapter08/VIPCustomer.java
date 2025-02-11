package chapter08;

public class VIPCustomer extends Customer{
	private int agentId;
	public double saleRatio;
	
	public VIPCustomer() {
		// Customer 클래스에 상속받아 사용합니다.
		customerGrade = "VIP";
		// Customer 클래스에서 상속받아 사용합니다.
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	public int getAgentId() {
		return agentId;
	}
}
