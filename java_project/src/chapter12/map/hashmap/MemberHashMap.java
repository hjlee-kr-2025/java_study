package chapter12.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import chapter12.collection.Member;

/*
 * Map 인터페이스를 상속받아 만든 클래스는
 * Key, Value 쌍으로 이루어진 데이터를 관리합니다.
 * Key 값은 중복되면 안됩니다.
 */

public class MemberHashMap {
	private HashMap<Integer, Member> hashMap;
	// 생성자
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	// 멤버추가
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
		// member의 id를 key값으로
	}
	
	// 멤버삭제
	public boolean removeMember(int memberId) {
		// HashMap containsKey() 메서드
		// HashMap안에 key값이 존재하는지를 true or false
		// 로 리턴합니다.
		if (hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	// 멤버 정보 출력
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
		System.out.println("=== 회원정보 ===");
		while (ir.hasNext()) {
			int key = ir.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}
		System.out.println("--------------");
	}
}








