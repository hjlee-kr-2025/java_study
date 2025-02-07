package chapter06;

public class Student {
	private int id;
	private String name;
	private int grade;
	
	// getter
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getGrade() {
		return grade;
	}
	
	// setter
	public Student setId(int id) {
		this.id = id;
		return this;
	}
	public Student setName(String name) {
		this.name = name;
		return this;
	}
	public Student setGrade(int grade) {
		this.grade = grade;
		return this;
	}
	
	public void showStudentInfo() {
		System.out.println(name
			+ "님의 학번은 " + id + "이고, "
			+ grade + "학년 입니다.");
	}
}
