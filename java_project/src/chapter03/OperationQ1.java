package chapter03;

public class OperationQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int 자료형 변수이름 myAge, 초기값 23
		// 대입연산자 : '='
		int myAge = 23;
		// int 자료형 변수이름 teacherAge, 초기값 38
		// int -> 정수형, 4byte, java(정수자료형의 기본type)
		int teacherAge = 38;
		
		// boolean 자료형 변수이름 result, (myAge > 25) 비교연산자를
		// 사용한 값을 초기값으로 주었습니다.
		// boolean (논리형) ; true , false (2가지의 값을 가지고 있습니다)
		boolean result = (myAge > 25);
		// 위 코드를 실행 후 result = false;
		System.out.println(result);
		
		// 비교연산자 '<=' : 작거나 같다
		System.out.println(myAge <= 25);	// true
		// 비교연산자 '==' : 같다
		System.out.println(myAge == teacherAge);	// false
		
		// 삼항연산자(조건연산자)
		char ch;	// 문자형 변수 ch를 선언합니다.
		ch = (myAge > teacherAge) ? 'T' : 'F';
		System.out.println(ch);	// F
	}

}
