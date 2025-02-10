package chapter06.staticex;
// Student4 class를 사용해서 실습
public class StudentTest5 {
	public static void main(String[] args) {
		System.out.println(Student4.getSerialNum());
		// static으로 선언한 변수 또는 함수는
		// 클래스 이름이 처음 나오는 시점에 메모리가 할당됩니다.
	}
	
	// 변수의 유효범위
	// 1. 지역변수 : 함수(메서드)안에서 선언된 변수
	// 2. 멤버변수 : 클래스 내 어디서든 사용이 가능합니다.
	// 3. static 변수(클래스변수) : public으로 선언한 static변수는
	// 어디서나 사용이 가능합니다.
	// static 변수는 프로그램이 시작되면(처음클래스이름이 나오면)
	// 메모리가 할당되어서 끝날때까지 메모리공간을 차지합니다.
}
