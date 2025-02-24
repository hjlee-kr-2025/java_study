/*
 * package(패키지) - 클래스가 존재하는 위치(경로)
 * windows의 폴더경로와 비슷하다라고 생각하면 됩니다.
 * 같은패키지안에는 같은이름의 클래스가 존재할 수 없습니다.
 * 패키지에서 하위폴더는 "."으로 구분됩니다.
 */
package exp250224;

import java.util.ArrayList;
import java.util.Scanner;

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
		
		// 키보드를 입력해야해서 주석처리 하였습니다.
	/*	menuExample menu = new menuExample();
		String str = menu.menu();
		System.out.println(str);*/
		
		Loop loop = new Loop();
		loop.whileTest();
		loop.doWhileTest();
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

/*
 * 조건문
 */
class IfExample {
	// 두수를 매개변수로 받아서 큰 수를 리턴
	int max(int num1, int num2) {
		if (num1 > num2) {
			// 참이면 이곳을 실행합니다.
			return num1;
		}
		return num2;
	}
	// 두수를 매개변수로 받아서 작은 수를 리턴 (단, 같으면 0을 리턴)
	int min(int num1, int num2) {
		if (num1 > num2) {
			return num2;
		}
		else if (num1 == num2) {
			return 0;
		}
		else {
			return num1;
		}
	}
}

/*
 * switch
 */
class menuExample {
	// 키보드 입력받을 준비는 아래와 같이 선언하고 생성합니다.
	public static Scanner scanner = new Scanner(System.in);
	
	String menu() {
		ArrayList<String> menuList = new ArrayList<String>();

		while (true) {
			System.out.println("===== 메뉴판 =====");
			System.out.println("1. 자장면, 2. 짬뽕");
			System.out.println("3. 볶음밥, 4. 탕수육");
			System.out.println("5. 군만두, 9. 주문취소");
			System.out.println("0. 주문완료");
			System.out.println("메뉴선택 >> ");
			String menu = scanner.nextLine();
			// ===> 키보드 입력받을때 위 명령을 기억하세요
			switch(menu) {
			case "1":
				menuList.add(new String("자장면"));
				break;
			case "2":
				menuList.add(new String("짬뽕"));
				break;
			case "3":
				menuList.add(new String("볶음밥"));
				break;
			case "4":
				menuList.add(new String("탕수육"));
				break;
			case "5":
				menuList.add(new String("군만두"));
				break;
			case "9":
				// ArrayList 클래스의 clear() 메서드는
				// 리스트내용을 전부 지웁니다.
				menuList.clear();
				break;
			case "0":
				StringBuilder str = new StringBuilder();
				for (String m : menuList) {
					str.append(m + ", ");
				}
				str.append("을 주문하였습니다.");
				return str.toString();
			default:
				System.out.println("잘못누르셨습니다. 다시입력해주세요");
			}	// end of switch(menu)
			
			if (menuList.size() == 0) {
				System.out.println("현재 주문내역이 없습니다.");
			}
			else {
				System.out.println("현재 주문내역은 ");
				for (String m : menuList) {
					System.out.println(m);
				}
				System.out.println("입니다.");
			}
		}	// end of while(true)
	}	// end of menu()
}	// end of class

/*
 * 반복문
 */
class Loop {
	/*
	 * while
	 * 폼)
	 * while (반복조건) {
	 *    참일때 실행되는 내용
	 * }
	 */
	void whileTest() {
		// 1부터 100까지 숫자 중 3으로 나눈 나머지가 1인 숫자를
		// 모두 더한값을 출력합니다.
		/*
		 * 정수자료형 : int
		 * 나머지를 구하는 연산자 : %
		 * 반복을 위한 : while
		 * 조건을 위한 : if
		 */
		int num = 1; // 1부터 100까지 증가시킬 변수
		int sum = 0; // 이곳에 더한값을 저장하려고 합니다.
		// num 이 100보다 작거나 같을때 까지 반복작업을 수행합니다.
		while (num <= 100) {
			if (num % 3 == 1) {
				sum += num; // sum = sum + num;
			}
			++num;// 1증가
		}
		System.out.println("결과값: " + sum);
	}
	/*
	 * do while
	 */
	void doWhileTest() {
		// 키보드로 숫자 하나를 입력받아서
		// 5제곱수를 출력하는 프로그램
		// do ~ while
		Scanner scanner = new Scanner(System.in);
		System.out.println("0~9 중 하나를 입력하세요 : ");
		String strNum = scanner.nextLine();
		int num = Integer.parseInt(strNum);
		int mul = 1; // 계산한 값을 담은 변수(곱해서 변함없는 수: 1)
		int count = 0;
		do {
			mul *= num;
			++count;
		} while (count < 5 && mul != 0);
		// => 5번을 곱하고, 단 계산값이 0이 아닌동안(num:0 일때는 한번만)
		System.out.println(num + "의 5승 계산값 : " + mul);
	}
}












