package chapter05;

// 생성자
public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person personLee = new Person();	//기본생성자로 생성
		// 클래스를 사용할때 생성을 해야합니다.
		// 생성은 new 예약어 + 생성자를 사용합니다.
		// Person(); 처럼 클래스이름으로 되어있는 함수를 생성자라고 합니다.
		// 우리가 Person 클래스에 생성자에 관련된 내용을
		// 구현하지 않았습니다.
		// 이때 자바는 기본생성자 라는 것을 자동으로 만들어 줍니다.
		// 클래스안에 생성자가 없어야 기본생성자가 만들어집니다.
		
		// 우리가 생성자를 하나라도 만들면 기본생성자는 만들어 지지 않습니다.
		// 매개변수가 있는 생성자를 만들고, 기본생성자도 사용하려면
		// 클래스안에 기본생성자도 구현 해주어야 합니다.
		Person personKim = new Person("김유신");
		// name 초기값을 대입한 생성자
	}

}
