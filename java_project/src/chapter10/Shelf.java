package chapter10;

import java.util.ArrayList;

public class Shelf {
	protected ArrayList<String> shelf;
	
	// 생성자
	public Shelf() {
		shelf = new ArrayList<String>();
	}

	// shelf 변수의 getter
	public ArrayList<String> getShelf() {
		return shelf;
	}
	
	// shelf안에 저장된 데이터 개수를 리턴합니다.
	public int getCount() {
		return shelf.size();
	}
	
}
