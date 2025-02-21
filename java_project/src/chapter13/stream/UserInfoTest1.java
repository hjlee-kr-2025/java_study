package chapter13.stream;

import java.util.ArrayList;
import java.util.List;

public class UserInfoTest1 {

	public static void main(String[] args) {
		UserInfo userKim = new UserInfo("김영희", 30);
		UserInfo userLee = new UserInfo("이철수", 40);
		UserInfo userSong = new UserInfo("송영수", 55);
		UserInfo userMoon = new UserInfo("문상원", 25);
		UserInfo userShin = new UserInfo("신기원", 35);
		
		List<UserInfo> userInfoList = new ArrayList<UserInfo>();
		userInfoList.add(userKim);
		userInfoList.add(userLee);
		userInfoList.add(userSong);
		userInfoList.add(userMoon);
		userInfoList.add(userShin);
		
		
		// 스트림사용
		userInfoList.stream()
			.filter(user -> user.getAge() >= 35)	// 조건에 따라서 데이터를 걸르는것
			.map(UserInfo::getName)	// 여러요소중 필요한 요소를 선택
			.sorted()				// 데이터의 정렬
			.forEach(s->System.out.println(s)); // 최종연산 하나씩 꺼내서 실행
	}
}





