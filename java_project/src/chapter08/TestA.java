package chapter08;

public class TestA {
	
	public int num;
	
	void aaa() {
		System.out.println("aaa() 실행");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestA a1 = new TestA();
		a1.aaa();
		TestA a2 = new TestA();
		a2.aaa();
	}

}
