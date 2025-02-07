package chapter06.cooperation;

public class Subway {
	String lineNumber;	// 몇호선?
	int passengerCount; 	// 승객 수
	int money;				// 지하철 수입
	
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber; 
	}
	
	public void take(int money) {
		this.money += money;	// 지하철 수입 증가
		passengerCount++;		// 지하철 승객 증가
	}
	
	public void showInfo() {
		System.out.println(lineNumber + "의 승객은 "
			+ passengerCount + "명 이고, 수입은 "
			+ money + "원 입니다.");
	}
}
