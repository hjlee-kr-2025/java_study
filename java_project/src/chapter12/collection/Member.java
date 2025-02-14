package chapter12.collection;

public class Member {
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
	
	
}
