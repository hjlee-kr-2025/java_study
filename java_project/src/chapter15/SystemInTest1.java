package chapter15;

import java.io.IOException;

// 입출력 (표준입출력)
// System 클래스
/*
 * static PrintStream out;
 * static InputStream in;
 * static OutputStream err; 
 */
		
public class SystemInTest1 {
	public static void main(String[] args) {
		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요.");
		int i;
		try {
			i = System.in.read();// 문자하나를 받습니다.
			System.out.println(i);// 아스키코드값 출력
			System.out.println((char)i);// 문자 출력
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}





