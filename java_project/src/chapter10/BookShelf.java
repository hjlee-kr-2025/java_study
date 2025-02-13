package chapter10;

public class BookShelf extends Shelf implements Queue {

	@Override
	public void enQueue(String title) {
		// TODO Auto-generated method stub
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		// TODO Auto-generated method stub
		// ArrayList의 remove() 함수는 들어있는데이터를 꺼낸다.
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return getCount();
	}

}
