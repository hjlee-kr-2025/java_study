package chapter02;

public class IntergerVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short sVal = 10;
		byte bVal = 20;
		System.out.println(sVal + bVal);
		// JAVA 정수를 연산할때 int type
		
		// int num1 = 12345678900; 이 명령문이 error가 발생하는 이유는
		// int 자료형 표현범위를 넘어가기 때문입니다.
		//int num1 = 12345678900;
		// long num2 = 12345678900; 이 명령문이 error가 발생하는 이유는
		// 정수로 숫자를 표현할때 자바는 기본적으로 int 자료형으로 판단합니다.
		// 큰숫자를 long으로 표현할때 숫자뒤에 l or L을 붙입니다.
		long num2 = 12345678900L;
		System.out.println(num2);
		
		// 1000은 int방에 들어있다가 long타입방인 num3로 넘어갑니다.
		// 작은방에서 큰방으로 옮겼기 때문에 error가 발생하지 않습니다.
		long num3 = 1000;
		System.out.println(num3);
	}
	
	// 변수자료형 (정수형-4가지)
	// byte 	: 1byte
	// short	: 2byte
	// int		: 4byte
	// long		: 8byte

}
