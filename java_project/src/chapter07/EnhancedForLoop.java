package chapter07;

// for 문의 다른 형태 (향상된 for 문)
public class EnhancedForLoop {
	public static void main(String[] args) {
		String[] strArray
			= {"Java", "Android",
				"C", "Javascript", "Python"};
		
		System.out.println("=== 기존 for 문 방식의 출력 ===");
		for (int i = 0 ; i < strArray.length ; ++i) {
			System.out.println(strArray[i]);
		}
		
		System.out.println("=== 향상된 for 문 방식의 출력 ===");
		for (String lang : strArray) {
			System.out.println(lang);
		}
		// lang = strArray[0];
		// 화면출력
		// lang = strArray[1];
		// 화면출력
		// ...
		// lang = strArray[4];
		// 화면출력
		
	}
}
