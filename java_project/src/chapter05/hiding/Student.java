package chapter05.hiding;

// 접근 제어자 - public, private, protected
public class Student {
	private int studentId;
	private String studentName;
	private int grade;
	private String address;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	// 접근제어자
	// public 으로 선언한 변수 또는 함수는 클래스변수.~~~ 으로 접근해서 수정하거나
	// 사용하는 것이 가능합니다.
	// private 은 주로 변수에 사용되면 클래스변수.~~~ 으로 사용할 수 없습니다.

}
