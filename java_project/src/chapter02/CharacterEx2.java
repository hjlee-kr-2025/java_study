package chapter02;

public class CharacterEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch1 = '한';
		char ch2 = '\uD55C';// \uD55C -> 유니코드16진수로
		// 프로그램개발에서 문자변환 코드로 유니코드를 많이 사용합니다.
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println((int)ch1);
	}

}
