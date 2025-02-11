package chapter08;
// 메서드 오버라이딩
// 오버로드 - 매개변수의 갯수가 다른 동일한 이름의 함수(메서드)
// 오버라이딩 - 부모클래스에 정의된 메서드를 자녀클래스가 재정의(변경)하는것
public class OverridingTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VIPCustomer customerKim = 
				new VIPCustomer(10020, "김유신", 1000);
		customerKim.bonusPoint = 10000;
		
		int price = 10000;
		System.out.println(customerKim.getCustomerName()
			+ "님이 지불해야하는 금액은 "
			+ customerKim.calcPrice(price)
			+ "원 입니다.");
	}

}
