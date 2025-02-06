package chapter04;

public class ForExample1 {
	// 반복문중 for 에 대한 내용입니다.
	public static void main(String[] args) {
		int num;
		int sum;
		
		for (num = 0, sum = 0 ; num <= 10 ; ++num) {
			sum += num;
		}
		
		System.out.println("1부터 10까지의 합은 " + sum + " 입니다.");
	}
}
