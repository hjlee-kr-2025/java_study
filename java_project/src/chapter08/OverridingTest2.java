package chapter08;
// 클래스 형변환에 대한 내용
public class OverridingTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customerLee =
			new VIPCustomer(10010, "이순신", 1000);
		// 부모클래스로 변수명을 선언하고, 생성시 자녀클래스로
		// 생성하는 것을 클래스 형변환이라고 합니다.
		
		customerLee.bonusPoint = 1000;
		
		int price = 10000;
		System.out.println(customerLee.getCustomerName()
			+ "님이 지불해야하는 금액은 "
			+ customerLee.calcPrice(price)
			+ "원 입니다.");
		
	}

}
