package chapter03;

// 대입연산자: = , A = B, B를 A에 대입한다.
// 
// 부호연산자: +, -
// 숫자나 변수앞에 붙여서 사용합니다.
public class OperationSign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;	// int 자료형으로 num 변수를 선언하고
						// 초기값을 10으로 합니다.
		
		System.out.println(+num);
		System.out.println(-num);
		System.out.println(num);
		// 부호연산자를 사용한다고 변수의 값이 변경되는 것은 아닙니다.
		
		num = -10;
		System.out.println(-num);
	}

}
