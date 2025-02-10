package chapter07;

import java.util.ArrayList;
// ===> 다른 패키지에 있는 클래스를 불러올때는 import 를 사용합니다.
// 예외 => java.lang. 에 구현되어 있는 클래스는 import하지 않아도 
// 사용할 수 있습니다.

public class ArrayListTest {
	// ArrayList 클래스 실습
	// ArrayList<E> 배열이름 = new ArrayList<E>();
	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<Book>();
		
		library.add(new Book("태백산맥", "조정래"));
		library.add(new Book("데미안", "헤르만 헤세"));
		library.add(new Book("어떻게 살 것인가", "유시민"));
		library.add(new Book("토지", "박경리"));
		library.add(new Book("어린왕자", "생떽쥐베리"));
		
		System.out.println("=== 일반 for 문으로 출력 ===");
		for (int i = 0 ; i < library.size() ; ++i) {
			
			Book book = library.get(i);
			book.showInfo();
		}
		
		System.out.println("=== 향상된 for 문으로 출력 ===");
		for (Book book : library) {
			book.showInfo();
		}
		
	}
}
