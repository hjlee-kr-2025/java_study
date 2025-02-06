package chapter03;

public class OperationQ3 {
	public static void main(String[] args) {
		// 증감연산자
		int num = 10;
		
		System.out.println(num);
		// 10
		System.out.println(num++);
		// 10, num = 11;
		System.out.println(num);
		// 11
		System.out.println(--num);
		// 10
		// 개발자의 의도대로 나오게하기 위해
		// 증감연산자는 주로 변수 앞에 붙입니다.
	}
}
