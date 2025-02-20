package chapter15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	public static void main(String[] args) {
	
		/*
		 * FileInputStream 클래스는 byte 단위 스트림 입니다.
		 * 한글을 읽어올때는 바르게 가져오지 못합니다.
		 */
		//FileInputStream fis = null;
		FileReader fr = null;

		try {
			/*fis = new FileInputStream("src/chapter15/reader.txt");
			int i;
			while ((i = fis.read()) != -1) {
				System.out.println((char)i);
			}*/
			fr = new FileReader("src/chapter15/reader.txt");
			int i;
			while ((i = fr.read()) != -1) {
				System.out.println((char)i);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("프로그램이 종료됩니다.");
	}
}
