package chapter13;

public class TestLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintString lambdaStr = (s)->{System.out.println(s);};
		lambdaStr.showString("hello lambda_1");
		showMyString(lambdaStr);
	}
	
	public static void showMyString(PrintString p) {
		p.showString("hello lambda_2");
	}

}
