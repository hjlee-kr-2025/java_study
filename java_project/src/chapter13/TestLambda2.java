package chapter13;

// PrintString 인터페이스를 사용

public class TestLambda2 {
	public static void main(String[] args) {
		PrintString lambdaStr = (s) -> {System.out.println(s);};
		lambdaStr.showString("hello lambda");
		PrintString reStr = returnString();
		reStr.showString("Hello,");
	}
	
	public static PrintString returnString() {
		return (s) -> {System.out.println(s + "World");};
	}
}
