package chapter06.singleton;

// static 응용 - 싱글톤 패턴
// 클래스를 가지고 여러개 변수로 생성해서 사용하는데
// 싱클톤패턴은 한번 생성한것을 공통으로 사용하는 방식입니다.
public class Company {
	
	// 기본생성자를 private으로 만들어 줍니다.
	// 외부에서 생성자를 사용하지 못하게 합니다.
	private Company() {}
	
	private static Company instance = new Company();
	
	public static Company getInstace() {
		if (instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
