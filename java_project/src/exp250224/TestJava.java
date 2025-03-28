/*
 * package(패키지) - 클래스가 존재하는 위치(경로)
 * windows의 폴더경로와 비슷하다라고 생각하면 됩니다.
 * 같은패키지안에는 같은이름의 클래스가 존재할 수 없습니다.
 * 패키지에서 하위폴더는 "."으로 구분됩니다.
 */
package exp250224;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
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
	//	loop.doWhileTest(); //=> 키보드 입력하는 프로그램이어서 주석처리
	//	loop.forTest(); // => 키보드 입력으로 주석처리
		//==> loop 는 참조형변수입니다.
		System.out.println(loop);
		// ==> 출력값: exp250224.Loop@5b480cf9
		// Object.toString() 가 실행되는 것입니다.
		
		DataSaveTest dataSaveTest = new DataSaveTest();
		dataSaveTest.SavaData();
		dataSaveTest.showArrayListData();
		dataSaveTest.showHashMapData();
		
		Desktop desktop = new Desktop();
		desktop.turnOn();
		desktop.display();
		Computer computer = new Desktop();
		computer.turnOn();
		computer.display();
		Computer noteBook = new NoteBook();
		noteBook.turnOn();
		noteBook.display();
		// noteBook 은 NoteBook에만 구현된
		// playing()메서드는 실행 할 수 없습니다.
		// => 다운캐스팅을 해서 실행해야 하는데
		// 자녀클래스로 생성되었는지 물어보는 예약어가 instanceof 입니다.
		/*
		 * 부모클래스로 선언하고 자녀클래스로 생성해서 사용하는 것을
		 * 다형성 이라고 합니다.
		 * instaceof 예약어를 같이 기억해 주세요
		 */
		// if (선언변수명 instanceof 생성클래스명 다운캐스팅변수명) {}
		if (noteBook instanceof NoteBook n) {
			n.playing();
		}
		
		/* 
		 * 인터페이스
		 */
		Calc add = new Add();
		Calc substract = new Substract();
		int result;
		result = add.calculation(10, 20);
		System.out.println(result);
		result = substract.calculation(10, 20);
		System.out.println(result);
		Calc divide = new Divide();
		result = divide.calculation(10, 0);
		System.out.println(result);
		
	}// end of main
}// end of class TestJava

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
	}// end of doWhileTest()
	
	/*
	 * for 문
	 */
	void forTest() {
		// 키보드로 2~9 중 하나를 입력받으면
		// 구구단을 출력하는 프로그램을 만들어 주세요
		Scanner scanner = new Scanner(System.in);
		System.out.println("구구단 중 알고 싶은 단의 숫자를 입력하시요.");
		System.out.println("2~9 중 하나를 입력합니다 :");
		String numStr = scanner.nextLine();
		int num = Integer.parseInt(numStr);
		System.out.println("*** " + num + "단 ***");
		for (int i = 1 ; i <= 9 ; ++i) {
			System.out.println(num + " * " + i + " = " + (num*i));
		}
		
	}// end of forTest()
}

/*
 * 클래스 (객체) 
 * - 멤버변수
 * - 생성자
 * - 메서드
 */
class Student {
	//멤버변수 + 접근제어자
	private int studentNo;
	protected String studentName;
	public int grade;
	// 접근제어자 : private, protected, public
	// private: 선언한 클래스에서만 사용합니다.
	// protected: 선언한 클래스와 상속받은 클래스에서 사용가능
	// public: 누구나 사용할 수 있다.
	/*
	 * 멤버변수는 private 또는 protected로 선언하고
	 * 다른 클래스에서 접근해야 할 경우 getter, setter를 통해
	 * 사용하도록 하는 방법을 추천합니다.
	 */
	// 멤버변수에는 데이터가 저장됩니다.
	
	// 생성자
	public Student() {
		// 기본생성자,
		// 생성자가 아무것도 없으면 기본생성자를 자동으로 만들어줍니다.
		// 다른생성자가 있다면? 기본생성자를 사용시 구현이 필요합니다.
	}
	
	public Student(int studentNo, String studentName) {
		// Student(int studentNo, String studentName)에 
		// 있는 변수는 지역변수(메서드 안에서만 사용)
		// 전역변수(멤버변수,클래스변수)를 사용하려면 this를 붙여서
		// 사용하시면 됩니다.
		this.studentNo = studentNo;
		this.studentName = studentName;
	}
	
