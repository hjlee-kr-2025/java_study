package chapter10;

public class CalculatorTest {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		Calculator calc = new Calculator();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		calc.showInfo();
		calc.description();
		
		Calc calc2 = new Calculator();
		System.out.println(calc2.add(num1, num2));
		System.out.println(calc2.substract(num1, num2));
		System.out.println(calc2.times(num1, num2));
		System.out.println(calc2.divide(num1, num2));
		
		int[] arr = {1,2,3,4,5};
		System.out.println(Calc.total(arr));
	}
}
