package chapter02;

//변수2개를 선언해서 10(정수형), 2.0(실수형)을 대입하고
//두 변수의 사칙연산(+, -, *, /) 결과를 정수로 출력
public class Chapter02Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iNum = 10;
		double dNum = 2.0;
		
		System.out.println(iNum + (int)dNum);
		System.out.println(iNum - (int)dNum);
		System.out.println(iNum * (int)dNum);
		System.out.println(iNum / (int)dNum);
		// 형 변환에 대한 이해의 목적이 있습니다.
		// 실수형 변수를 정수형으로 형 변환하여 계산하였습니다.
		
		char ch1 = '\uAE00';	//AE00 -> '글' 에대한 코드값
		System.out.println(ch1);
	}

}
