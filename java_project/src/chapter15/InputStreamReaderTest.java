package chapter15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
	public static void main(String[] args) {
		InputStreamReader isr = null;
		
		try {
			isr = new InputStreamReader
				(new FileInputStream("src/chapter15/reader.txt"));
			int i;
			while ((i = isr.read()) != -1) {
				System.out.println((char)i);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("프로그램종료");
	}
}
