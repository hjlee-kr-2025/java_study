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
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 "
			+ money + "원 입니다.");
	}
	
}
