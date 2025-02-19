package chapter15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		
		try {
			// 아래와 같이 생성하면 화일이 새로만들어 집니다.
			//fos = new FileOutputStream("src/chapter15/output.txt");
			// 아래와 같이 생성하면 화일이 없으면 새로만들어지고,
			// 있으면 기존내용에 추가해서 사용합니다.
			fos = new FileOutputStream("src/chapter15/output2.txt", true);
			fos.write('D');
			fos.write(65);//A
			fos.write(66);//B
			fos.write(67);//C
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("프로그램이 종료됩니다.");
	} // end of main
}
