package chapter11;

class Point {
	public int x;
	public int y;
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}	// end of class Point

// clone() 메서드를 사용하게 하려면
// Cloneable 인터페이스를 상속받아야 합니다.
class Circle implements Cloneable {
	public Point point;
	public int radius;
	
	public Circle(int x, int y, int radius) {
		super();
		this.radius = radius;
		point = new Point(x, y);
	}

	@Override
	public String toString() {
		return 
			"원점은 " + point + "이고, 반지름은"
			+ radius + "입니다.";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}

public class ObjectCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle = new Circle(10, 20, 30);
		Circle copyCircle = (Circle) circle.clone();
		
		System.out.println(circle);
		System.out.println(copyCircle);
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(copyCircle));
		
	}
}
