package chapter14;

public class ArrayExceptionHandling {
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		// 예외처리를 사용하는 구분 try~catch
		try {
			// 프로그램이 동작해야하는 부분
			for(int i = 0 ; i <= 5 ; ++i) {
				arr[i] = i;
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
		//} catch (Exception e) {
			// TODO: handle exception
			// 예외가 발생될때 처리하는 부분
			// 배열에 잘못될 인덱스로 접근했을때
			System.out.println(e);
			System.out.println("--예외처리부분입니다.--");
		}
		
		
		System.out.println("프로그램이 종료되었습니다.");
	}
}
