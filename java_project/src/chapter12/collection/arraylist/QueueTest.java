package chapter12.collection.arraylist;

import java.util.ArrayList;

class MyQueue {
	private ArrayList<String> arrayQueue
		= new ArrayList<String>();
	
	// 데이터를 queue에 저장하는 메서드
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	
	// 데이터를 queue에서 빼내오는 메서드
	public String deQueue() {
		int len = arrayQueue.size();
		// queue에 데이터가 있는지 체크
		if (len == 0) {
			System.out.println("큐가 비었습니다.");
			return null;
		}
		return arrayQueue.remove(0);//제일 먼저저장된 데이터
	}
}

public class QueueTest {
	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");
		// 한줄복사 [Ctrl]+[Alt]+위/아래화살표
		
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		
	}
}