	/*
	 * 메서드
	 * 리턴자료형 함수이름(매개변수) {
	 *    처리내용
	 *    return 값;
	 * }
	 */
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
		// 리턴type이 void이면 return 을 생략할 수 있습니다.
		// void에서 리턴을 사용하고 싶으면 return; 처럼 값없이 사용합니다.
	}
	
	/*
	 * 자바에서 클래스를 통해서 프로그램이 진행이 됩니다.
	 * 클래스를 사용하기 위해서는 생성을 해야합니다.
	 * 생성하지 않고 사용하는것은 static으로 선언된 경우입니다.
	 * static으로 선언한 변수는 하나만 메모리할당이 됩니다.
	 * static으로 선언하지 않은 변수는 생성할때 마다 메모리할당이 됩니다.
	 * 클래스를 생성한 변수 -> 인스턴스
	 * 다형성에서 instanceof 클래스이름 로 생성(메모리할당)한 클래스이름확인
	 * 변수의 자료형이 클래스로 되어있는 것을
	 * 클래스자료형(참조자료형) 이라고 부릅니다.
	 * 참조자료형 변수를 System.out.println(참조자료형변수명); 으로
	 * 출력하면 "패키지.클래스이름@참조주소" 를 화면에 출력합니다.
	 */

	/*
	 * static 변수 또는 메서드를 사용하는 방법
	 * 클래스이름.변수, 클래스이름.메서드(); 로 변수명이 아닌 클래스명으로
	 * 직접 접근해서 사용합니다.
	 */
	
	/*
	 * final 예약어 (마지막)
	 * 변수 - 변수값을 변경할 수 없다 -> 상수로 사용됩니다.
	 * 메서드 - 함수처리내용을 변경할 수 없다 -> 재정의 하지 못한다.
	 * 클래스 - 이 클래스는 변경할 수 없다 -> 상속할 수 없습니다.
	 */
	
}


/*
 * 배열 & ArrayList(7장) & 컬렉션 프레임워크(12장)
 * -- 컬렉션 프레임워크는 자료를 관리하는 인터페이스, 클래스 집합을 의미
 * -- Collection 인터페이스 - 한개의 자료
 * * List : 데이터내용 중복을 허용합니다. 순서가 있습니다.
 * * Set : 데이터내용 중복을 허용안함.
 * -- Map 인터페이스 - <Key, Value> 한쌍의자료
 * 
 * Collection 대표 : ArrayList 클래스
 * Map 대표 : HashMap 클래스
 */
class DataSave {
	public static ArrayList<String> nameList = new ArrayList<String>();
	public static HashMap<Integer, String> nameMap = new HashMap<Integer, String>();
}

class DataSaveTest {
	void SavaData() {
		DataSave.nameList.add(new String("Kim"));
		DataSave.nameList.add(new String("Lee"));
		DataSave.nameList.add(new String("Sim"));
		DataSave.nameList.add(new String("Jung"));
		DataSave.nameList.add(new String("Cho"));
		
		DataSave.nameMap.put(1, "Kim");
		DataSave.nameMap.put(2, "Lee");
		DataSave.nameMap.put(3, "Sim");
		DataSave.nameMap.put(4, "Jung");
		DataSave.nameMap.put(5, "Cho");
	}
	
	void showArrayListData() {
		// ArrayList 의 데이터를 가져올때는
		// for 문을 사용하면 됩니다.
		// 1. 일반 for문을 사용합니다. (전통적인 방식)
		System.out.println("1. 일반 for문으로 ArrayList의 데이터 가져오기");
		for (int i = 0 ; i < DataSave.nameList.size() ; ++i) {
			// 인덱스를 가지고 데이터를 가져와서 출력합니다.
			System.out.println(DataSave.nameList.get(i));
		}
		System.out.println("2. 향상된 for문으로 ArrayList의 데이터 가져오기");
		for (String name : DataSave.nameList) {
			System.out.println(name);
			//==> 선언한 변수명(자료형은 ArrayList의 저장된 데이터자료형)
		}
	}// end of showArrayListData()
	
	void showHashMapData() {
		/*
		 * HashMap 데이터는 순서가 없기때문에 for 문으로 가져오기가
		 * 어렵습니다. ==> Iterator 인터페이스를 사용해서
		 * 값을 하나씩 꺼내옵니다.
		 * --> 제네릭에 적을 자료형 key값의 자료형을 적습니다.
		 * Map 에 저장된 자료는 key값으로 제어합니다. 
		 */
		Iterator<Integer> ir = DataSave.nameMap.keySet().iterator();
		/*
		 * hasNext()는 데이터가 있느냐?를 체크하는 메서드 입니다.
		 */
		System.out.println("3. HashMap 자료형 데이터 출력");
		while (ir.hasNext()) {
			int key = ir.next(); //값을 꺼내서 리턴
			String name = DataSave.nameMap.get(key);
			System.out.println(name);
		}
	}
}

