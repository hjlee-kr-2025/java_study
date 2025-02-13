package chapter10.question;

public interface Sort {
	public void ascending(int[] num);
	public void descending(int[] num);
	
	default void description() {
		System.out.println("숫자를 정렬하는 알고리즘입니다.");
	}
}
