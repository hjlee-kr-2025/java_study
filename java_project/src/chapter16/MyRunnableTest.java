package chapter16;

public class MyRunnableTest {

	public static void main(String[] args) {
		System.out.println("메인함수가 시작되었습니다.");
		
		Thread thread1 = new Thread(new MyRunnable());
		Thread thread2 = new Thread(new MyRunnable());
		
		thread1.start();
		thread2.start();
		
		
		System.out.println("메인함수가 종료되었습니다.");
	}
}
