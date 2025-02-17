package chapter12.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import chapter12.collection.Member;

public class MemberArrayList {
	// Member 클래스 자료형을 저장할 리스트
	private ArrayList<Member> arrayList;
	
	// 생성자
	public MemberArrayList() {
		// MemberArrayList 생성시
		// ArrayList변수 arrayList를 생성해 사용할 수 있도록
		// 준비합니다.
		arrayList = new ArrayList<Member>();
	}
	
	// arrayList member를 추가하는 메서드
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	// 회원을 삭제하는 메서드 (memberId로 삭제합니다)
	public boolean removeMember(int memberId) {
		// index로 데이터를 꺼내서 구현
	/*	for (int i = 0 ; i < arrayList.size() ; ++i) {
			Member m = arrayList.get(i);
			int tempId = m.getMemberId();
			if (tempId == memberId) {
				arrayList.remove(i);
				return true;
			}
		}*/
		// Iterator 를 사용해서 구현(순서없는 클래스에서도 사용가능)
		Iterator<Member> ir = arrayList.iterator();
		// ir.hasNext() : 값이 있는지를 물어봅니다.
		while(ir.hasNext()) {
			Member member = ir.next(); // 값을 Member클래스에 담는다.
			int tempId = member.getMemberId();
			if (tempId == memberId) {
				arrayList.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	// arrayList에 저장된 회원을 출력하는 메서드
	public void showAllMember() {
		System.out.println("=== 회원리스트 ===");
		for (Member m : arrayList) {
			System.out.println(m);
		}
		System.out.println("===============");
	}
}





