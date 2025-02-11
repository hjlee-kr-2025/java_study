package chapter08;
// 상속
// 접근제어자 : protected 예약어
// 상속받는 class에서는 접근할 수 있습니다.
// protected 예약어를 사용한 변수는
// 일반적으로는 private 과 동일한 특성을 같습니다.
// 예외적으로 상속받는 클래스는 자신의 클래스 처럼
// 동일하게 사용할 수 있습니다.
public class Customer {
	protected int customerId;			// 고객id
	protected String customerName;	// 고객이름
	protected String customerGrade;	// 고객등급
	public int bonusPoint;			// 보너스포인트
	public double bonusRatio;		// 적립비율
	
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	// 제품가격으로 보너스 포인트를 적립하는 메서드
	public int calcPrice(int price) {
		bonusPoint += (price * bonusRatio);
		return price;
	}
	
	// 회원정보 리턴
	public String showInfo() {
		return (
			customerName + "님의 등급은 "
			+ customerGrade + "이며, 보너스 포인트는 "
			+ bonusPoint + "입니다."
		);
	}
	
	// source 단축키 shift + alt + s
	public int getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
}
