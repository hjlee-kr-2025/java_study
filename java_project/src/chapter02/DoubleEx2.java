package chapter02;

// 부동소수점오류 float, double - 부동소수점자료형
public class DoubleEx2 {
	public static void main(String[] args) {
		double dnum = 1;
		// dnum에 0.1을 10000번 더하는 프로그램
		for (int i = 0 ; i < 10000 ; i++) {
			dnum = dnum + 0.1;
		}
		System.out.println(dnum);
	}
	
	// 변수 자료형 : 실수형
	// float - 4byte - 숫자뒤 f붙임
	// double - 8byte - 자바에서 실수형 기본자료형
	
	
	
}
