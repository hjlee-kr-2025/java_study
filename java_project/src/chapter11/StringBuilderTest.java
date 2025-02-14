package chapter11;

public class StringBuilderTest {
	public static void main(String[] args) {
		String javaStr = new String("java");
		System.out.println("javaStr 문자열 주소 : "
			+ System.identityHashCode(javaStr));
		
		// StringBuffer : 멀티쓰레드지원하는 차이를 제외하고
		// StringBuilder와 동일합니다.
		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println("연산전 buffer 메모리 주소 : "
			+ System.identityHashCode(buffer));
		
		// StringBuilder 클래스 append()메서드는 문자열뒤에 데이터 추가
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programing is full!!");
		System.out.println("연산후 buffer 메모리 주소 : "
			+ System.identityHashCode(buffer));
		
		javaStr = buffer.toString();
		// toString() buffer 변수값을 String타입으로 리턴해주는 메서드
		System.out.println(javaStr);
		System.out.println("새로 만들어진 javaStr 문자열 주소 : "
			+ System.identityHashCode(javaStr));
	}
}
