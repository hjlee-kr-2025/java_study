/*
 * package(패키지) - 클래스가 존재하는 위치(경로)
 * windows의 폴더경로와 비슷하다라고 생각하면 됩니다.
 * 같은패키지안에는 같은이름의 클래스가 존재할 수 없습니다.
 * 패키지에서 하위폴더는 "."으로 구분됩니다.
 */
package exp250224;

/*
 * 여기서 TestJava.java 파일로 만들어졌습니다.
 * public class TestJava {} 로 만들어서 사용합니다.
 * 이 파일에 다른 클래스를 만들고 싶으면 public을 빼고 class 클래스이름 {}
 * 으로 구성하시면 됩니다.
 * public class에 main () 메서드가 존재할 수 있습니다.
 */
public class TestJava {

	/*
	 * main () public class에 있어야 하고
	 * public static void main(String[] args) {} 로 사용됩니다.
	 * static : 생성하지 않고 사용할 수 있습니다.
	 */
	public static void main(String[] args) {
		Variable var = new Variable();
		
		// Variable 생성시 변수의 초기값은?
		System.out.println("Variable 클래스 멤버변수 초기값은?");
		System.out.println(var);
		
		Operator op = new Operator();
		op.operator1(10, 3);
		op.operator2(10, 3);
		op.operator3(true, false);
	}
}

// 변수 & 자료형
class Variable {
	// 기본자료형						Wrapper 클래스
	// 정수형 
	byte bNum;	// 1byte			Byte
	short sNum;	// 2byte			Short
	int iNum;	// 4byte	(기본)	Integer
	long lNum;	// 8byte			Long
	// 문자형
	char ch;	// 2byte			Character	' ' 안에 문자하나
	// 실수형
	float fNum;	// 4byte			Float
	double dNum;// 8byte	(기본)	Double
	// 논리형
	boolean isTrue;	// 1byte		Boolean		true or false
	
	// Object 클래스의 toString() 메서드를 재정의해서
	// 클래스의 멤버변수 데이터를 표시할 수 있습니다.
	// [Shift]+[Alt]+[S] ==> Generate toString()
	// ==> Generate버튼클릭
	@Override
	public String toString() {
		return "Variable [bNum=" + bNum + ", sNum=" + sNum + ", iNum=" + iNum + ", lNum=" + lNum + ", ch=" +ch
				+ ", fNum=" + fNum + ", dNum=" + dNum + ", isTrue=" + isTrue + "]";
	}
	
	/* 
	 * 멤버변수에 초기값 설정하는 방법
	 * 1. 선언과 동시에 초기값을 대입합니다.
	 * 2. 생성자에서 초기값을 대입
	 */
}

/*
 * 연산자
 */
class Operator {
	void operator1 (int num1, int num2) {
		//산술연산자 5가지
		System.out.println("-- 산술연산자 --");
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
		System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
	}
	void operator2 (int num1, int num2) {
		// 비교연산자 6가지 --> 결과값은? true or false
		System.out.println("-- 비교연산자 --");
		System.out.println(num1 > num2);
		System.out.println(num1 >= num2);
		System.out.println(num1 < num2);
		System.out.println(num1 <= num2);
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);
	}
	void operator3 (boolean isOne, boolean isTwo) {
		// 논리연산자 3가지 --> 결과값이 true or false
		System.out.println("-- 논리연산자 --");
		System.out.println(isOne && isTwo);	//AND
		System.out.println(isOne || isTwo);	//OR
		System.out.println(!isOne);	//NOT
	}
}



