package chapter12.collection.hashset;

import java.util.HashSet;

// Set 인터페이스는 집합자료형
// 데이터의 중복을 허용하지 않습니다.
// 중복된데이터가 들어오면 무시합니다.
public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("임정순"));
		hashSet.add(new String("박현정"));
		hashSet.add(new String("홍연의"));
		hashSet.add(new String("강감찬"));
		hashSet.add(new String("강감찬"));
		
		System.out.println(hashSet);
	}
}
