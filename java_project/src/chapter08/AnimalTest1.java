package chapter08;

import java.util.ArrayList;

// 문서 하나에 public으로 선언된 클래스가 하나
// public으로 선언한 클래스이름을 화일이름으로 사용합니다.

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}
class Human extends Animal {
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("사람이 두발로 걷습니다.");
	}
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
}

class Eagle extends Animal {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("독수리가 하늘을 납니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
	}
	
}

public class AnimalTest1 {
	ArrayList<Animal> aniList = new ArrayList<Animal>();
	
	public static void main(String[] args) {
		AnimalTest1 aTest = new AnimalTest1();
		aTest.addAnimal();
		System.out.println("==== 다운캐스팅 ====");
		aTest.testCasting();
		
	}	// end of main
	
	public void addAnimal() {
		aniList.add(new Human());
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		
		for(Animal ani : aniList) {
			ani.move();
		}
	}
	
	// 다운캐스팅을 위한 메서드
	public void testCasting() {
		for(Animal ani : aniList) {
			// ani 를 Human 으로 생성했냐?
			if (ani instanceof Human) {
				Human h = (Human)ani;
				h.readBook();
			}
			else if (ani instanceof Tiger) {
				Tiger t = (Tiger)ani;
				t.hunting();
			}
			else if (ani instanceof Eagle) {
				Eagle e = (Eagle)ani;
				e.flying();
			}
			else {
				System.out.println("지원하지 않는 자료형입니다.");
			}
		}
	}
	// 다운캐스팅
	// 부모클래스로 선언한후 자녀클래스로 생성한 변수를 가지고
	// 자녀클래스에서만 구연된 함수나 변수를 사용하고자 할때
	// 자녀클래스로 생성된 것을 확인할때 instanceof 예약어를 사용합니다.
	/*
	 * Animal ani = new Human();
	 * if (ani instanceof Human) {
	 * 		// ani 를 Human으로 생성했을 때 이곳이 실행됩니다.
	 * 		Human h = (Human)ani;
	 * }
	 */
}
