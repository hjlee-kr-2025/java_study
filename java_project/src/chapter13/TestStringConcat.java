package chapter13;

public class TestStringConcat {

	// 람다식 없이 사용하는 전통적인 java코딩방식
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String s2 = "World";
		StringConCatImpl concat1 = new StringConCatImpl();
		concat1.makeString(s1, s2);
	}

}
