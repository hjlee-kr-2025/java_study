package chapter11;

class Book {
	// 2개의 멤버변수
	int bookNumber;
	String bookTitle;
	
	// 매개변수가 2개를 사용하는 생성자
	// 자동으로 생성자를 만들어 봅시다.
	// 1. [Shift]+[Alt]+[S]
	// 2. Generate Constructor using Field(멤버변수)
	// 3. 사용할 매개변수를 체크하고 Generate 버튼을 클릭합니다.
	public Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

	
	// 자동으로 재정의 매서드를 만들어 봅니다.
	// 1. [Shift]+[Alt]+[S]
	// 2. Override/implement Methods
	// 3. 재정의 할 메서드 선택 -> OK버튼클릭
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (
			"책넘버: " + bookNumber
			+ ", 책제목: " + bookTitle
		);
	}
	
	
}

public class ToStringEx {
	public static void main(String[] args) {
		Book book1 = new Book(200, "개미");
		
		System.out.println(book1);
		// Object 클래스에 있는 toString() 메서드를 사용
		System.out.println(book1.toString());
		
		// 우리가 사용하는 모든 클래스는 Object클래스를 상속받아
		// 구현되어있습니다. Object클래스안에 구현된
		// 메서드를 자유롭게 사용할 수 있는 것입니다.
	}
}
