package chapter13.lambda;

public class TestMyNumber {

	public static void main(String[] args) {
		/*
		 * 람다식은 (매개변수) -> 처리문;
		 * 처리문이 하나면? return 을 생략합니다.
		 */
		MyNumber max = (x, y) -> (x > y) ? x : y;
		System.out.println(max.getMax(10, 20));
	}
}
