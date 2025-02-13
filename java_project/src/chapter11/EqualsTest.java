package chapter11;

/*
 * Object 클래스
 * equals() 메서드에 대한 연습
 */
class Student {
	public int studentId;
	public String studentName;
	public Student(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}
	
	
}


public class EqualsTest {
	public static void main(String[] args) {
		Student studentLee = new Student(100, "이상원");
		
		Student studentLee2 = studentLee;
		//==> studentLee 의 주소를 studentLee2에 복사
		
		Student studentSang = new Student(100, "이상원");
		
		// 두 참조형변수의 참조주소값으로 비교합니다.
		if (studentLee == studentLee2) {
			System.out.println(
				"studentLee 와 studentLee2 의 주소는 같습니다.");
		}
		else {
			System.out.println(
				"studnetLee 와 studentLee2 의 주소는 다릅니다.");
		}
		if (studentLee.equals(studentLee2)) {
			System.out.println(
				"studentLee 와 studentLee2 는 동일합니다.");
		}
		else {
			System.out.println(
				"studentLee 와 studentLee2 는 동일하지 않습니다.");
		}
		if (studentLee == studentSang) {
			System.out.println(
				"studentLee 와 studentSang 의 주소는 같습니다.");
		}
		else {
			System.out.println(
				"studentLee 와 studentSang 의 주소는 다릅니다.");
		}
		if (studentLee.equals(studentSang)) {
			System.out.println(
				"studentLee 와 studentSang 은 동일합니다.");
		}
		else {
			System.out.println(
				"studentLee 와 studentSang 은 동일하지 않습니다.");
		}
	}
}




