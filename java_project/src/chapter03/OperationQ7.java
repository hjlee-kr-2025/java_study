package chapter03;

// 3항연산자(조건연산자)
public class OperationQ7 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int result;
		
		result = (num1 >= 10) ? num2 + 10 : num2 - 10;
		System.out.println(result);
		// 30
		
	}
}
