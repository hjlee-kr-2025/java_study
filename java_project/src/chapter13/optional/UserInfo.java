package chapter13.optional;

public class UserInfo {
	private int id;
	private String name;
	// [Shift]+[Alt]+[S] : Source 메뉴가 나옵니다.
	// 생성자 - 변수2개 초기값 세팅
	public UserInfo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	// getter
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	
}
