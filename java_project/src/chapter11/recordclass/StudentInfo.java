package chapter11.recordclass;
/*
 * record 클래스는 필드값(멤버변수)를 선언하지 않고
 * 매개변수처럼 작성해서 사용합니다.
 * 생성자, getter, equals(), hashCode(), toString() 가
 * 재정의한 상태로 자동으로 구현됩니다.
 * 일반적인 클래스가 멤버변수를 선언하는 것과 같은 방법으로
 * 변수를 선언할 수 없지만, static 변수(상수)는 선언할 수 있습니다.
 */
public record StudentInfo(int id, String name) {
	public static void main(String[] args) {
		StudentInfo studentInfo
			= new StudentInfo(12345, "최치원");
		StudentInfo studentInfo2
			= new StudentInfo(12345, "최치원");
		
		System.out.println(studentInfo.equals(studentInfo2));
		System.out.println(studentInfo.name());
		System.out.println(studentInfo);
	}
}
