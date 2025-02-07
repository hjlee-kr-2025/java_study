package chapter06.cooperation;

public class Student {
	public String studentName;
	public int grade;
	public int money;
	
	// 생성자
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);		// 버스 탑승비용은 1000원
		this.money -= 1000;	// 버스 탑승비용 제외
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);	// 지하철 탑승비용은 1500원
		this.money -= 1500;	// 지하철 탑승비용 제외
	}
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 "
			+ money + "원 입니다.");
	}
	
}
