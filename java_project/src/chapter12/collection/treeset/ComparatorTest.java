package chapter12.collection.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
		// String 클래스의 compareTo()는 문자열을 비교합니다.
	}
	
}

public class ComparatorTest {
	public static void main(String[] args) {
		TreeSet<String> treeSet
			= new TreeSet<String>(new MyCompare());
		// ==> TreeSet 생성시 정렬방식을 지정합니다.
		treeSet.add("ccc");
		treeSet.add("bbb");
		treeSet.add("aaa");
		
		System.out.println(treeSet);
		
	}
}
