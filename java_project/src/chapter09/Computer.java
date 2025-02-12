package chapter09;

/* 추상클래스 (abstract class)
 * 함수의 구현부없이 함수만 선언할 때 class 앞에 
 * abstract 예약어를 붙인 클래스입니다.
 * 구현없는 함수도 abstract를 붙여야 합니다. 
 * 추상클래스는 생성할 수 없습니다.
 * 추상클래스를 상속받은 클래스에서 구현안 된 함수를 정의하고
 * 생성해서 사용합니다.
 */
public abstract class Computer {

	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
