package chapter13;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// 최종연산 : collect()
public class CollectTest {
	public static void main(String[] args) {
		Predicate<Integer> isPositive = x->x>0;
		
		List<Integer> numbers
			= Arrays.asList(5, -10, -22, 0, 47, 7);
		
		List<Integer> positiveNumbers
		= numbers.stream().filter(isPositive)
			.collect(Collectors.toList());
		
		System.out.println(positiveNumbers);
		
		Long count
		= numbers.stream().filter(isPositive).count();
		System.out.println(count);
	}
}
