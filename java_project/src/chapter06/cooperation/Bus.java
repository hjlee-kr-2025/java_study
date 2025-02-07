package chapter06.cooperation;

public class Bus {
	public int busNumber;		// 버스 번호
	public int passengerCount;	// 승객 수
	public int money;			// 버스 수입
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.money += money;	// 버스 수입 증가
		passengerCount++;		// 버스 승객 추가
	}
	
	public void showInfo() {
		System.out.println("버스 " + busNumber + "번 승객은 "
			+ passengerCount + "명이고, 수입은 "
			+ money + "원 입니다.");
	}
}
