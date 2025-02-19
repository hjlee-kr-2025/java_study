package exp250219;

import java.util.ArrayList;

class Student {
	// 접근제어자 : public, private, protected
	// public: 모든클래스에서 접근가능
	// private: 혼자만 사용
	// protected: 상속받은 클래서에서는 사용가능
	private int no;
	private String name;
	// 생성자
	public Student() {
		// syso -> [Ctrl]+[space] -> [Enter] 순으로
		// 타이핑하면 System.out.println(); 이 자동으로 만들어집니다.
		// console 창에 출력하는 메서드 입니다.
		// 문자열+\n([Enter]) 이 출력됩니다.
		System.out.println("Student() 생성자");
	}
	//==> 기본생성자 - 클래스안에 생성자가 없으면 자동으로 만들어 줍니다.
	public Student(int no, String name) {
		// this: 자기자신(클래스인스턴스)을 가르킵니다.
		this.no = no;
		this.name = name;
		System.out.println("Student(int, String) 생성자");
	}
	//==> 생성자는 같은클래스 여러개가 존재할 수 있습니다.
	//  이것을 생성자 오버로드 라고 부릅니다.
	
	// getter, setter : private으로 선언된 멤버변수를
	// 다른클래스가 사용가능하도록 하는 메서드
	// getter는
	// public 변수자료형 get변수이름 () {return 변수이름;}
	// setter는
	// public void set변수이름(변수자료형 지역변수명) {
	//  	this.변수이름 = 지역변수명;
	// }
	// 이클립스에서
	// [Shift]+[Alt]+[S] 를 누르고 generate getter and setter 를 선택
	// 하면 자동으로 만들어 줄수 있습니다.
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// toString() : Object 클래스에 구현되어 있습니다.
	// 모든클래스는 Object 클래스를 상속받아 구현됩니다.
	// 그래서 Object 클래스에 구현되어있는 메서드를 재정의 할 수 있습니다.
	@Override
	public String toString() {
		// Object class 구현부
		// return "패키지.클래스이름@참조주소값";
		//return "[no = " + no + ", name = " + name + "]"
		//	+ super.toString();
		return "[no = " + no + ", name = " + name + "]";
	}
}

// public class 하나의 java 파일에 한개만 존재해야 합니다.
public class ExpTest1 {
	// Java가 실행되는 메서드 : public class 안에 있어야 합니다.
	public static void main(String[] args) {
		Student studentLee = new Student(1001, "이현진");
		// 변수명으로 출력을하면 toString()메서드가 실행됩니다.
		System.out.println(studentLee);
		// Object에 구현되어 있는 내용으로 출력하면 아래와 같은 형태로 나옵니다.
		// exp250219.Student@2f92e0f4
		
		// 배열 - 순서가 있는 자료형(같은자료를 여러개 저장할 수 있습니다)
		// 배열을 편리하게 관리하는 클래스 : ArrayList (collection 인터페이스)
		// ArrayList 는 java.util 패키지에 있습니다.
		// 그래서 import java.util.ArrayList; 를 파일 위에 선언하고
		// 사용하셔야 합니다.
		// 이클립스는 [Ctrl]+[space] 를 사용하여 클래스를 선택하면
		// 자동으로 import 를 작성해줍니다.
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		// ArrayList 데이터를 추가하는 add() 메서드
		studentList.add(studentLee);// Student 클래스로 생성한 변수
		studentList.add(new Student(1002, "김유신"));
		// => 생성자를 통해서 바로 추가하셔도 됩니다.
		studentList.add(new Student(1003, "홍길동"));
		studentList.add(new Student());
		studentList.add(new Student(1005, "이순신"));
		
		// 일반 for문으로 출력 (반복문)
		// ArrayList 의 size() 메서드는 저장된 데이터 수를 리턴합니다.
		for (int i = 0 ; i < studentList.size() ; ++i) {
			// ArrayList get(인덱스) 메서드는 저장된 값을 가져옵니다.
			System.out.println(studentList.get(i));
			// => Student클래스안의 toString() 가 실행됩니다.
		}
	}
}







