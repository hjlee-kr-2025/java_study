package chapter15;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름 : ");
		String name = scanner.nextLine();
		System.out.println(name);
		
		// In class 구현후에 아래내용을 코딩합니다.
		String job = In.getStr("직업");
		System.out.println(job);
		
		/*
		 * 기억하실 내용
		 * Scanner scanner = new Scanner(System.in);
		 * String 변수명 = scanner.nextLine();
		 */
		
		
	}
}
