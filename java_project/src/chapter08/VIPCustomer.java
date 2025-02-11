package chapter08;

public class VIPCustomer extends Customer{
	private int agentId;
	public double saleRatio;
	
	public VIPCustomer() {
		super();// 생성자 -> 부모클래스의 생성자
		// super()를 생략해도 실행시 자동으로 호출합니다.
		
		// Customer 클래스에 상속받아 사용합니다.
		customerGrade = "VIP";
		// Customer 클래스에서 상속받아 사용합니다.
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer() 생성자");
	}
	
	public int getAgentId() {
		return agentId;
	}
}
