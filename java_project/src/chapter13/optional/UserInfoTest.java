package chapter13.optional;

import java.util.ArrayList;
import java.util.Optional;

public class UserInfoTest {

	public static void main(String[] args) {
		ArrayList<UserInfo> userInfoList
			= new ArrayList<UserInfo>();
		userInfoList.add(new UserInfo(12345, "James"));
		userInfoList.add(new UserInfo(12346, "Tomas"));
		userInfoList.add(new UserInfo(12347, "Edward"));
		
		Optional<UserInfo> userInfoOptional = getUserInfoById(12347, userInfoList);
		//id : 12345, 12346, 12347 ==> OK
		//id : 12348 ==>
		// 아이디를 찾아서 있으면 화면에 출력
		// 없으면 아무일도 하지 않습니다.
		userInfoOptional
		.ifPresent(userInfo-> System.out.println(userInfo.getName()));
		
		if (userInfoOptional.isPresent()) {
			System.out.println(userInfoOptional.get().getName());
		}
		else {
			System.out.println("User not found....");
		}
	}
	
	public static Optional<UserInfo>     
		getUserInfoById(int id, ArrayList<UserInfo> list) {
		for (UserInfo userInfo : list) {
			if (userInfo.getId() == id) {
				return Optional.of(userInfo);
			}
		}
		return Optional.empty();
	}
	
}
