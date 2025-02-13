package chapter10;

public class BookShelfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue shelfQueue = new BookShelf();
		shelfQueue.enQueue("태백산백1");
		shelfQueue.enQueue("태백산백2");
		shelfQueue.enQueue("태백산백3");
		
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.getSize());
	}

}
