package chapter07;

// 깊은 복사 - 값 자체를 복사하는 것
public class ObjectCopy3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] library1 = new Book[3];
		Book[] library2 = new Book[3];
		
		library1[0] = new Book("태백산백", "조정래");
		library1[1] = new Book("데미안", "헤르만 헤세");
		library1[2] = new Book("어떻게 살 것인가", "유시민");
		
		// 값을 복사하기전 생성을 해줘야 합니다.
		library2[0] = new Book();
		library2[1] = new Book();
		library2[2] = new Book();
		/*
		 * for (int i = 0 ; i < library2.length ; ++i) {
		 * 		library2[i] = new Book();
		 * }
		 */
		
		// 데이터 복사 (깊은복사)
		for (int i = 0 ; i < library1.length ; ++i) {
			library2[i].setBookName(library1[i].getBookName());
			library2[i].setAuthor(library1[i].getAuthor());
		}
		
		// library2 의 데이터 확인
		for (int i = 0 ; i < library2.length ; ++i) {
			library2[i].showInfo();
		}
		
		library2[0].setBookName("나목");
		library2[0].setAuthor("박완서");
		
		System.out.println("=== library1 ===");
		for (int i = 0 ; i < library1.length ; ++i) {
			library1[i].showInfo();
		}
		System.out.println("=== library2 ===");
		for (int i = 0 ; i < library2.length ; ++i) {
			library2[i].showInfo();
		}
		// 참조주소확인
		for (int i = 0 ; i < library1.length ; ++i) {
			System.out.println(library1[i]);
			System.out.println(library2[i]);
		}
		
	}

}
