package exp250221;

// 회원정보가 들어가는 클래스(한명의 회원정보)
public class Member {
	private static int serialNo = 1000;// 회원번호로 사용할 번호 
	// => static 변수는 새로 생성되지 않습니다.
	// => 한번만 만들어집니다
	
	// 회원이 가지는 정보
	private int no;			// 회원번호는 자동으로 지정됩니다.
	private String name;	// 회원이름
	private int age;		// 나이
	private String address;	// 주소
	private String gender;	// 성별
	
	// 생성자
	public Member() {
		no = serialNo;
		++serialNo;
	}

	// getter : no, name, age, address, gender
	public int getNo() {
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

	// setter - name, age, address, gender
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
