package chapter11;

public class TextBlockTest {
	public static void main(String[] args) {
		// \n, \t : 이스케이프 문자
		// \n : enter 키
		// \t : tap 키
		String myString = "안녕하세요.\n\t반갑습니다.\n다음에 또 만나요.";
		System.out.println("== myString 출력 ==");
		System.out.println(myString);
		
		String myTextBlock = """
				안녕하세요.
					반갑습니다.
				다음에 또 만나요.
				""";
		System.out.println("== myTextBlock 출력 ==");
		System.out.println(myTextBlock);
		
		// """ 문자열 """ 을 사용하면 여러줄을 하나의 String변수에 담을 수
		// 있습니다. 이것을 "텍스트 블록"이라고 합니다.
		
		writeHTML();
		printStudent("김은영", 3, 4.0);
	}	// end of main()
	
	public static void writeHTML() {
		String html = """
				<html>
					<body>
						<p>Hello World.</p>
					</body>
				</html>
				""";
		
		System.out.println(html);
	}
	
	public static void printStudent
		(String name, int grade, double point) {
		String studentInfo = """
				%s 님은
				%d 학년이고
				평점은 %.1f 입니다.
				""".formatted(name, grade, point);
		System.out.println(studentInfo);
		// 문자열에 %는 값을 대입할때 사용합니다.
		// %s: 문자열값, %d: 정수형값, %f: 실수형값을 넣을때 사용됩니다.
		// 실수형에서 %.1f 는 소숫점 1자리까지 문자열에 저장을 의미
	}
}	// end of class
