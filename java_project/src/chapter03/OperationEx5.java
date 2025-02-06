package chapter03;

// 비트연산자 (&: 비트AND, |: 비트OR, ^: XOR --> 2항연산자)
// ~: 비트부정 -> 단항연산자
// 예) byte num1 = 5(0000 0101);
//    num1 = ~num1;
//		num1 = ?(1111 1010);
// 
public class OperationEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 5;	// 비트 : 0101
		int num2 = 10;	// 비드 : 1010
		int result = num1 & num2;// 비트 & 연산
		System.out.println(result);
		// 결과값 : 0
		result = num1 | num2;
		System.out.println(result);
		// 결과값 : 15 => 비트 : 1111
		
		num1 = 5;
		num2 = 10;
		result = num1 & num2;
		// 1. num1 = 5 가 담깁니다.
		// 2. num2 = 10 이 담깁니다.
		// 3. 연산자 &를 만나면 
		// num1 -> 0101 로 대기
		// num2 -> 1010 으로 대기
		
		// 10진법 : 0, 1,  2,  3,   4,   5,   6,   7, 8, 9 -> 10, 11, ..
		// 2진법  : 0, 1, 10, 11, 100, 101, 110, 111
		
		// 10진수를 2진수로 변환하려면
		// 2로 나누어 나머지를 가지고 수를 표현하시면 됩니다.
		// 10 / 2 = 5 나머지 0
		// 5 / 2 = 2 나머지 1
		// 2 / 2 = 1 나머지 0
		// 1 / 2 = 0 나머지 1
		// 2진수로 1010 이 되었습니다.
	}

}
