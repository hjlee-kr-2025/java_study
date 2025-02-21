package chapter16;

public class ThreadTest1 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		
		MyThread thread1 = new MyThread();
		thread1.start();// Thread클래스의 start() 메서드는 클래스의 run() 이 실행됩니다.
		
		MyThread thread2 = new MyThread();
		thread2.start();
		
		System.out.println("프로그램종료");
	}
}
