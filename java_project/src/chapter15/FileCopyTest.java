package chapter15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {
	public static void main(String[] args) {
		long millisecond = 0;	// 시간측정
		FileInputStream fis = null;		// 파일읽기
		FileOutputStream fos = null;
		// 파일쓰기 -> 읽은데이터를쓰려고합니다.(fis 로 읽은 내용을 복사)
		
		try {
			fis = new FileInputStream("src/chapter15/aaa.zip");
			fos = new FileOutputStream("src/chapter15/copy.zip");
			// 시작시간을 저장 : msec 단위입니다.
			millisecond = System.currentTimeMillis();
			int i;
			while ((i = fis.read()) != -1) {
				//1byte씩 읽어서 저장합니다.
				fos.write(i);
			}
			// 파일이 복사된 시간을 저장
			millisecond = System.currentTimeMillis() - millisecond;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				// 사용한 파일을 닫습니다.
				fos.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("파일이 복사하는 데 걸린 시간은 "
			+ millisecond + "밀리초가 걸렸습니다.");
	}
}
