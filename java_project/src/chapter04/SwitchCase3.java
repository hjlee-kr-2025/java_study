package chapter04;

public class SwitchCase3 {
	public static void main(String[] args) {
		// String 클래스는 문자열을 관리하는 클래스입니다.
		String medal = "Gold";
		
		// switch () 변수에 문자열을 비교값으로 사용할 수 있습니다.
		switch (medal) {
		case "Gold":
			System.out.println("금메달입니다.");
			break;
		case "Silver":
			System.out.println("은메달입니다.");
			break;
		case "Bronze":
			System.out.println("동메달입니다.");
			break;
		default:
			System.out.println("메달이 없습니다.");
		}
	}
}
