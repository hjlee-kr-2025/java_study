package chapter11.recordclass;

import java.util.Objects;

public class Student {
	private int id;
	private String name;
	
	// 생성자 (2개의 필드사용)
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		// 클래스안의 모든 데이터가 같은지 다른지 알려주는 메서드로
		// 재정의 했습니다.
		if (this == obj)// studentLee, studentLee2
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	public static void main(String[] args) {
		Student studentLee = new Student(12345, "이순신");
		Student studentLee2 = new Student(12345, "이순신");
		
		// toString() 재정의 실습결과
		System.out.println(studentLee);
		// equals() 재정의 실습결과
		System.out.println(studentLee.equals(studentLee2));
		// record 클래스와 비교를 위해서 구현
		studentLee.setName("김유신");
		System.out.println(studentLee.getName());
	}
	
}
