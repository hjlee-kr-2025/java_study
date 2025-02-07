package chapter05;

public class FunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2);
		// 함수의 리턴자료형과 대입연산자 왼쪽의 자료형은 같아야 합니다.
		System.out.println(num1 + " + " + num2 + " = " + sum);

	}

	// 두 수를 받아서 더한 후 결과값을 리턴하는 함수
	// 1. 매개변수도 있고 리턴값이 있는 유형
	public static int add (int num1, int num2) {
	// 자바의 함수
		/*	리턴자료형 함수이름 (매개변수) {
		 * 		return 리턴자료형에 관련된 값;
		 * 	} 
		 * 
		 */
		int result;
		result = num1 + num2;
		return result;
	}
	
	// 1 부터 10까지 더한값을 리턴하는 함수
	// 2. 매개변수는 없고 리턴값은 있는 유형
	public static int getTenTotal() {
		int num = 1;
		int total = 0;
		for (num = 1; num <= 10 ; ++num) {
			total += num;
		}
		return total;
	}
	
	// 3. 매개변수는 있고, 리턴값이 없는 유형
	// 함수선언시 void 를 사용합니다.
	public static void printGreeting(String name) {
		System.out.println(name + "님 안녕하세요.");
		return;	// void 로 리턴값을 선언할 때
				// return; 으로 사용하거나 생략할 수 있습니다.
	}
	
	// 4. 매개변수도 없고, 리턴값도 없는 유형
	public static void welcomeMsg() {
		System.out.println("어서오세요. 환영합니다.");
	}
}