/*
 * 추상클래스 : abstract
 */
abstract class Computer {
	// 추상클래스에는 추상메서드가 포함될 수 있습니다.
	public abstract void display();
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
}
/*
 * 추상클래스는 상속을 주는 클래스입니다. 
 * 상속을 받은 클래스가 추상메서드를 구현하여 사용합니다.
 */
class Desktop extends Computer {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Desktop display()");
	}
	
}
/*
 * 클래스에서 상속이란?
 * 1. 클래스를 상속받을때는 extends 예약어를 사용합니다.
 * 2. 부모클래스의 멤버변수, 메서드를 자유롭게 사용할 수 있습니다.
 * 3. 부모클래스의 메서드는 재정의 해서 사용할 수도 있습니다.
 * 4. 추상메서드는 자녀클래스가 재정의(구현)해서 사용합니다.
 * 5. 부모클래스 메서드를 재정의(구현) 하는것을 override(오버라이드)라고 합니다.
 * 6. 클래스 상속은 하나만 가능합니다.
 * 7. 추상클래스는 생성자가 없습니다.
 */

/* 다형성 테스트를 위해
 * 아래 클래스를 하나더 만들었습니다.
 */
class NoteBook extends Computer {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("NoteBook display()");
	}
	
	public void playing() {
		System.out.println("NoteBook only playing()");
	}
	
}

/*
 * 인터페이스 : interface
 * 추상메서드만 가지고 있는 클래스
 * 추상메서드를 선언할때 사용하는 abstract 예약어 생략이 가능합니다.
 * 인터페이스에서 선언된 멤버변수는 모두 상수가 됩니다.
 * (final static) 이 됩니다.
 * 인터페이스는 상속해서 사용됩니다.
 * 인터페이스는 여러개를 동시에 상속이 됩니다.
 * 클래스에서 인터페이스를 상속받을때는 implements 예약어를 사용합니다.
 */

interface Calc {
	public int calculation(int num1, int num2);
}

class Add implements Calc {

	@Override
	public int calculation(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}
	
}

class Substract implements Calc {

	@Override
	public int calculation(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}
	
}

/*
 * JDK 기본 클래스 - Object, String, Class
 * * Object 클래스 : 모든클래스의 부모클래스(최상위 클래스)
 * - toString() -> 참조형변수을 그대로 사용했을때 실행되는 메서드
 *  ==> 패키지이름.클래스이름@참조주소
 *  ==> 보통은 클래스의 멤버변수 데이터를 보여주는 것으로 재정의해서 사용
 * - equals()
 *  ==> 참조주소가 같은지를 true or false
 *  ==> 데이터내용이 같은지로 재정의해서 많이 사용됩니다.
 * - clone()
 *  ==> 깊은복사를 지원(새로 생성후 데이터값을 복사합니다)
 * - hashCode()
 *  ==> 참조주소값을 리턴합니다.
 *  
 * * String 클래스 - StringBuffer, StringBuilder
 * - 문자열에 관계된 클래스입니다.
 * - String 클래스는 문자열 변경할때 새로 생성후 값을 넣습니다(수정이 안됩니다)
 * - 변경이 자주일어나는 문자열은 StringBuffer 또는 StringBuilder를
 *  사용합니다.
 *  
 * * Class 클래스 - 클래스 정보를 확인하기 위한 클래스
 * - 동적할당을 위해서 사용되기도 합니다.
 * - Class.forName(); ==> 동적할당에 사용되는 메서드 입니다.
 */


/*
 * 예외처리 - Exception
 */ 

class Divide implements Calc {

	@Override
	public int calculation(int num1, int num2) {
		// TODO Auto-generated method stub
		int result;
		/*
		 * 예외처리는
		 * try {
		 * }
		 * catch (Exception e) {
		 *    e.printStackTrace();
		 * }
		 * finally {
		 * }
		 */
		try {
			result = num1 / num2;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("num2 = 0 입니다.");
			return 0;
		}
		return result;
	}
	
}


/*
 * 키보드 입력을 위한 클래스 사용
 * public static Scanner scanner = new Scanner(System.in);
 * String str = scanner.nextLine();
 */
 



