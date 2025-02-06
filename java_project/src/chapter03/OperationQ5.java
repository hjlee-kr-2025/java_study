package chapter03;

public class OperationQ5 {
	public static void main(String[] args) {
		// 비트연산자
		int num1 = 2;	//	00000000 00000000 00000000 00000010
						//  0010
		int num2 = 10;	//	1010
		
		// 비트AND연산자: &
		System.out.println(num1 & num2);
		// 0010 -> 2
		// 비트OR연산자: |
		System.out.println(num1 | num2);
		// 1010 -> 10
		// XOR연산자: ^
		System.out.println(num1 ^ num2);
		// 1000 -> 8
		// 반전연산자: ~
		System.out.println(~num1);
		// 11111111 11111111 11111111 11111101 -> -3
	}
}
