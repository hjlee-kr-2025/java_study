package chapter08.customer;

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
	
	// 매개변수가 있는 생성자
	public VIPCustomer(int customerId,
			String customerName, int agentId) {
		//this.customerId = customerId;
		//this.customerName = customerName;
		// 매개변수가 있는 부모생성자 호출
		super(customerId, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentId = agentId;
		System.out.println("VIPCustomer(int, String, int) 생성자");
	}
	
	public int getAgentId() {
		return agentId;
	}

	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	// => Customer 클래스에 있는 calcPrice(int) 메서드를
	// 재정의 하였습니다.
	// @ 붙어있는 예약어를 어노테이션(애노테이션, annotation)이라고 합니다.

	@Override
	public String showInfo() {
		// TODO Auto-generated method stub
		return (
			super.showInfo() + "담당 상담원 아이디는 "
			+ agentId + "입니다."
		);
	}

	
	
	
	
}
