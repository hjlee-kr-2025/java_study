package chapter06;

public class ThisExample {
	public static void main(String[] args) {
		Birthday bDay = new Birthday();
		bDay.setYear(2025);
		System.out.println(bDay);
		bDay.printThis();
	}
}
