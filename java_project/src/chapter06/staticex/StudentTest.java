package chapter06.staticex;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentLee = new Student();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum);
		studentLee.serialNum++;
		
		Student studentSon = new Student();
		studentSon.setStudentName("손수경");
		System.out.println(studentLee.serialNum);
		System.out.println(studentSon.serialNum);
	}
	// static 변수 또는 함수는 생성자를 통해서 만들어 지는 것이 아닙니다.
	// static 변수 또는 함수는 클래스가 만들어 질때(처음선언될때)
	// 한번만 만들어 집니다.
	// static 으로 만들어진 것은 생성하지 않고도 사용할 수 있습니다.
}
