package chapter06.example;

class ExClass01 {
	// 멤버변수 - 클래스안에 선언한 변수 - 값
	int iNum;
	char ch1;
	double dNum;
	boolean isBool;
	
	// 멤버함수(메서드)
	// 우리가 만든 함수
	public void showInfo() {
		System.out.println(
			"iNum = " + iNum
			+ ", ch1 = " + ch1
			+ ", dNum = " + dNum
			+ ", isBool = " + isBool
			);
	}
	
	// private, public
	// public - 어디서나 접근 가능 (다른 클래스에서도)
	// 접근제어자가 없이 사용 - 같은 패키지(폴더) 안에 있는 클래스에서만 접근가능
	// private - 자신의 클래스에서만 사용가능
	// private으로 선언한 변수를 다른 클래스가 사용할 수 있도록
	// getter, setter를 만들어 줍니다.
	
	// static - 생성하지 않고 사용가능, 생성자로 생성해도 추가로 만들어지지
	// 않는다.
	public static int iStaticNum;
}

// java 에서 실행하는 곳은 main()함수로 되어있습니다.
public class Example {
	public static void main(String[] args) {
		// ExClass01을 사용하기 위해서는 생성을 해야 합니다.
		// 생성하기 위해 사용하는 것이 생성자
		// 생성자는 ExClass01()의 형태를 가지게 됩니다.
		ExClass01 ex1 = new ExClass01();
		ExClass01 ex2 = new ExClass01();
		// 생성을 한다는 것은 자료를 넣기 위해 메모리 공간을 만든다.
		System.out.println(ex1.iNum);
		System.out.println(ex1.ch1);
		System.out.println(ex1.dNum);
		System.out.println(ex1.isBool);
		System.out.println(ex1);
		System.out.println(ex2);
		
		// class변수명. 으로 접근할 수 있는 변수는
		// public예약어가 있거나 아무것도 없는 변수들만 .으로 접근가능합니다.
		// private은 .으로 접근할 수 없습니다.
		
		ex1.iNum = 10;
		ex1.showInfo();
		// 클래스변수로 함수를 접근하게되면, 함수의 내용이 실행됩니다.
		
		System.out.println(ExClass01.iStaticNum);
		// static 으로 선언한 변수는
		// 클래스명. 으로 접근해서 사용합니다. (클래스변수가 아님)
		// static 으로 정의한 클래스에서 중복공간을 허용하지 않습니다.
		
		// 함수도 static으로 선언했다면 클래스명. 으로 접근해서
		// 사용할 수 있습니다.
	}
}




