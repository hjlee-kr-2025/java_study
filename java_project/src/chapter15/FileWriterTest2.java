package chapter15;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest2 {
	public static void main(String[] args) {
		/*
		 * try (이곳에 파일을 여는 변수를 선언하고 생성하면) {
		 * }
		 * catch (Exception e) {
		 * 	  e.printStackTrace();
		 * }
		 * ==> try~catch 가 끝나면 자동으로 파일을 닫아줍니다.
		 */
		try (FileWriter fw = new FileWriter("src/chapter15/writer.txt")) {
			fw.write('A');
			fw.write("안녕하세요. 자바입니다.");
			fw.write(66);//B
			System.out.println("end");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
	}
}
