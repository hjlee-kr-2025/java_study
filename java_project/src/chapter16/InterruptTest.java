package chapter16;

// Thread, interrupt() 메서드
public class InterruptTest extends Thread {

	public void run() {
		int i;
		
		try {
			for (i = 0 ; i < 10 ; ++i) {
				Thread.sleep(1000);
				System.out.println(i);
			}
		}
		catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("wakeup");
		}
		System.out.println("end of run()");
	} // end of run()
	
	public static void main(String[] args) {
		InterruptTest test = new InterruptTest();
		
		test.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.interrupt();
	}
} // end of class
