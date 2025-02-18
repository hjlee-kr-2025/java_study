package chapter13;

import java.util.Arrays;

public class IntArrayTest {

	public static void main(String[] args) {
		// 정수형 배열을 선언하고 초기화
		int[] arr = {1, 2, 3, 4, 5};
		
		// Stream 의 sum() 메서드는
		// 배열의 데이터를 모두 더한 후 리턴합니다.
		int sumVal = Arrays.stream(arr).sum();
		// Stream 의 count() 배열요소 개수를 반환합니다.
		// 리턴자료형은 long 이어서 int로 강제캐스팅하였습니다.
		int count = (int) Arrays.stream(arr).count();
		long count2 = Arrays.stream(arr).count();
		
		System.out.println(sumVal);
		System.out.println(count);
		System.out.println(count2);
	}
}




