package com.shopdb.util;

import java.util.Scanner;

// 키보드 입력을 위한 클래스
public class In {
	private static Scanner scanner = new Scanner(System.in);
	
	public static String getStr() {
		return scanner.nextLine();
	}
	
	public static String getStr(String msg) {
		System.out.print(msg + " -> ");
		return getStr();
	}
	
	public static Integer getInt(String msg) {
		while (true) {
			try {
				return Integer.parseInt(getStr(msg));
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("숫자만 입력하셔야 합니다.");
			}
		}
	}
}
