package chapter07;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Array변수 선언 - double자료 5개를 가진 배열 
		double[] data = new double[5];
		
		data[0] = 10.0;
		data[1] = 20.5;
		data[2] = 30.9;
		
		for (int i = 0 ; i < data.length ; ++i) {
			System.out.println(data[i]);
		}
	}

}
