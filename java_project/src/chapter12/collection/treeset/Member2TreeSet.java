package chapter12.collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

import chapter12.collection.Member2;

public class Member2TreeSet {
	private TreeSet<Member2> treeSet;
	
	// 생성자
	public Member2TreeSet() {
		// TODO Auto-generated constructor stub
		treeSet = new TreeSet<Member2>(new Member2());
	}
	
	// 멤버추가
	public void addMember(Member2 member) {
		treeSet.add(member);
	}
	
	// 멤버삭제
	public boolean removeMember(int memberId) {
		Iterator<Member2> ir = treeSet.iterator();
		while(ir.hasNext()) {
			Member2 member = ir.next();
			int tempId = member.getMemberId();
			if (tempId == memberId) {
				treeSet.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	} // end of removeMember()
	
	// 멤버 정보 출력
	public void showAllMember() {
		System.out.println("=== 회원 정보 ===");
		for (Member2 member : treeSet) {
			System.out.println(member);
		}
		System.out.println("---------------");
	}
}






