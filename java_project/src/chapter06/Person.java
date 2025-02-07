package chapter06;

public class Person {
	String name;
	int age;
	
	Person () {
		// 기본생성자를 호출해서 생성했을때 사용할 코드를 구현하겠습니다.
		this("이름없음", 1);
		// ==> Person("이름없음", 1); 과 동일한 명령
		// name = "이름없음";
		// age = 1;
	}
	
	Person (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Person resultItSelf() {
		return this;
	}
}
