package chapter16;

// 클래스를 멀티쓰레드로 작업하려면 Thread 클래스를 상속받아 구현해야 합니다.
public class MyThread extends Thread {
	// 0부터 200까지 화면에 출력하는 메서드
	public void run() {
		int i;
		for (i = 0 ; i <= 200 ; ++i) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
}
