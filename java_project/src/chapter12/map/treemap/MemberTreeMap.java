package chapter12.map.treemap;

import java.util.Iterator;
import java.util.TreeMap;

import chapter12.collection.Member;
// TreeMap에서는 Tree구성시
// key값으로 왼쪽, 오른쪽 가지를 구성합니다.
public class MemberTreeMap {
	private TreeMap<Integer, Member> treeMap;
	
	// 생성자
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer, Member>();
	}
	
	// 멤버추가
	public void addMember(Member member) {
		treeMap.put(member.getMemberId(), member);
	}
	// 멤버삭제
	public boolean removeMember(int memberId) {
		if (treeMap.containsKey(memberId)) {
			treeMap.remove(memberId);
			return true;
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	// 멤버 정보 출력
	public void showAllMember() {
		Iterator<Integer> ir = treeMap.keySet().iterator();
		System.out.println("=== 회원 정보 ===");
		while (ir.hasNext()) {
			int key = ir.next();
			Member member = treeMap.get(key);
			System.out.println(member);
		}
		System.out.println("---------------");
	}
}





