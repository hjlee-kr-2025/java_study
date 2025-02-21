package exp250221;

import java.util.Scanner;

public class In {
	private static Scanner scanner = new Scanner(System.in);
	
	public static String getStr() {
		return scanner.nextLine();
		// [enter]가 입력되면 키보드로 기록된 문자열을 리턴합니다.
	}
	
	public static String getStr(String msg) {
		System.out.print(msg + " -> ");
		return getStr();
	}
	
	// 문자열을 입력받아 숫자로 변경해 주는 메서드
	public static Integer getInt(String msg) {
		while (true) {
			try {
				// 문자열을 int type으로 바꿔주는 메서드
				Integer.parseInt(getStr(msg));
				// ==> 숫자문자열이 아닌 아닌 문자가 섞여있으면 예외가 발생됩니다.
				// ==> try~catch문안에 구형하였습니다.
			} catch (Exception e) {
				System.out.println("숫자만 입력하셔야 합니다.");
			}
		}
	}
	
	
	
	
	
}
