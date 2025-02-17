package chapter13;

class Outer {
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		int num = 100;
		
		class MyRunnable implements Runnable {
			// 클래스를 포함하고있는 getRunnable()의
			// 지역변수는 상수로 변경되기 때문에
			// 값을 변경할 수 없습니다.
			// 여기서는 i와 num 이 해당됩니다.
			int localNum = 10;

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);
				System.out.println("outNum = " + outNum);
				System.out.println("Outer.sNum = " + Outer.sNum);
			}
		}// end of class MyRunnable
		return new MyRunnable();
	} // end of getRunnable()
}

public class LocalInnerTest {
	public static void main(String[] args) {
		Outer out = new Outer();
		Runnable runner = out.getRunnable(10);
		runner.run();
	}
}
