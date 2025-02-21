package chapter16;

class Bank2 {
	private int money = 10000;
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	//synchronized 예약어는 공유자원에 대한 접근을 제어하는 방법중 하나입니다.
	public void saveMoney(int save) {
		int m = getMoney();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setMoney(m + save);
	}
	
	public void minusMoney(int minus) {
		int m = getMoney();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setMoney(m - minus);
	}
}	// end of class Bank

class Park2 extends Thread {
	public void run() {
		synchronized (SyncMainTest2.myBank) {
			
			System.out.println("예금 작업을 시작합니다.");
			SyncMainTest2.myBank.saveMoney(3000);
			System.out.println("saveMoney(3000) 작업이 진행되어 잔액이 " + 
					SyncMainTest2.myBank.getMoney() + "입니다.");
		}
	}
}

class ParkWife2 extends Thread {
	public void run() {
		synchronized (SyncMainTest2.myBank) {
			
			System.out.println("출금 작업을 시작합니다.");
			SyncMainTest2.myBank.minusMoney(1000);
			System.out.println("minusMoney(1000) 작업이 진행되어 잔액이 " + 
					SyncMainTest2.myBank.getMoney() + "입니다.");
		}
	}
}


public class SyncMainTest2 {
	public static Bank2 myBank = new Bank2();
	public static void main(String[] args) {
		Park2 p = new Park2();
		p.start();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ParkWife2 pw = new ParkWife2();
		pw.start();
	}
}// end of class
