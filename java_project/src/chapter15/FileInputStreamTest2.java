package chapter15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("src/chapter15/input.txt");
			int i;
			while ((i = fis.read()) != -1) {
				System.out.println((char)i);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
	} // end of main
}
