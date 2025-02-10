package chapter07;

import java.util.ArrayList;

public class Student {
	private int studentId;
	private String studentName;
	private ArrayList<Subject> subjectList;
	
	// 생성자
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		// Array 리스트 생성 - subjectList변수를 사용할 수 있다.
		subjectList = new ArrayList<Subject>();
	}
	
	// 과목 추가 함수
	public void addSubject(String name, int score) {
		// Subject 클래스 하나를 생성
		Subject subject = new Subject();
		// 과목명, 점수를 넣습니다.
		subject.setName(name);
		subject.setScore(score);
		// 데이터가 세팅된 과목을 subjectList에 추가합니다.
		subjectList.add(subject);
	}
	
	// 정보를 출력하는 함수
	public void showInfo() {
		int total = 0; // 총점을 저장할 변수
		// 향상된 for 문으로 구현
		for (Subject s : subjectList) {
			total += s.getScore();
			System.out.println("학생 " + studentName + "의"
				+ s.getName() + " 과목 성적은 "
				+ s.getScore() + "점 입니다.");
		}
		System.out.println("학생 " + studentName + "의"
			+ " 총점은 " + total + "점 입니다.");
	}
	
}
