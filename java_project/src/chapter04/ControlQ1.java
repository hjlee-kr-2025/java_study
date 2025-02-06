package chapter04;

public class ControlQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if ~ elseif ~ else 문으로 
		// operator 을 비교해서
		// '+', '-', '*', '/'
		// 사칙연산을 수행해 결과값을 화면에 출력하는 프로그램
		int num1 = 10;
		int num2 = 2;
		char operator = '/';
		
		if (operator == '+') {
			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
			// 먼저 실행되어야 할 것은 ()로 묶어줍니다.
		}
		else if (operator == '-') {
			System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
		}
		else if (operator == '*') {
			System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
		}
		else if (operator == '/') {
			System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
		}
		else {
			System.out.println("사칙연산기호가 아닙니다.");
		}
		
	}

}
