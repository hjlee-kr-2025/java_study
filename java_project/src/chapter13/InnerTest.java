package chapter13;

class OutClass {
	private int num = 10;
	private static int sNum = 20;
	
	// 내부클래스형 변수 선언
	private InClass inClass;
	
	// 생성자
	public OutClass() {
		inClass = new InClass();
	}
	
	class InClass {
		// 내부클래스 일반변수
		int inNum = 100;
		// 내부클래스 정적변수(static)
		static int sInNum = 200;
		
		void inTest() {
			System.out.println("OutClass num = " + num);
			System.out.println("OutClass sNum = " + sNum);
			System.out.println("OutClass inNum = " + inNum);
		}
		
		static void sTest() {
			System.out.println("인스턴스 내부 클래스 메서드");
		}
	} // end of class InClass
	
	public void usingClass() {
		// 내부클래스 일반메서드는 
		// 외부클래스의 메서드를 통해서 접근(처리)할수 있습니다.
		inClass.inTest();
	}
} // end of class OutClass




public class InnerTest {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("외부클래스에서 내부클래스를 기능호출");
		outClass.usingClass();
		System.out.println("내부클래스 static변수 sInNum = " +
			OutClass.InClass.sInNum);
		OutClass.InClass.sTest();// 내부클래스 static메서드
	}
}
