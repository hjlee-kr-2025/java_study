package chapter09;

public class Constant {
	int num = 10;
	final int NUM = 100;
	
	public static void main(String[] args) {
		Constant con = new Constant();
		con.num = 50;	// 값을 변경할 수 있습니다.
		//con.NUM = 200;	// final 로 선언한 변수를 값을 변경할 수 없습니다.
		
		System.out.println(con.num);
		System.out.println(con.NUM);
		
		String name = "이현진";
	}
}
/*
 * final 은 변수, 함수, class 앞에 선언해서 사용할 수 있습니다.
 * 1. 변수 : 상수로 사용됩니다.(데이터 변경 할 수 없음)
 * 2. 함수 : 상속받은 클래스가 메서드재정의를 할 수 없습니다.
 * 3. 클래스 : 상속할 수 없습니다.
 * final 로 선언한 클래스 String 은
 * class Student extends String {}
 * 위와같이 상속할 수 없습니다.
 * final 클래스는 부모클래스가 될 수 없습니다.
 */
