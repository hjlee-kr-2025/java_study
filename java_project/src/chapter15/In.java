package chapter15;

import java.util.Scanner;

public class In {
	private static Scanner scanner = new Scanner(System.in);
	
	public static String getStr() {
		return scanner.nextLine();
	}
	
	public static String getStr(String msg) {
		System.out.print(msg + " -> ");
		return scanner.nextLine();
	}
}
