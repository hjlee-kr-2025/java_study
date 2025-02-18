package chapter13.optional;

import java.util.ArrayList;

public class UserInfoTest {

	public static void main(String[] args) {
		ArrayList<UserInfo> userInfoList
			= new ArrayList<UserInfo>();
		userInfoList.add(new UserInfo(12345, "James"));
		userInfoList.add(new UserInfo(12346, "Tomas"));
		userInfoList.add(new UserInfo(12347, "Edward"));
		
		UserInfo userInfo = getUserInfoById(12348, userInfoList);
		//id : 12345, 12346, 12347 ==> OK
		//id : 12348 ==>
		System.out.println(userInfo.getName());
	}
	
	public static UserInfo
		getUserInfoById(int id, ArrayList<UserInfo> list) {
		for (UserInfo userInfo : list) {
			if (userInfo.getId() == id) {
				return userInfo;
			}
		}
		return null;
	}
	
}
