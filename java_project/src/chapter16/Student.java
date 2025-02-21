package chapter16;

public class Student extends Thread {

	public void run() {
		// 책을 빌리고 반납하는 내용으로 구성하겠습니다.
		
		try {
			String title = LibraryMain.library.lendBook();
			Thread.sleep(5000);
			LibraryMain.library.returnBook(title);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
