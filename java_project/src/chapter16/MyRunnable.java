package chapter16;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i;
		for (i = 0 ; i <= 200 ; ++i) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}

}
