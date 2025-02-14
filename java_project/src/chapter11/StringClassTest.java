package chapter11;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringClassTest {
	public static void main(String[] args) throws ClassNotFoundException {
		Class strClass = Class.forName("java.lang.String");
		
		// String 클래스의 생성자를 cons에 저장합니다.
		Constructor[] cons = strClass.getConstructors();
		for (Constructor c : cons) {
			System.out.println(c);
		}
		
		System.out.println();
		// String 클래스의 멤버변수가 filels에 저장
		Field[] fields = strClass.getFields();
		for (Field f : fields) {
			System.out.println(f);
		}
		
		System.out.println();
		Method[] methods = strClass.getMethods();
		for (Method m : methods) {
			System.out.println(m);
		}
	}
}
