package chapter02;

public class DoubleEx1 {
	public static void main(String[] args) {
		double dnum = 3.14;
		float fnum = 3.14f;
		// 소수점이 있는 숫자는 자바는 기본적으로 double의
		// 공간을 할당합니다.
		// 소숫점있는 숫자를 float자료형에 넣기위해서는
		// 숫자뒤에 f or F를 붙여야 합니다.
		
		System.out.println(dnum);
		System.out.println(fnum);
	}
}
