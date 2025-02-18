package chapter13;

// 하나의 함수만 있는 인터페이스를 함수형 인터페이스라고 불립니다.
// 사용자 이 인터페이스를 함수형 인터페이스로 사용하겠다고
// 컴파일러에게 알려주려면 @Functionallnterface 을 표시합니다.
@FunctionalInterface
public interface MyNumber {
	public int getMax(int num1, int num2);
	//public int add(int num1, int num2);
}
