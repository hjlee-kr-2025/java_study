package chapter06.builder;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student
		= new Student.Builder(12345, "김원상")
			.grade(3).major("컴퓨터공학")
			.phoneNumber("123-1234-1234").build();
		
		// 빌더패턴을 사용하는 이유는 초기값에
		// 변수값에 어떤내용이 들어가는지 알기쉽게 체크하기 위해서
		// 사용합니다.
	}

}
