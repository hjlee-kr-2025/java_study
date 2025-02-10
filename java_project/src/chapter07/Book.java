package chapter07;

public class Book {
	private String bookName;	// 책이름
	private String author;		// 저자
	
	// 생성자
	public Book() {};	// 기본생성자
	
	// 책이름, 저자이름을 가지는 생성자
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}

	// getter
	public String getBookName() {
		return bookName;
	}

	public String getAuthor() {
		return author;
	}

	// setter
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	// 책이름과 저자를 화면에 표시하는 함수
	public void showInfo() {
		System.out.println(bookName + ", " + author);
	}
	
}
