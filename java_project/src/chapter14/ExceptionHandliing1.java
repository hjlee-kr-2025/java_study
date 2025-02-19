package chapter14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandliing1 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("프로그램이 종료되었습니다.");
	}
}
