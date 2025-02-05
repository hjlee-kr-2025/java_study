package chapter02;

// 상수 
public class Constant {
	public static void main(String[] args) {
		// 자바에서 상수를 선언할때 변수선언문 앞에
		// final예약을 붙입니다.
		final int MAX_NUM = 100;
		final int MIN_NUM = 0;
		
		//MAX_NUM = 1000; final로 선언한 변수는 값을
		// 변경할 수 없습니다.
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
	}
	// 상수로 선언할 때는 이 값을 변경하지 않고 계속사용할때
}
