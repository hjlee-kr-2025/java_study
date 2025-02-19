package exp250219;

// 인터페이스
// 추상메서스만 있는 클래스
// 메서드 선언시 abstract 예약어를 생략할 수 있습니다.
interface Service {
	// 실행할 메서드 선언
	public Object service(Object obj) throws Exception;
	// 리턴타입과 매개변수를 Object로 선언하면
	// 모든자료형을 다 사용할 수 있습니다.
}

// 클래스가 인터페이스를 상속받을때 implements 예약어를 사용합니다.
// 인터페이스에 선언된 메서드를 구현해서 사용합니다.
class AddService implements Service {
	
	// static 변수는 생성과 관계 없이 사용할 수 있습니다.
	public static int sum = 0;

	@Override
	public Object service(Object obj) throws Exception {
		// TODO Auto-generated method stub
		sum = sum + (int)obj;
		return sum;
	}
	
}


public class ExpTest3 {
	public static void main(String[] args) throws Exception {
		// 부모클래스로 선언하고 자녀클래스로 생성했습니다.
		Service addFunction = new AddService();
		// main메서드에서만 사용되는 지역변수
		int sum;
		
		addFunction.service(10);
		addFunction.service(20);
		addFunction.service(30);
		// Object 자료형을 int에 넣기위해 강제캐스팅 했습니다.
		sum = (int) addFunction.service(40);
		
		// static 변수는 클래스이름으로 접근하여 사용합니다.
		System.out.println(AddService.sum);
		System.out.println(sum);
	}
}
