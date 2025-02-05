package chapter02;

public class CharacterEx1 {

	// 변수 자료형 (문자형) - char(2byte) - 글자하나를 넣을수 있습니다.
	// 변수에 값을 대입시 작은따옴표(') 안에 글자하나를 적어서 넣습니다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch1 = 'A';	// 'A' 라는 글자를 ch1에 담았습니다.
		System.out.println(ch1);	// ch1에는 코드값 65가 
		// 담겨져 있습니다.
		// 화면에 출력할때 자료형을 보고, 문자형자료형이면 코드값에 맞는
		// 문자로 화면에 출력됩니다.
		System.out.println((int)ch1); // 문자형을 정수형으로 변경했기때문에
		// 숫자가 화면에 출력됩니다.
		
		char ch2 = 66;	// 코드값 66 -> 'B'
		System.out.println(ch2);
		
		int ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3);
	}

}
