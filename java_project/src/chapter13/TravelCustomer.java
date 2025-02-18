package chapter13;

public class TravelCustomer {
	private String name;	// 이름
	private int age;		// 나이
	private int price;		// 가격
	// 생성자 - 변수3개 초기화
	public TravelCustomer(String name, int age, int price) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
	}
	// getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + ", price=" + price + "]";
	}
	
	
	
} // end of class
