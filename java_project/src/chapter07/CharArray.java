package chapter07;

public class CharArray {
	// 문자를 저장하는 배열 : 26개방
	// 대문자 A부터 Z까지 순서대로 대입
	// 문자와 아스키코드값을 출력을 하려고 합니다.
	public static void main(String[] args) {
		// alphabets 배열변수에 26개의 방을 만든다.
		char[] alphabets = new char[26];
		char ch = 'A'; // 배열에 넣을 대문자 초기값
		
		// 반복문으로 alphabets변수에 값을 넣습니다.
		for (int i = 0 ; i < alphabets.length ; ++i, ++ch) {
			alphabets[i] = ch;
			
			// ++ch 없이 구현할 때는 아래와 같이 해주면 됩니다.
			// alphabets[i] = (char)(ch + i);
		}
		
		// 문자, 코드값 출력
		for (int i = 0 ; i < alphabets.length ; ++i) {
			System.out.println(
				alphabets[i] + ", " + (int)alphabets[i]);
		}
	}
}
