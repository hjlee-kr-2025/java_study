package chapter12.collection.linkedlist;

import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<String> myList
			= new LinkedList<String>();
		
		// 링크드리스트에 자료추가
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		System.out.println(myList);
		
		// ArrayList는 값이 뒤에만 추가됩니다.
		// LinkedList는 중간에 값이 추가될 수 있습니다.
		myList.add(1, "D");
		System.out.println(myList);
		
		// 리스트 처음에 값을 추가
		myList.addFirst("O");
		System.out.println(myList);
		
		System.out.println(myList.removeLast());
		System.out.println(myList);
		
	}
}
