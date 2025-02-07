package chapter05.reference;

// 과목이름, 점수를 가지는 클래스
public class Subject2 {
	private String subjectName;	// 과목이름
	private int	score;	// 점수
	
	// getter - 변수의 데이터를 가져오는 함수
	public String getSubjectName() {
		return subjectName;
	}
	
	public int getScore() {
		return score;
	}
	
	// settet - 변수에 값을 넣는 함수
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
}
