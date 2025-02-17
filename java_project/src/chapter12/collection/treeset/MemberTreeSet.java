package chapter12.collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

import chapter12.collection.Member;

public class MemberTreeSet {
	private TreeSet<Member> treeSet;
	
	// 생성자
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>();
	}
	
	// 멤버추가 메서드
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	// 멤버삭제 메서드
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = treeSet.iterator();
		while (ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			if (tempId == memberId) {
				treeSet.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	} // end of removeMember()
	
	// member 정보 출력
	public void showAllMember() {
		System.out.println("=== 회원 정보 ===");
		for (Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println("---------------");
	}
	
} // end of class






