package chapter13;

// 내부클래스를 static 클래스로 만들어줍니다.
class OutClass2 {
	private int num = 10;
	private static int sNum = 20;
	
	/*
	 * static 클래스에서는 일반변수를 사용할 수 없습니다.
	 */
	static class InClass {
		// 내부클래스 일반변수
		int inNum = 100;
		// 내부클래스 정적변수(static)
		static int sInNum = 200;
		
		void inTest() {
			//System.out.println("OutClass num = " + num);
			System.out.println("OutClass sNum = " + sNum);
			System.out.println("OutClass inNum = " + inNum);
		}
		
		static void sTest() {
			System.out.println("인스턴스 내부 클래스 메서드");
		}
	} // end of class InClass
	

} // end of class OutClass




public class InnerTest2 {
	public static void main(String[] args) {
		// static으로 생성한 클래스는 외부클래스이름으로
		// 접근하여 사용할 수 있습니다.
		OutClass2.InClass sInClass = new OutClass2.InClass();
		sInClass.inTest();
		OutClass2.InClass.sTest();
	}
}
