package chapter07;

public class ArrayTest3 {
	public static void main(String[] args) {
		double[] data = new double[5];
		int size = 0;	// 데이터가 들어간 방을 체크 (유효데이터)
		
		data[0] = 10.0;
		++size; // size = 1;
		data[1] = 20.5;
		++size;	// size = 2;
		data[2] = 30.9;
		++size;	// size = 3;
		
		for (int i = 0 ; i < size ; ++i) {
			System.out.println(data[i]);
		}
	}
}
