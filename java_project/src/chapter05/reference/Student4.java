package chapter05.reference;

public class Student4 {
	// 멤버변수
	int studentId;
	String studentName;
	Subject2 korean;
	Subject2 math;
	
	// 생성자
	public Student4(int studentId, String studentName) {
		// studentId = 1001;
		// studentName = "Lee";
		this.studentId = studentId;
		this.studentName = studentName;
		
		korean = new Subject2();
		math = new Subject2();
	}
	
	// 정보를 화면에 출력하는 함수
	public void showStudentInfo() {
		System.out.println(studentName + "님의 " 
			+ korean.getSubjectName() + " 과목의 점수는 "
			+ korean.getScore() + " 점이고, "
			+ math.getSubjectName() + " 과목의 점수는 "
			+ math.getScore() + " 점 입니다."
		);
	}
	
	public void setKoreanSubject(String subjectName, int score) {
		korean.setSubjectName(subjectName);
		korean.setScore(score);
	}
	
	public void setMathSubject(String subjectName, int score) {
		math.setSubjectName(subjectName);
		math.setScore(score);
	}
}





