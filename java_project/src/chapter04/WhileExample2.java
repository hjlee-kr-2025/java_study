package chapter04;

public class WhileExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1부터 50까지의 합을 while 문(반복문)을 이용해서 구현
		int num = 1; // num 1부터 50까지 증가시켜 사용할 변수
		int sum = 0; // num의 값을 차례로 더하도록 사용할 변수
		int endNum = 100;
		
		// while (조건) {
		//		참일때 실행;
		//	}
		// 1. 조건 확인
		// 2. 참 - 참일때 실행을 위에서 부터 순차적으로 실행
		// 3. 다 실행하면 while(조건) : 조건 확인 - 참: 2번으로 갑니다.
		// 4. 거짓이면? while() {} 을 빠져나갑니다.
		while (num <= endNum) {
			sum += num; // sum = sum + num;
			++num;	// num값을 1증가
		}
		
		System.out.println("1부터 " + endNum + "까지의 합은 " + sum + " 입니다.");
	}

}
