package chapter13;

import java.util.ArrayList;
import java.util.List;

class UserInfo {
	private String name;
	private int age;
	
	// 생성자 - 변수2개 초기화
	public UserInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// getter 만 자동생성
	// [Shift]+[Alt]+S
	// -> generate getters and setters 선택
	// -> select getter 버튼클릭
	// -> generate 버튼 클릭
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}


	
	
}


public class UserInfoMapTest {
	public static void main(String[] args) {
		UserInfo userKim = new UserInfo("김영희", 30);
		UserInfo userLee = new UserInfo("이철수", 40);
		UserInfo userSong = new UserInfo("송영수", 55);
		
		List<UserInfo> userInfoList = new ArrayList<UserInfo>();
		userInfoList.add(userKim);
		userInfoList.add(userLee);
		userInfoList.add(userSong);
		
		// filter와 map을 이용해서 40세 이상인 사용자 이름을 출력
		userInfoList.stream()
			.filter(user -> user.getAge() >= 40)
			.map(UserInfo::getName)
			.forEach(s->System.out.println(s));
	}
}




