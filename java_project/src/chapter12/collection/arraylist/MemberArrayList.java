package chapter12.collection.arraylist;

import java.util.ArrayList;

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
		for (int i = 0 ; i < arrayList.size() ; ++i) {
			Member m = arrayList.get(i);
			int tempId = m.getMemberId();
			if (tempId == memberId) {
				arrayList.remove(i);
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





