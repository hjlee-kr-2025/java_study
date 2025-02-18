package chapter13;

import java.util.Arrays;
import java.util.List;

// limit() 는 갯수를 제한하는 메서드
public class LimitTest {
	public static void main(String[] args) {
		List<String> fruits
			= Arrays.asList("파인애플", "사과", "바나나", "귤");
		
		// 오름차순정렬 후 2개만 출력
		System.out.println("오름차순 ----");
		fruits.stream().sorted().limit(2)
			.forEach(s->System.out.println(s));
		System.out.println();// 한줄 띄기
		// 문자열길이 정렬 후 3개만 출력
		System.out.println("문자열길이에 따른 정렬 ----");
		fruits.stream()
			.sorted((s1,s2)->Integer.compare(s1.length(), s2.length()))
			.limit(3).forEach(s->System.out.println(s));
	}
}





