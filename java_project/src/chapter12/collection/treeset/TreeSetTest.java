package chapter12.collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("홍길동");
		treeSet.add("강감찬");
		treeSet.add("이순신");
		
		for (String str : treeSet) {
			System.out.println(str);
		}
		// TreeSet
		// 처음값 -> 두번째들어오는값 처음값보드 작을때, 끌때
		// 작으면 왼쪽으로 가지를 벗어나가고, 크면 오른쪽으로 가지를 뻣어나갑니다.
	}
}
