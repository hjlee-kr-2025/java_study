package chapter07;

public class ArrayTest1 {
	/*
	 * 배열 - 자료를 순차적으로 관리하는 구조
	 * 자바에서는 같은 자료형으로만 배열을 구성하실 수 있습니다.
	 * 배열의 선언
	 * 1. 자료형[] 변수명(배열이름) = new 자료형[개수];
	 * 2. 자료형 변수명(배열이름)[] = new 자료형[개수];
	 * int[] studentId = new int[10];
	 * 배열의 사용 - 인덱스와 함께 사용됩니다.
	 * studentId[0]; - 첫번째 방
	 * 10개의 방을 만들었다면 : index는 0부터 9까지 사용할 수 있습니다.
	 * 배열을 초기화와 함께 선언
	 * 1. int[] studentId = new int[] {101, 102, 103};
	 * 2. int[] studentId = {101, 102, 103};
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int배열자료형으로 num변수를 선언하고 10개의 값을 넣었습니다.
		int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for (int i = 0 ; i < num.length ; ++i) {
			System.out.println(num[i]);
		}
	}

}
