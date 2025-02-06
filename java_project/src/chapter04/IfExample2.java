package chapter04;

public class IfExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 9;
		int charge;
		
		if (age < 8) {
			charge = 1000;
			System.out.println("취학 전 아동입니다.");
		}
		else if (age < 14) {
			charge = 2000;
			System.out.println("초등학생 입니다.");
		}
		else if (age < 20) {
			charge = 2500;
			System.out.println("청소년 입니다.");
		}
		else if (age >= 65) {
			charge = 0;
			System.out.println("경로우대 입니다.");
		}
		else {
			charge = 3000;
			System.out.println("성인 입니다.");
		}
		
		System.out.println("입장료는 " + charge + "원 입니다.");
		// 위 코드에서 age 조건이 65 이상일 때 입장료는 0원
		// 메시지 "경로우대 입니다."
	}

}
