package chapter11;

public class StringTest2 {
	public static void main(String[] args) {
		String javaStr = new String("java");
		String androidStr = new String("android");
		
		System.out.println(javaStr);
		System.out.println("처음 문자열 주소값: "
			+ System.identityHashCode(javaStr));
		
		// String클래스안의 concat()메서드는 문자열을 뒤에 붙여줍니다.
		javaStr = javaStr.concat(androidStr);
		
		System.out.println(javaStr);
		System.out.println("연결된 문자열 주소값: "
			+ System.identityHashCode(javaStr));
		
		/*
		 * String 클래스로 만들어진 변수는
		 * 변수에 문자열을 넣을때마다 새롭게 생성이 됩니다.
		 * ==> 문자열을 계속해서 변경해야하는 변수에는
		 * 잘 사용하지 않습니다.
		 */
		
	}
}
