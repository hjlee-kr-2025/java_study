package chapter09;

/*
 * 추상클래스인 Computer 클래스를 상속받은
 * Desktop 클래스를 구현합니다.
 */
public class Desktop extends Computer {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Desktop display()");
	}

	@Override
	public void typing() {
		// TODO Auto-generated method stub
		System.out.println("Desktop typing()");
	}

}
