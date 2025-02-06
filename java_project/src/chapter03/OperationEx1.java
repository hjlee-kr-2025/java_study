package chapter03;

// 산술연산자 : +, -, *, /, %
public class OperationEx1 {

	// JAVA에서 변수이름에 사용할 수 있는것: 영문자, 숫자, _, $
	// 처음이름에 숫자는 사용할 수 없습니다.
	// 변수이름으로 많이 사용하는 방식은 camel표기법입니다.
	public static void main(String[] args) {
		int mathScore = 90;
		int engScore = 71;
		
		int totalScore = mathScore + engScore;
		System.out.println(totalScore);
		
		double avgScore = totalScore / 2.0;
		double avgScore2 = totalScore / 2;
		System.out.println(avgScore);
		System.out.println(avgScore2);
		
		// 산술연산자 우선순위
		// 1. *, /, % : 먼저쓰여진 연산자가 우선적용됩니다.
		// 2. +, -
	}

}
