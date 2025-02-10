package chapter06.staticex;

public class Student4 {
	private static int serialNum = 1000;
	public int studentId;
	public String studentName;
	public int grade;
	public String address;
	
	// 생성자
	public Student4() {
		++serialNum;
		studentId = serialNum;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	// static 으로 만든 변수의 getter, setter를 구현할 때
	// static 함수로 만들어야 합니다.
	public static int getSerialNum() {
		int i = 10;
		//studentName = "이지원";
		// static으로 선언한 함수안에는 일반멤버변수를 사용할 수 없습니다.
		// static 함수안에는 static변수(클래스변수) 또는
		// 지역변수(함수안에 선언한 변수) 만 사용할 수 있습니다.
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		// static변수는 this로 접근할 수 없고
		// 클래스이름으로 접근해야 합니다.
		Student4.serialNum = serialNum;
	}
}
