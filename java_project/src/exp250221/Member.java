package exp250221;

// 회원정보가 들어가는 클래스(한명의 회원정보)
public class Member {
	private static int no = 1000;// 회원번호는 자동으로 지정됩니다.
	private String name;	// 회원이름
	private int age;		// 나이
	private String address;	// 주소
	private String gender;	// 성별
	public static int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getAddress() {
		return address;
	}
	public String getGender() {
		return gender;
	}
	public static void setNo(int no) {
		Member.no = no;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
} // end of class
