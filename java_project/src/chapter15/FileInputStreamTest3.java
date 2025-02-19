package chapter15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("src/chapter15/input.txt");
			int i;
			byte[] bs = new byte[10];
			
			while ((i = fis.read(bs)) != -1) {
				for (byte b : bs) {
					System.out.print((char)b);
				}
				System.out.println(": " + i + "바이트 읽음");
				for (int k = 0 ; k < i ; ++k) {
					System.out.print((char)bs[k]);
				}
				System.out.println(": " + i + "바이트 읽음");
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("프로그램종료");
	}// end of main
}
