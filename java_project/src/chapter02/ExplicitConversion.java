package chapter02;

// 명시적 형 변환
public class ExplicitConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iNum = 10;	// int 자료형 iNum 선언, 10을 넣었습니다.
		byte bNum = (byte)iNum;	// 큰 자료형을 작은 자료형에 넣으려고 하면
							// error가 발생합니다.
							// 이때는 형변환을 하겠다고 자바에게 알려줘야
							// 합니다. ==> 명시적 형 변환
							// "강제캐스팅" 한다.
		System.out.println(iNum);
		System.out.println(bNum);
		// 이클립스에서 한줄 복사하려면 복사할 내용이 있는 줄로가서
		// [ctrl]+[alt]+[아래화살표] 를 사용하시면 됩니다
		int iNum2 = 1000;
		byte bNum2 = (byte)iNum2;
		System.out.println(iNum2);
		System.out.println(bNum2);
		// 1000
		// -24
		
		// 2진수로 보는 숫자
		/* 2진수 1byte -> 8bit
		 * 0000 0001 -> 십진수 1
		 * 0100 0000 -> 십진수 64
		 * 0111 1111 -> 십진수 127
		 * 1000 0000 -> 십진수 -128
		 * 1000 0001 -> -127
		 * 1111 1111 -> -1
		 * 0000 0000 -> 0
		 * 
		 */
		
		char ch1 = 'A';	// 문자형 char자료형 ch1을 선언하고 'A' 값을 넣었습니다.
		// ch1에 저장된 코드값을 화면에 출력하고 싶다면?
		System.out.println(ch1);
		System.out.println((int)ch1);	// 숫자형으로 바꿔서 화면에 출력하세요
										// ch1에 저장된 코드값(숫자)가
										// 출력됩니다.
		
		int ch2 = 67;
		System.out.println(ch2);
		System.out.println((char)ch2);	// 문자형으로 바꿔서 화면에 출력하세요
		
		double dNum1 = 1.2;
		float fNum2 = 0.9f;	// float자료형에 실수를 넣을때는 숫자뒤에 f를 붙입니다.
		
		// dNum1->정수형으로 변경, fNum2->정수형으로 변경
		// 변경된 정수형 2개를 더함
		// 더한값을 iNum3에 넣음
		int iNum3 = (int)dNum1 + (int)fNum2;
		// dNum1과 fNum2를 더함(실수), 더한값을 정수형으로 변경
		// 변경된 정수형값을 iNum4에 넣음
		int iNum4 = (int)(dNum1 + fNum2);
		System.out.println(iNum3);
		System.out.println(iNum4);
		// 실수형이 정수형으로 변경될때 소수점이하부분을 버리게 됩니다.
	}

}
