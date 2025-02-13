package chapter10.question;

public class QuictSort implements Sort {

	@Override
	public void ascending(int[] num) {
		// TODO Auto-generated method stub
		System.out.println("QuickSort ascending");
	}

	@Override
	public void descending(int[] num) {
		// TODO Auto-generated method stub
		System.out.println("QuickSort descending");
	}

	@Override
	public void description() {
		// TODO Auto-generated method stub
		Sort.super.description();
		System.out.println("QuickSort 입니다.");
	}

	
}
