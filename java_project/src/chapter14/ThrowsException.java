package chapter14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

// throws 를 사용해서 예외처리를 미룰수 있는것을 설명하는 클래스

public class ThrowsException {

	// 메서드
	// loadClass() 는
	// 파일을 사용할 수 있도록 하는 부분
	// 클래스를 찾아서 사용할 수 있도록 하는 부분
	public Class loadClass(String fileName, String className)
		throws FileNotFoundException, ClassNotFoundException {
		// 파일이름으로 파일을 사용할 수 있도록 만드는 부분
		FileInputStream fis = new FileInputStream(fileName);
		// ==> 이때 파일이 없으면 FileNotFoundException 이 발생이 되는데
		// 여기서는 try~catch 대신에 throws를 사용하여 처리를 미루겠습니다.
		
		// 클래스이름으로 클래스를 찾아서 사용할 수 있도록 만들어 주는 부분
		Class c = Class.forName(className);
		// ==> 이때 클래스가 존재하지 않으면 ClassNotFoundException 가
		// 발생됩니다. 이것도 미루겠습니다.
		return c;// Class자료형 리턴
	}
	
	public static void main(String[] args) {
		ThrowsException test = new ThrowsException();
		try {
			test.loadClass("a.txt", "java.lang.String");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// 예외는 다 이곳으로....
			e.printStackTrace();
		}
		/*
		 * catch (FileNotFoundException | ClassNotFoundException e) {
		 * }
		 */
	}
}
