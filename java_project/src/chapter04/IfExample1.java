package chapter04;

// 조건문
public class IfExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 7;
		// if (조건문) {
		//		조건문이 참인 경우에 실행됨.	
		// }
		if (age >= 8) {
			// 조건이 참일때
			System.out.println("학교에 다닙니다.");
		}
		else {
			// 조건이 참이 아닐때 (거짓일때)
			System.out.println("학교에 다니지 않습니다.");
		}
		
		char gender = 'F';
		if (gender == 'F') {
			System.out.println("여성입니다.");
		}
		else {
			System.out.println("남성입니다.");
		}
	}

}
