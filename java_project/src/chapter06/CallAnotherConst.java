package chapter06;

public class CallAnotherConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person p = noName.resultItSelf();
		System.out.println(p);
		System.out.println(noName);
	}
}
