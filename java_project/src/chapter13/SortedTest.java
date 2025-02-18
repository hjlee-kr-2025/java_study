package chapter13;

import java.util.Arrays;
import java.util.List;

public class SortedTest {

	public static void main(String[] args) {
		// 문자열 리스트를 생성
		List<String> fruits
			= Arrays.asList("파이애플", "사과", "바나나", "귤");
		
		System.out.println("--- 기본 정렬(오름차순정렬): ---");
		fruits.stream().sorted()
			.forEach(s->System.out.println(s));
		System.out.println();
		
		System.out.println("--- 문자열 길이에 따라 정렬: ---");
		fruits.stream()
			.sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
			.forEach(s -> System.out.println(s));
	}
}
