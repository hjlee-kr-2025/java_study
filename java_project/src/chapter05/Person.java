package chapter05;

// class 예약어를 사용합니다. 
// class 클래스이름 {클래스내용}
public class Person {
	String name;		// 이름
	double height;			// 키
	double weight;		// 몸무게
	char gender;		// 성별
	boolean isMarried;	// 결혼여부
	
	// 생성자를 만들어 봅시다.
	// 기본생성자
	public Person() {
		
	}
	// 생성할 때 이름을 가지고 생성을 합니다.
	// this. 은 자신의 클래스안에 구현된 요소를 접근할 때 사용할 수 있게 합니다. 
	public Person(String name) {
		this.name = name;
	}
	
	// 같은 이름의 생성자 또는 함수를 매개변수의 갯수차이로
	// 다른 생성자 또는 함수로 인식하게 하는 것은 ===> 오버로드
}
