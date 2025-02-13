package chapter11;

public class StringEquals {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);
		
		// String 클래스는 Object 의 equals()를 상속받아
		// 재정의 하였습니다.
		// String equals() 메서드는 문자열을 비교하여
		// 같은지 다른지를 알려줍니다.
		System.out.println(str1.equals(str2));
	}
}



