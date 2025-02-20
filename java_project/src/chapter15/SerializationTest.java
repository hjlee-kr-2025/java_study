package chapter15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
// 직렬화 대상 클래스는
// Serializable 인터페이스를 상속받아야 합니다.
class Person implements Serializable {
	private static final long serialVersionID
		= -1503252402544036183L;// 버전관리를 위한정보(상수)
	String name;
	String job;
	/*
	 * Serializable을 상속받으면 모든 멤버변수는 직렬화대상이 됩니다.
	 * 직렬화에서 빼고싶은 변수는 변수선언시 
	 * transient 예약어를 붙이면 됩니다.
	 */
	
	public Person() {}
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	@Override
	public String toString() {
		return name + ", " + job;
	}
}



public class SerializationTest {
	public static void main(String[] args) {
		Person personAhn = new Person("안재용", "대표이사");
		Person personKim = new Person("김철수", "상무이사");
		
		try (FileOutputStream fos
			= new FileOutputStream("src/chapter15/serial.out");
			ObjectOutputStream oos
			= new ObjectOutputStream(fos)){
			oos.writeObject(personAhn);
			oos.writeObject(personKim);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try (FileInputStream fis
			= new FileInputStream("src/chapter15/serial.out");
			ObjectInputStream ois
			= new ObjectInputStream(fis)){
			Person p1 = (Person)ois.readObject();
			Person p2 = (Person)ois.readObject();
			System.out.println(p1);
			System.out.println(p2);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("프로그램종료");
	}	// end of main
}	// end of class






