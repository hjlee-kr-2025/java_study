package chapter14;

// 사용자 예외를 만들어봅니다.
// 예외를 만들때는 Exception 클래스를 상속받아서 구현합니다.
public class IDFormatException extends Exception {
	public IDFormatException(String message) {
		// 예외처리의 생성자는 예외상황에 대한 메시지를
		// 파라매터로 받습니다.
		super(message);
	}
}
