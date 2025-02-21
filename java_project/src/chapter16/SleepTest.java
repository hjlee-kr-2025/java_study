package chapter16;
// Thread 클래스의 메서드
// sleep()
// sleep(숫자); 숫자는 msec를 의미
public class SleepTest extends Thread {
	public void run() {
		for (int i = 0 ; i < 10 ; ++i) {
			try {
				Thread.sleep(1000);// 1000ms-> 1sec 를 의마합니다.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		SleepTest test = new SleepTest();
		test.start();// run() 실행
	}
}
