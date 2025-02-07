package chapter05;

public class Student2Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 클래스를 생성해서 변수넣은 것을 '인스턴스'라고 합니다.
		// 클래스를 사용할 때는 new 예약어로 생성을 해야 합니다.
		Student2 student1 = new Student2();
		// student1 을 사용할 준비가 되었다.
		// student1은 Student2로 구현되어있는 변수, 함수들을 가지고 있습니다.
		// student1. 으로 변수 또는 함수를 사용하시면 됩니다.
		
		student1.studentName = "안연수";
		System.out.println(student1.getStudentName());
		
		Student2 student2 = new Student2();
		student2.studentName = "안승연";
		System.out.println(student2.getStudentName());
		
		System.out.println(student1);
		System.out.println(student2);
	}

}
