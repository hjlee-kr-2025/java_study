package chapter03;

// 관계연산자: >, >=, <, <=, ==, !=
// 논리연산자: &&, ||, !
public class OperationEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myAge = 27;
		System.out.println(myAge > 25);
		
		int num1 = 10;
		int i = 2;
		
		boolean result
			= (((num1 = num1 + 10) < 10) && ((i = i + 2) < 10));
		System.out.println(result);
		System.out.println(num1);
		System.out.println(i);
		// 논리연산에서 A && B 는 A가 false이면 B는 실행하지 않습니다.
		// 그래서, 위 코드에서 i값은 변화가 없습니다.
		
		result
			= (((num1 = num1 + 10) > 10) || ((i = i + 2) < 10));
		System.out.println(result);
		System.out.println(num1);
		System.out.println(i);
		// 논리연산에서 A || B 는 A가 true이면 B는 실행하지 않습니다.
		// 그래서, 위 코드에서 i값은 변화가 없습니다.
	}

}
