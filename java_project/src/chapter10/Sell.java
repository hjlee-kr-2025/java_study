package chapter10;

public interface Sell {
	public void sell();
	
	default void order() {
		System.out.println("판매 주문");
	}
}
