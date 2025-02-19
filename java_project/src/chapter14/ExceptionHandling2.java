package chapter14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling2 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a.txt");
			System.out.println("정상처리되었습니다.");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// try 또는 catch 가 끝나고 실행되는 블럭
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("finally: 여기는 항상 수행됩니다.");
		}
		System.out.println("프로그램이 종료됩니다.");
	}
}
