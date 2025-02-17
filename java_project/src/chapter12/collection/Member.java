package chapter12.collection;

import java.util.Objects;

public class Member implements Comparable<Member>{
	private int memberId;
	private String memberName;
	
	// 생성자
	public Member(int memberId, String memberName) {
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
		return "Member [memberId=" + memberId + ", memberName=" + memberName + "]";
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
		if (obj instanceof Member) {
			Member other = (Member) obj;
			return memberId == other.memberId;
		}
		else {
			return false;
		}
		
		
	}

	@Override
	public int compareTo(Member o) {
		// TODO Auto-generated method stub
		return (this.memberId - o.memberId);
	}
	
	
}
