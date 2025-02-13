package chapter10;

// "큐"(Queue) : 데이터를 보관하고 꺼내는 방식
// FIFO(First In First Out)
// 먼저 저장된 데이터가 먼저 나온다.
// 큐와 비교가 되는 데이터사용방식
// "스택"(Stack)
// FILO(First In Last Out)
// 먼저 저장된 데이터가 나중에 나온다.
public interface Queue {
	public void enQueue(String title);
	public String deQueue();
	public int getSize();
}
