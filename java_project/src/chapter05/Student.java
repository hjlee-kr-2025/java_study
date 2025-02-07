package chapter05;

/*
 * class (클래스) : 객체
 * 속성(변수), 메서드(함수)를 가지고 있습니다.
 * 클래스의 이름은 반드시 대문자로 시작해야 합니다.
 */
// 우리가 문자열을 사용할때 String class 를 이용할 것입니다.
public class Student {
	int studentId;			// 학번
	String studentName;		// 이름
	int grade;				// 학년
	String address;			// 주소
	
	public void showStudentInfo() {
		// 이름과 주소를 출력합니다.
		System.out.println(studentId + ", " + address);
	}
}
