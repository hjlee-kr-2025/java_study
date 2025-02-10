package chapter07;

public class ArrayCopy {
	// 배열복사
	// 배열을 복사하는 방법은
	/*
	 * 1. 같은방 크기를 배열을 만들고 반복문을 통해 대입
	 * 
	 * 2. System.arraycopy() 메서드를 이용하는 방법
	 */
	public static void main(String[] args) {
		/* 배열복사 - 1번 방법 - 시작
		int[] array1 = {10, 20, 30, 40, 50};
		int[] array2 = new int[5];
		
		// array1 내용을 array2 에 복사
		for (int i = 0 ; i < array1.length ; ++i) {
			array2[i] = array1[i]; // 같은 인덱스에 있는 값을 대입
		}
		for (int i = 0 ; i < array2.length ; ++i) {
			System.out.println(array2[i]);
		}
		* 배열복사 - 1번 방법 - 끝
		*/
		
		// 배열복사 - 2번방법
		int[] array1 = {10, 20, 30, 40, 50};
		int[] array2 = {1, 2, 3, 4, 5};
		
		// array1의 0번방부터 복사해서
		// array2의 1번방부터 4개를 대입하세요.
		System.arraycopy(array1, 0, array2, 1, 4);
		
		// 화면에 복사된 내용확인을 위해 출력
		//System.out.println(array2[0]);
		for (int i = 0 ; i < array2.length ; ++i) {
			System.out.println(array2[i]);
		}
	}
}
