package chapter05.reference;

public class StudentTest {
	public static void main(String[] args) {
		Student4 studentLee = new Student4(1001, "Lee");
		
		studentLee.setKoreanSubject("국어", 100);
		studentLee.setMathSubject("수학", 50);
		
		Student4 studentKim = new Student4(1002, "Kim");
		
		studentKim.setKoreanSubject("국어", 70);
		studentKim.setMathSubject("수학", 85);
	
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
	}
}
// 클래스를 만들때
// 사용하는 값, 정보 -> 변수
// 처리하는것, 계산, 화면보여주는것 -> 함수
		
		
