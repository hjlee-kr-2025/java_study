package chapter06.builder;

public class Student {
	private int id;
	private String name;
	private int grade;
	private String major;
	private String phoneNumber;
	
	private Student(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.grade = builder.grade;
		this.major = builder.major;
		this.phoneNumber = builder.phoneNumber;
	}
	
	public static class Builder {
		private int id;
		private String name;
		private int grade;
		private String major;
		private String phoneNumber;
		
		public Builder(int id, String name) {
			this.id = id;
			this.name = name;
		}
		
		public Builder grade(int grade) {
			this.grade = grade;
			return this;
		}
		
		public Builder major(String major) {
			this.major = major;
			return this;
		}
		
		public Builder phoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
			return this;
		}
		
		public Student build() {
			return new Student(this);
		}
	}
	
}
