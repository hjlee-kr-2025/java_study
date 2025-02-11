package chapter08.customerarray;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Customer> customerList
			= new ArrayList<Customer>();
		
		// 고객 5명 생성
		Customer customerLee = new Customer(10010, "이순신");
		Customer customerShin = new Customer(10020, "신사임당");
		Customer customerHong = new GoldCustomer(10030, "홍길동");
		Customer customerYoul = new GoldCustomer(10040, "이율곡");
		Customer customerKim = new VIPCustomer(10050, "김유신", 1000);
		
		// 고객 5명 리스트(배열클래스변수)에 추가
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYoul);
		customerList.add(customerKim);
		
		// 고객 정보를 출력
		for (Customer customer :customerList) {
			// 고객 정보를 한명씩 꺼내서 출력합니다.
			System.out.println(customer.showInfo());
		}
		
		// 할인율과 보너스 포인트 계산
		System.out.println("==============");
		int price = 10000;
		for (Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(
				customer.getCustomerName() + "님이 "
				+ cost + "원을 지불 하였습니다.");
			System.out.println(
				customer.getCustomerName() + "님의 현재 보너스 포인트는 "
				+ customer.bonusPoint + "점 입니다.");
		}
	}

}
