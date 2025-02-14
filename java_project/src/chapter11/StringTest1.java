package chapter11;

public class StringTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		// str1과 str2 의 참조주소값을 비교합니다.
		System.out.println(str1 == str2);
		// str1.equals(str2) 는
		// str1과 str2의 데이터를 비교합니다.
		System.out.println(str1.equals(str2));
		
		String str3 = "abc";
		String str4 = "abc";
		
		// str3, str4 참조주소값비교
		System.out.println(str3 == str4);
		// ==> true;
		// str3, str4 데이터비교
		System.out.println(str3.equals(str4));
		
		str3 = "def";
		System.out.println(str3 == str4);
	}

}
