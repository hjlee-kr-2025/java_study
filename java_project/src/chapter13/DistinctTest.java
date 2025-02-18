package chapter13;

import java.util.ArrayList;
import java.util.List;

class Student {
	private int id;
	private String name;
	// 생성자 구현 - 변수2개 초기화
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	// getter 자동구현
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	
	
}

public class DistinctTest {
	public static void main(String[] args) {
		Student studentLee = new Student(100, "이윤선");
		Student studentMoon = new Student(200, "문찬욱");
		Student studentLee2 = new Student(100, "이윤선");
		
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(studentLee);
		studentList.add(studentMoon);
		studentList.add(studentLee2);
		
		// 리스트요소중 이름을 가져오고 중복된 이름을 제외하고 출력합니다.
		studentList.stream()
			//.map(Student::getName)
			.distinct()
			.forEach(s->System.out.println(s.getName()));
	}
}







