package chapter10;

/*
 * 인터페이스 (interface)
 * 1. 함수의 구현없이 선언만된 것들로 구성되어있습니다.
 * 2. 함수선언할때 abstract 를 생략할 수 있습니다.
 * 3. 인터페이스에 선언된 변수를 컴파일과정에서 상수로 변경됩니다.
 */
public interface Calc {
	double PI = 3.14;//인터페이스에서 선언한 변수는 상수가 됩니다.
	int ERROR = -1;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	// 디폴트 메서드 : interface 에서 구현까지 해줄수있는 메서드
	// 자바 V8 부터 지원을 합니다.
	default void description() {
		System.out.println("정수 계산기를 구현합니다.");
	}
}
