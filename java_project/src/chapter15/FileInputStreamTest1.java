package chapter15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			// input.txt를 찾아서 있으면 사용할 수 있도록
			// 만들어주는 명령
			// 프로젝트폴더가 시작점입니다.
			fis = new FileInputStream("src/chapter15/input.txt");
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NullPointerException e) {
				e.printStackTrace();
			}
		}
		System.out.println("프로그램 종료");
	}
}
