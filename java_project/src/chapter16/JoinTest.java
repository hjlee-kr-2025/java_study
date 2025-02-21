package chapter16;

public class JoinTest extends Thread {
	int start;
	int end;
	int sum;
	
	// 생성자
	public JoinTest(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	//
	public void run() {
		for (int i = start; i <= end ; ++i) {
			sum += i;
		}
	}// end of run()
	
	public static void main(String[] args) {
		JoinTest test1 = new JoinTest(1, 50);
		JoinTest test2 = new JoinTest(51, 100);
		
		test1.start();
		test2.start();
		
		// 쓰레드가 다 끝날때 가지 기다려줘 : join()
		try {
			test1.join();
			test2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int total = test1.sum + test2.sum;
		System.out.println(test1.sum + " + " + test2.sum + " = " + total);
	}

}// end of class






;
