package chapter15;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		File file = new File("src/chapter15/newFile.txt");
		//=> file 변수 사용하기 위해 준비
		// : 실제파일이 생성된것은 아닙니다.
		try {
			file.createNewFile();
			// ==> 위명령이 실행되면 실제로 화일이 생성됩니다.
			// File 클래스와 관련된 메서드를 소개합니다.
			// 파일인지를 확인해서 return 하는 메서드
			System.out.println("파일입니까? : " + file.isFile());
			// 디렉토리
			System.out.println("디렉토리입니까? : " + file.isDirectory());
			// 파일이름을 알려주는
			System.out.println("화일이름 : " + file.getName());
			// 파일 절대 경로를 알려주는
			System.out.println("화일절대경로 : " + file.getAbsolutePath());
			// 파일 경로를 알려주는
			System.out.println("화일경로 : " + file.getPath());
			System.out.println(file.canRead());
			System.out.println(file.canWrite());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
