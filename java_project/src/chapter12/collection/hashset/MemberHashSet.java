package chapter12.collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import chapter12.collection.Member;

public class MemberHashSet {
	private HashSet<Member> hashSet;
	
	// 생성자
	public MemberHashSet() {
		hashSet = new HashSet<Member>();
	}
	
	// hashSet에 멤버추가
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	// hashSet에 멤버삭제
	public boolean removeMember(int memberId) {
		// hashSet은 순서가 없어서 인덱스로 값을 가져올 수
		// 없습니다.
		Iterator<Member> ir = hashSet.iterator();
		
		while (ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			if (tempId == memberId) {
				hashSet.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	} // end of removeMember()
	
	// 모든 멤버 출력
	public void showAllMember() {
		System.out.println("=== 회원정보 ===");
		for (Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println("--------------");
	}
} // end of class
