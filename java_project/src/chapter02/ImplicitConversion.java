package chapter02;

public class ImplicitConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 자바(JAVA) 변수자료형(선언)
		// 정수형: byte(1), short(2), int(4,기본), long(8)
		// 문자형: char(2)
		// 실수형: float(4), double(8,기본)
		// 논리형: boolean : true, false
		// 변수: 값을 변경해서 사용할 수 있는 것
		// 상수: 값을 정하면 변경할 수 없는 것
		// 상수로 선언하려면 변수로 선언한 것 앞에 final 예약어 붙입니다.
		byte bNum = 10;	// byte자료형 bNum을 만들어 10을 넣었습니다.
		int iNum = bNum;	// int자료형 iNum을 만들고 bNum에 
							// 있는 값을 복사해서 넣었습니다.
		// 작은방에 넣은값을 큰방에 넣을 수 있습니다.
		// 이때 형변환(캐스팅)이 일어납니다.
		// 여기서는 자동으로 형변환이 일어났습니다. -> 묵시적 형변환
		System.out.println(bNum);// bNum에 들어있는 값을 화면에 출력
		System.out.println(iNum);// iNum에 들어있는 값을 화면에 출력
		// 정수형에서 자동으로 형변환이 일어나는 경우
		// byte값-> short, int, long
		// short값 -> int, long
		// int값 -> long
		
		int iNum2 = 20;	// int자료형 iNum2선언 20을 넣었습니다.
		float fNum = iNum2;	// float자료형 fNum선언하고 iNum2에
							// 들어있는 값을 복사했습니다.
		// 정수형 -> 실수형으로 자동형변환이 일어납니다.
		System.out.println(iNum2);
		System.out.println(fNum);
		
		double dNum;	// double자료형 dNum 선언했습니다.
		dNum = fNum + iNum2;	//fNum+iNum2 -> 실수형으로 계산
		
		System.out.println(dNum);
	}

}
