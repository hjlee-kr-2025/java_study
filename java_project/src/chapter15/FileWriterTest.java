package chapter15;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	public static void main(String[] args) {
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("src/chapter15/writer.txt");
			fw.write('A');
			fw.write("안녕하세요. 자바입니다.");
			fw.write(66);//B
			System.out.println("end");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("프로그램 종료");
	}
}
