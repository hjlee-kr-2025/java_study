package chapter10;

public interface Buy {
	public void buy();
	
	default void order() {
		System.out.println("구매 주문");
	}
}
