package chapter04;

public class IfExample4 {
	public static void main(String[] args) {
		// score에 저장된 점수에 따라 grade값을 출력하는 프로그램
		// score 90 이상 A 입니다.
		// score 80 이상 B
		// score 70 이상 C
		// score 60 이상 D
		// F
		int score = 75;// 임의의 값을 초기값으로 만들어 주시면 됩니다.
		char grade;
		
		// if ~ elseif ~ else 사용해서 코딩합니다.
		if (score >= 90) {
			grade = 'A';
		}
		else if (score >= 80) {
			grade = 'B';
		}
		else if (score >= 70) {
			grade = 'C';
		}
		else if (score >= 60) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		
		System.out.println(grade + " 입니다.");
	}
}
