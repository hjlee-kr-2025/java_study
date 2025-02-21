package chapter13.inner;

public class InnerTest {

	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		outClass.usingClass();
		OutClass.InClass.sTest();
	}
}
