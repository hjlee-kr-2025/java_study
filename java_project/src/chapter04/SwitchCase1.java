package chapter04;

public class SwitchCase1 {
	public static void main(String[] args) {
		// int 자료형 ranking 변수 선언, 1을 넣습니다.
		int ranking = 1;
		// char 자료형 medalColor 변수를 선언
		char medalColor;
		
		// switch case문은
		// ranking 과 같은 값을 찾아서 실행하는 조건문입니다.
		switch (ranking) {
		case 1:
			medalColor = 'G';
			break;// switch 문이 빠져나옵니다. switch(){}를 벗어납니다.
		case 2:
			medalColor = 'S';
			break;
		case 3:
			medalColor = 'B';
			break;
		default:
			// case 로 찾는 값이 없으면 default가 실행됩니다.
			medalColor = 'A';
		}
		System.out.println(ranking +
			"등 메달의 색깔은 " + medalColor + " 입니다.");
	}
}
