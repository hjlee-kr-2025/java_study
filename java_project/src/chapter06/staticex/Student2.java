package chapter06.staticex;

// static 에 관련된 실습
public class Student2 {

	public static int serialNum = 1000;
	public int studentId;
	public String studentName;
	public int grade;
	public String address;
	
	public Student2() {
		++serialNum;	// 학생이 생성될 때마다 serialNum 증가
		studentId = serialNum; // serialNum으로 학번을 자동으로 만들어줌
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
}
