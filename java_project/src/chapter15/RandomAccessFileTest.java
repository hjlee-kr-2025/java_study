package chapter15;

import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) {
		try (RandomAccessFile rf 
				= new RandomAccessFile
				("src/chapter15/random.txt", "rw")) {
			rf.writeInt(100);
			System.out.println("파일 포인터 위치 : "
				+ rf.getFilePointer());
			rf.writeDouble(3.14);
			System.out.println("파일 포인터 위치 : "
					+ rf.getFilePointer());
			rf.writeUTF("안녕하세요");
			// UTF-8 : 한글1글자당 3byte : 15, 마지막Null : 2
			System.out.println("파일 포인터 위치 : "
					+ rf.getFilePointer());
			
			// 포인터를 처음으로 이동합니다.
			rf.seek(0);
			
			int i = rf.readInt();
			double d = rf.readDouble();
			String str = rf.readUTF();
			
			System.out.println("파일 포인터 위치 : "
					+ rf.getFilePointer());
			System.out.println(i);
			System.out.println(d);
			System.out.println(str);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("프로그램종료");
	}
}
