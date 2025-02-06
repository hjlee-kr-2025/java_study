package chapter04;

public class DoWhileExample1 {
	public static void main(String[] args) {
		// do ~ while 반복문
		/*	구조:
		 *	do {
		 *	}
		 *	while (조건문);
		 *	블럭내용이 한번 실행되고 조건을 확인합니다. 
		 */
		int num = 1;
		int sum = 0;
		
		do {
			// 한번은 무조건 실행됩니다.
			sum += num;
			++num;
		} while (num <= 10);
		
		System.out.println("1부터 10까지의 합은 " + sum + " 입니다.");
	}
}
