package chapter06.staticex;

// Student2 클래스를 사용하는 실습
public class StudentTest3 {
	public static void main(String[] args) {
		Student2 studentLee = new Student2();
		studentLee.setStudentName("이지원");
		System.out.println(Student2.serialNum);
		System.out.println(
			studentLee.studentName + ", 학번: "
			+ studentLee.studentId);
		// Student2.serialNum = 1001 이 되어있습니다.
		
		Student2 studentSon = new Student2();
		studentSon.setStudentName("손수경");
		System.out.println(Student2.serialNum);
		System.out.println(
			studentSon.studentName + ", 학번: "
			+ studentSon.studentId);
	
		// static으로 선언한 변수나 함수는
		// 클래스이름으로 바로 접근이 가능합니다.
		// 위의 클래스에서 Student2.serialNum 으로 사용했듯이.
		// static변수, 정적변수, 클래스변수
	}
}
