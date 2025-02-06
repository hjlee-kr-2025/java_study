package chapter03;

// 증가, 감소 연산자 (++, --)
public class OperationEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gameScore = 150;
		
		int lastScore1 = ++gameScore;
		System.out.println(lastScore1);
		System.out.println(gameScore);
		lastScore1 = gameScore++;
		System.out.println(lastScore1);
		System.out.println(gameScore);
		// 증가/감소 연산자
		// 1. 자신의 값을 증가시키거나 감소시킵니다.
		// 2. 연산자를 변수이름 앞 또는 뒤에 위치시킬수 있습니다.
		// 3. 앞에 위치시키면 명령문중 증감연산자를 최우선적용합니다.
		// 4. 뒤에 위치시키면 명령문중 증감연산자를 가장 마지막에 적용합니다.
		
		int lastScore2 = --gameScore;
		System.out.println(lastScore2);
		System.out.println(gameScore);
	}

}
