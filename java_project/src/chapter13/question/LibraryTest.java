package chapter13.question;

import java.util.ArrayList;
import java.util.List;

class Book {
	private String name;
	private int price;
	// 생성자 - 변수2개 초기값 세팅
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}
	// getter 
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	
}

public class LibraryTest {
	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<Book>();
		
		bookList.add(new Book("자바", 25000));
		bookList.add(new Book("파이썬", 15000));
		bookList.add(new Book("안드로이드", 30000));
		
		/*
		 * 원하는 출력결과
		 * 1. 모든 책 가격의 합
		 * 2. 가격이 20000원 이상인 책의 이름을 정렬하여 출력
		 * 3. 스트림을 사용합니다.
		 */
		int total = bookList.stream()
				.mapToInt(c->c.getPrice())
				.sum();
		System.out.println("모든 책 가격의 합 : " + total + "원");
		
		bookList.stream().filter(c->c.getPrice()>=20000)
			.map(c->c.getName()).sorted()
			.forEach(s->System.out.println(s));
	}
}




