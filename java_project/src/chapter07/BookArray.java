package chapter07;

public class BookArray {
	// Book 클래스 배열을 만들어 줄것입니다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] library = new Book[5];
		// 클래스배열에 new를 사용해 클래스방을 만들었다고 해서
		// 생성이 된것은 아니다. 5개의 빈방만 만들어 준것입니다.
		library[0] = new Book("태백산백", "조정래");
		library[1] = new Book("데이안", "헤르만 헤세");
		library[2] = new Book("어떻게 살 것인가", "유시민");
		library[3] = new Book("토지", "박경리");
		library[4] = new Book("어린왕자", "생떽쥐베리");
		
		// 책정보출력(책이름, 저자)
		for (int i = 0 ; i < library.length ; ++i) {
			library[i].showInfo();
		}
		
		for (int i = 0 ; i < library.length ; ++i) {
			System.out.println(library[i]);
		}
	}
}
