package chapter03;

public class OperationIncDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 증가연산자: ++ : 단항연산자
		// 단항연산자 - 연산시 하나의 값을 사용합니다.
		// 이항연산자 - 연산시 두개의 값을 사용합니다.
		// 삼항연산자 - 연산시 세개의 값을 사용합니다.
		int num1 = 10;
		int result;
		
		// 증가연산자를 앞에 사용하는 경우
		result = ++num1;
		System.out.println(num1);
		System.out.println(result);
		// 1. num1의 값이 1증가	=> num1 = 11;
		// 2. 증가된 num1의 값이 result 로 복사됩니다. result = 11;
		
		// 증가연산자를 뒤에 사용하는 경우
		num1 = 10;
		result = num1++;
		System.out.println(num1);
		System.out.println(result);
		// 1. num1 값이 result 에 복사됩니다. => result = 10;
		// 2. num1 값이 1증가  => num1 = 11;
		
		num1 = 10;
		System.out.println(++num1);
		System.out.println(num1);
		// 위 코드의 출력은
		// 10
		// 11
		
		
		num1 = 10;
		System.out.println(num1++);
		System.out.println(num1);
		// 위 코드의 출력은
		// 11
		// 11
		
	}

}
