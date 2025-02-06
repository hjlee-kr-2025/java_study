package chapter03;

public class OperationQ2 {
	public static void main(String[] args) {
		int num;
		num = -5 + 3 * 10 / 2;
		// 연산의 우선순위
		// 1. -5
		// 2. 3 * 10 = 30
		// 3. 30 / 2 = 15
		// 4. -5 + 15 = 10
		// 5. num = 10
		System.out.println(num);
	}
}
