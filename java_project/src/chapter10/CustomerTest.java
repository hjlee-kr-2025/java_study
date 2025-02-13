package chapter10;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		
		customer.buy();
		customer.sell();
		customer.order();
		
		Buy buyer = customer;
		buyer.buy();
		buyer.order();
		
		Sell seller = customer;
		seller.sell();
		seller.order();
		
		if (seller instanceof Customer customer2) {
			customer2.buy();
			customer2.sell();
		}
		
		// 부모클래스(인터페이스)로 선언하고
		// 상속받은 자녀클래스로 생성해서 사용할 수 있습니다.
		Buy buyer2 = new Customer();
		buyer2.buy();
		if (buyer2 instanceof Customer c) {
			c.sell();
		}
	}

}

/*
 * 두 개의 인터페이스를 상속받으려면
 * 두 개의 인터페이스에 같은이름의 default 메서드가 있으면 
 * 자녀클래스에서 둘중 어느것으로 사용할 것인지 재정의해야 합니다..
 */





