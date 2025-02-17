package chapter13;

class Outer2 {
	Runnable getRunnable(int i) {
		int num = 100;
		
		// Runnable 인터페이스를 상속받는 익명클래스입니다.
		return new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(i);
				System.out.println(num);
			}
			
		};// ;이 붙는것이 주의하자 (return 명령문 끝)
	}// end of getRunnable()
	
	Runnable runner = new Runnable() {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("익명 클래스 변수");
		}
		
	};
}

public class AnonymousInnerTest {
	public static void main(String[] args) {
		Outer2 out = new Outer2();
		Runnable runnable = out.getRunnable(10);
		runnable.run();
		out.runner.run();
	}
}
