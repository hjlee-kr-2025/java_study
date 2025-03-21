package chapter05;

/*
 * package - 클래스 묶음
 * 		- 폴더
 * 		- 계층구조 -> 예) chapter05.school.student -> 하위단계로갈때.으로표시
 * 		- 비슷한 처리를 하는 클래스를 모아둡니다.
 */

/*
 * class (클래스) : 객체
 * 속성(변수), 메서드(함수)를 가지고 있습니다.
 * 클래스의 이름은 반드시 대문자로 시작해야 합니다.
 * class 클래스이름 { }
 */
// 우리가 문자열을 사용할때 String class 를 이용할 것입니다.
public class Student {
	int studentId;			// 학번
	String studentName;		// 이름
	int grade;				// 학년
	String address;			// 주소
	// String 문자열 "" 을 저장하는 곳을 선언합니다.
	
	
	public void showStudentInfo() {
		// 이름과 주소를 출력합니다.
		System.out.println(studentId + ", " + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public static void main(String[] args) {
		// class를 사용할때는 생성을 해주어야 합니다.
		// 클래스이름 변수명 = new 클래스이름(); 를 사용합니다.
		Student studentAhn = new Student();
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
		// 생성된 클래스를 사용할때(변수 또는 함수)
		// 클래스변수명. 과 같이 '.'을 이용해서 접근하시면 됩니다.
	}
}
