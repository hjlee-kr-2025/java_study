package chapter13.inner;

public class OutClass {
	private int num = 10;
	private static int sNum = 20;
	
	private InClass inClass;
	
	// 생성자
	public OutClass() {
		inClass = new InClass();
	}
	
	// 내부클래스
	class InClass {
		int inNum = 100;
		public static int sInNum = 200;
		
		void inTest() {
			System.out.println("inTest()");
		}
		
		public static void sTest() {
			System.out.println("sTest()");
		}
	}
	
	public void usingClass() {
		inClass.inTest();
	}
}
