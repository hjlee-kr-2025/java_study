package chapter05.hiding;

// 접근 제어자 - public, private, protected
public class Student {
	public int studentId;
	private String studentName;
	public int grade;
	public String address;
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
		
	}
}
