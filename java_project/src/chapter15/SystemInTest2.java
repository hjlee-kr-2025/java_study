package chapter15;

import java.io.IOException;

public class SystemInTest2 {

	public static void main(String[] args) {
		System.out.println("알파벳 여러개 쓰고 [Enter]를 누르세요.");
		
		int i;
		try {
			while ((i = System.in.read()) != '\n') {
				// '\n' => [Enter] 키를 의미합니다.
				// Enter키값이 들어오기 전까지 반복합니다.
				System.out.print((char)i);
				// print() 메서드는 데이터만 출력
				// println() 메서느는 데이터 + enter
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
