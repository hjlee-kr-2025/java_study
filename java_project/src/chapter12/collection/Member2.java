package chapter12.collection;

import java.util.Comparator;
import java.util.Objects;

public class Member2 implements Comparator<Member2>{
	private int memberId;
	private String memberName;
	
	// 생성자
	public Member2(int memberId, String memberName) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
	}

	// getter
	public int getMemberId() {
		return memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	// setter
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return "Member2 [memberId=" + memberId + ", memberName=" + memberName + "]";
	}

	@Override
	public int hashCode() {
		// 주소값대신에 memberId 데이터를 리턴하도록 재정의
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		// memberId 의 데이터가 같은지 리턴하는 메서드로
		// 재정의 했습니다.
		if (obj instanceof Member2) {
			Member2 other = (Member2) obj;
			return memberId == other.memberId;
		}
		else {
			return false;
		}
		
	}

	@Override
	public int compare(Member2 o1, Member2 o2) {
		// TODO Auto-generated method stub
		return (o1.getMemberId() - o2.getMemberId());
	}


	
	
}
