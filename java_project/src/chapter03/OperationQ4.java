package chapter03;

public class OperationQ4 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		boolean result;
		
		// && : AND연산자 A && B => A(true), B(true) 일때만 true
		result = ((num1 > 10) && (num2 > 10));
		System.out.println(result);
		// false
		// || : OR연산자 A || B => A, B 중 하나이상 true이면 true
		result = ((num1 > 10) || (num2 > 10));
		System.out.println(result);
		// true
		// ! : 부정연산자 !A => A가 true이면 false를 나타냄
		System.out.println(!result); // !: 부정
		// false
		
		
	}
}
