package chapter15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		
		try {
			//fos = new FileOutputStream("src/chapter15/output.txt");
			// => 파일이름만 있을때는 생성할때마다 파일을 새로만들어줍니다.
			// => 기본파일에 데이터를 추가하려면?
			// 2번째 매개변수값으로 true를 넘겨주면 기존파일뒤에 데이터가 추가됩니다.
			fos = new FileOutputStream("src/chapter15/output.txt", true);
			fos.write(65);//A
			fos.write(66);//B
			fos.write(67);//C
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
