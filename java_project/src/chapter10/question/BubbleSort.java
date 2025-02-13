package chapter10.question;

public class BubbleSort implements Sort {

	@Override
	public void ascending(int[] num) {
		// TODO Auto-generated method stub
		System.out.println("BubbleSort ascending");
	}

	@Override
	public void descending(int[] num) {
		// TODO Auto-generated method stub
		System.out.println("BubbleSort descending");
	}

	@Override
	public void description() {
		// TODO Auto-generated method stub
		Sort.super.description();
		System.out.println("BubbleSort 입니다.");
	}
	
	

}
