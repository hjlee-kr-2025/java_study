package chapter06.staticex;

// Student4 클래스를 사용한 실습
public class StudentTest4 {
	public static void main(String[] args) {
		Student4 studentLee = new Student4();
		studentLee.setStudentName("이지원");
		System.out.println(Student4.getSerialNum());
		System.out.println(
			studentLee.studentName + ", 학번: "
			+ studentLee.studentId);
		
		Student4 studentSon = new Student4();
		studentSon.setStudentName("손수경");
		System.out.println(Student4.getSerialNum());
		System.out.println(
			studentSon.studentName + ", 학번: "
			+ studentSon.studentId);
	}
}
