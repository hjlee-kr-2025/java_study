package chapter12.collection.arraylist;

import java.util.ArrayList;

class MyStack {
	private ArrayList<String> arrayStack
		= new ArrayList<String>();
	
	// stack에 값을 넣을때
	public void push(String data) {
		arrayStack.add(data);
	}
	
	// stack에서 값을 꺼내올때 - 마지막에 넣은 데이터가 꺼내집니다.
	public String pop() {
		int len = arrayStack.size();
		if (len == 0) {
			System.out.println("스택이 비었습니다.");
			return null;
		}
		
		return (arrayStack.remove(len-1));
	}
}// end of class MyStack


public class StackTest {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
