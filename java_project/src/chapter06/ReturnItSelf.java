package chapter06;

public class ReturnItSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentLee = new Student();
		studentLee.setId(12345).setName("김원상").setGrade(3).showStudentInfo();
		// 연속호출, setId(), setName(), setGrade() 의 리턴값이 class객체
	}

}
