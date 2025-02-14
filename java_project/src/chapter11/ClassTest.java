package chapter11;

// Class 클래스 실습
// 클래스이름 가져오기 (패키지와 함께 화면에 표시됩니다)
public class ClassTest {
	public static void main(String[] args) throws ClassNotFoundException {
		Person person = new Person();
		Class pClass1 = person.getClass();
		System.out.println(pClass1.getName());
		
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		Class pClass3 = Class.forName("chapter11.Person");
		System.out.println(pClass3.getName());
	}
}
