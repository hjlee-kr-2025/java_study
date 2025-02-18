package chapter13;

public class TestStringConcat1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String s2 = "World";
		StringConcat concat2
			= (s, v) -> {System.out.println(s + "," + v);};
		concat2.makeString(s1, s2);
	}

}
