package chapter12;

public class Point<T, V> {
	T x;
	V y;
	
	// 생성자
	public Point(T x, V y) {
		super();
		this.x = x;
		this.y = y;
	}

	public T getX() {
		return x;
	}

	public V getY() {
		return y;
	}
	
	
}
