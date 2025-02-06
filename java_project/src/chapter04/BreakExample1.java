package chapter04;

public class BreakExample1 {
	// break; 에 대한 내용을 실습하겠습니다. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int num = 0;
		
		for (num = 0 ; ; ++num) {
			// for 문에 2번째를 비워두면 무한반복으로 사용됩니다.
			sum += num;
			if (num >= 100) {
				// num이 100이되면 이곳이 실행됩니다.
				break;// 빠져나옵니다. 위로올라가 봅니다.
				// 처음만나는 for, while, switch 블럭을 빠져나옵니다.
			}
		}
		
		System.out.println("num : " + num);
		System.out.println("sum : " + sum);
	}

}
