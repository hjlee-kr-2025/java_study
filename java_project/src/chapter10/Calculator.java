package chapter10;

// interface는 implements 예약어를 사용하여 상속할 수 있습니다.
public class Calculator implements Calc {

	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}

	@Override
	public int times(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		// TODO Auto-generated method stub
		if (num2 != 0) {
			return num1 / num2;
		}
		return Calc.ERROR;
	}
	
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다.");
	}

	@Override
	public void description() {
		// TODO Auto-generated method stub
		System.out.println("디폴트메서드 description()를 재정의 했습니다.");
	}

	
}
