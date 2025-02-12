package chapter09;

public class ComputerTest {
	public static void main(String[] args) {
		//Computer c1 = new Computer();
		Computer c2 = new Desktop();
		//Computer c3 = new Notebook();
		Computer c4 = new MyNotebook();
		
		/*
		 * 위 코드에서 c1, c3 가 error가 발생하는 이유는?
		 * 추상클래스를 생성하려고 했기 때문입니다.
		 */
		
		c2.typing();
		c2.display();
		c4.typing();
		c4.display();
	}
}
