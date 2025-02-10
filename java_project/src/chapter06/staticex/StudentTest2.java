package chapter06.staticex;

// Student2 클래스를 사용하는 실습
public class StudentTest2 {
	public static void main(String[] args) {
		Student2 studentLee = new Student2();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum);
		System.out.println(
			studentLee.studentName + ", 학번: "
			+ studentLee.studentId);
		// Student2.serialNum = 1001 이 되어있습니다.
		
		Student2 studentSon = new Student2();
		studentSon.setStudentName("손수경");
		System.out.println(studentSon.serialNum);
		System.out.println(
			studentSon.studentName + ", 학번: "
			+ studentSon.studentId);
		
	}
}
