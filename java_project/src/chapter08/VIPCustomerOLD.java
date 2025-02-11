package chapter08;

public class VIPCustomerOLD {
	private int customerId;
	private String customerName;
	private String customerGrade;
	public int bonusPoint;
	public double bonusRatio;
	
	private int agentId;	// VIP전담 상담원 id
	public double saleRatio;	// 할인율
	
	public VIPCustomerOLD() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	// 정가를 받아서 적립 과 할인을 하는 메서드
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	public int getAgentId() {
		return agentId;
	}
	
	public String showInfo() {
		return (
			customerName + "님의 등급은 "
			+ customerGrade + "이며, 보너스 포인트는 "
			+ bonusPoint + "입니다."
		);
	}
}
