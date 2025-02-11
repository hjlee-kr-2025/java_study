package chapter08;

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
	
}

class Tiger extends Animal {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
}

class Eagle extends Animal {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("독수리가 하늘을 납니다.");
	}
	
}

public class AnimalTest1 {

	public static void main(String[] args) {
		AnimalTest1 aTest = new AnimalTest1();
		// ===> 여기서는 moveAnimal(Animal animal) 함수를
		// 사용할 수 있도록 해줍니다.
	/*	aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(new Eagle());*/
		Animal human = new Human();
		Animal tiger = new Tiger();
		Animal eagle = new Eagle();
		aTest.moveAnimal(human);
		aTest.moveAnimal(tiger);
		aTest.moveAnimal(eagle);
		
	}	// end of main
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}
}
