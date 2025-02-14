package chapter11;

class MyDog {
	private String name;
	private String type;
	
	public MyDog(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String toString() {
		return type + name;
	}
	
}

public class Q4 {
	public static void main(String[] args) {
		MyDog dog = new MyDog("멍멍이", "진돗개");
		System.out.println(dog);
	}
}

/*
 * 문제 위 코드에서 화면에 출력이
 * 진돗개멍멍이
 * 가 되도록 코드를 수정하세요.
 */ 
