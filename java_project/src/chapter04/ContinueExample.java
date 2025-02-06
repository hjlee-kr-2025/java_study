package chapter04;

public class ContinueExample {
	// continue; 예약어에 대해 알려보려고 합니다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		int num;
		
		// 1부터 100까지 더하는데 홀수만 더하겠습니다.
		for (num = 1 ; num <= 100 ; ++num) {
			// 1)
			/*if (num % 2 == 1) {
				total += num;
			}*/
			// 2)
			if (num % 2 == 0) {
				//짝수일때 for 가 있는 줄로 돌아가도록
				continue; // 아래로 진행하지 않고 for로 돌아갑니다.
			}
			total += num;
		}
		System.out.println("1부터 100까지 홀수의 합은 " + total + " 입니다.");
	}

}
