package chapter05.question;

public class MyDateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate date1 = new MyDate(30, 2, 2025);
		System.out.println(date1.isValid());
		MyDate date2 = new MyDate(2, 10, 2025);
		System.out.println(date2.isValid());
	}

}
