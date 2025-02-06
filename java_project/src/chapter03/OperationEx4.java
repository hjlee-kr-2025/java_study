package chapter03;

// 삼항연산자 - 조건연산
public class OperationEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fatherAge = 45;
		int motherAge = 47;
		
		char ch; // 문자형변수 ch를 선언
		ch = (fatherAge > motherAge) ? 'T' : 'F';
		// fatherAge가 motherAge보다 크면 ch = 'T'
		// 크지않으면 ch = 'F'
		System.out.println(ch);
	}

}
