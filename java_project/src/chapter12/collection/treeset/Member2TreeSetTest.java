package chapter12.collection.treeset;

import chapter12.collection.Member2;

public class Member2TreeSetTest {
	public static void main(String[] args) {
		Member2TreeSet memberTreeSet = new Member2TreeSet();
		
		Member2 memberPark = new Member2(1003, "박서훤");
		Member2 memberLee = new Member2(1001, "이지원");
		Member2 memberSon = new Member2(1002, "손민국");
		
		memberTreeSet.addMember(memberPark);
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberSon);
		memberTreeSet.showAllMember();
		
		Member2 memberHong = new Member2(1003, "홍길동");
		memberTreeSet.addMember(memberHong);
		memberTreeSet.showAllMember();
	}
}
