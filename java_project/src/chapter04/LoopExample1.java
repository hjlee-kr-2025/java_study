package chapter04;

public class LoopExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 구구단을 출력해 봅시다.
		int dan, num;	// 같은 자료형의 변수를 여러개 선언할 때
						// ,로 구분하여 작성할 수 있습니다.
		
		for (dan = 2 ; dan <= 9 ; ++dan) {
			System.out.println(dan + "단 ========");
			for (num = 1 ; num <= 9 ; ++num) {
				System.out.println(dan + "X" + num + "=" + dan*num);
			}
			System.out.println(); // 빈줄을 삽입합니다. [Enter]역할
		}
		
	}

}
