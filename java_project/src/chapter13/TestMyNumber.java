package chapter13;

public class TestMyNumber {
	public static void main(String[] args) {
		MyNumber max = (x, y) -> (x>=y) ? x : y;
		// => 람다식을 통해서 함수처리부 구현
		// => 람다식을 통해 인터페이스를 사용하려면
		// 인터페이스에 메서드가 하나여야 합니다.
		System.out.println(max.getMax(10, 20));
	}
}
