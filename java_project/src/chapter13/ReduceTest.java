package chapter13;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String> {

	@Override
	public String apply(String s1, String s2) {
		// TODO Auto-generated method stub
		// 두 문자열의 길이를 비교 큰 문자열 리턴
		if (s1.getBytes().length >= s2.getBytes().length) {
			return s1;
		}
		else {
			return s2;
		}
	}
	
}



// 최종 연산 : reduce()
public class ReduceTest {
	public static void main(String[] args) {
		String[] greetings
			= {"안녕하세요~~", "hello", "Good morning", "반갑습니다."};
		
		String str
			= Arrays.stream(greetings).reduce("", (s1,s2) -> {
				if (s1.getBytes().length >= s2.getBytes().length)
					return s1;
				else
					return s2;
			});
		
		System.out.println(str);
		
		str = Arrays.stream(greetings)
				.reduce(new CompareString()).get();
		System.out.println(str);
	}
}






